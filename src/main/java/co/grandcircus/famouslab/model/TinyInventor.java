package co.grandcircus.famouslab.model;

public class TinyInventor {

	private String name;
	private String invented;
	private Integer year;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvented() {
		return invented;
	}
	public void setInnovation(String invented) {
		this.invented = invented;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Invented [name=" + name + ", invented=" + invented + ", year="
				+ year + "]";
	}
	
	
}
