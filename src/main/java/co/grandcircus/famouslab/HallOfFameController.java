package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.CompleteInventor;
import co.grandcircus.famouslab.model.TinyInventor;

@Controller
public class HallOfFameController {
	
	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView showTinyList() {
		List<TinyInventor> tinies = apiService.findAllTinyInventors();
		ModelAndView mav = new ModelAndView("index", "tiny", tinies);
		return mav;
	}
	
	@RequestMapping("/complete")
	public ModelAndView showCompleteList() {
		List<CompleteInventor> completes = apiService.findAllCompleteInventors();
		return new ModelAndView("complete", "complete", completes);
	}
}
