package pl.rpf.learningByDoing.models.people;

import java.util.TreeSet;

import pl.rpf.learningByDoing.models.common.User;
import pl.rpf.learningByDoing.services.interfaces.RestaurantActivities;

public class Employee extends User implements RestaurantActivities {
	
	private Integer salary;
	
	private TreeSet<String> duties;
		
	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public TreeSet<String> getDuties() {
		return duties;
	}

	public void setDuties(TreeSet<String> duties) {
		this.duties = duties;
	}
	
	@Override
	public void drinkYaCoffee() {
		System.out.println("Here is your tea slave!");
	}

	@Override
	public String eat(int hungerLevel) {
		if (salary > 2000) {
			return "Whoa! I can afford bread with butter!";
		} else {
			if (hungerLevel > 10) {
				return "Looks like I'm eating shit again...";
			} else return "I'm not hungry after all...";
		}
	}

}
