package co.grandcircus.famouslab;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.CompleteInventor;
import co.grandcircus.famouslab.model.CompleteInventorComparator;
import co.grandcircus.famouslab.model.TinyInventor;
import co.grandcircus.famouslab.model.TinyInventorComparator;

@Controller
public class HallOfFameController {
	
	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView showTinyList() {
		List<TinyInventor> tinies = apiService.findAllTinyInventors();
		Collections.sort(tinies, new TinyInventorComparator());
		ModelAndView mav = new ModelAndView("index", "tiny", tinies);
		return mav;
	}
	
	@RequestMapping("/complete")
	public ModelAndView showCompleteList() {
		List<CompleteInventor> completes = apiService.findAllCompleteInventors();
		Collections.sort(completes, new CompleteInventorComparator());
		return new ModelAndView("complete", "complete", completes);
	}
}
