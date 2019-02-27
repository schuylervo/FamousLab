package co.grandcircus.famouslab.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InventorsResponse {

	//@JsonProperty("complete")
	private List<CompleteInventor> complete;
	//@JsonProperty("tiny")
	private List<TinyInventor> tiny;
	
	public List<CompleteInventor> getComplete() {
		return complete;
	}
	public void setComplete(List<CompleteInventor> complete) {
		this.complete = complete;
	}
	public List<TinyInventor> getTiny() {
		return tiny;
	}
	public void setTiny(List<TinyInventor> tiny) {
		this.tiny = tiny;
	}
	
	
}
