package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.famouslab.model.TinyInventor;
import co.grandcircus.famouslab.model.CompleteInventor;
import co.grandcircus.famouslab.model.InventorsResponse;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();
	
	
	public List<CompleteInventor> findAllCompleteInventors() {
		
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		InventorsResponse complete = restTemplate.getForObject(url, InventorsResponse.class);

		return complete.getComplete();
	}
	
	public List<TinyInventor> findAllTinyInventors() {
		
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		InventorsResponse tiny = restTemplate.getForObject(url, InventorsResponse.class);

		return tiny.getTiny();
	}
	
}
