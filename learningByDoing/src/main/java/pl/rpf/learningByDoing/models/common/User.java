package pl.rpf.learningByDoing.models.common;

public abstract class User {

	private String name;
	
	private String surname;
	
	public String whoAreYou() {
		return this.name + " " + this.surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
