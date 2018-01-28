package pl.rpf.learningByDoing.services.controllers;

import java.util.TreeSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.rpf.learningByDoing.models.people.Client;
import pl.rpf.learningByDoing.models.people.Employee;

@RestController
public class RestaurantController {
	
	@GetMapping("/client")
	public String mainClient() {
		Client c = new Client();
		c.setName("Joanna");
		c.setSurname("Kutasiak");
		c.setVip(true);
		
		c.drinkYaCoffee();
		
		//
		return "{'fullname':'" + c.whoAreYou() + "', 'food':'" + c.eat(11) +"'}";
	}
	
	@GetMapping("/employee")
	public String mainEmployee() {
		Employee e = new Employee();
		e.setName("Janusz");
		e.setSurname("Prącipski");
		e.setSalary(1200);
		
		TreeSet<String> duties = new TreeSet<>();
		duties.add("wait");
		duties.add("clean");
		duties.add("compliment your boss");
		
		e.setDuties(duties);
		int i = 1;
		for (String s : e.getDuties()) {
			System.out.println("duty nr " + i + "is: " + s);
			i++;
		}
		
		e.drinkYaCoffee();
		
		return "{'fullname':'" + e.whoAreYou() + "', 'food':'" + e.eat(12) +"'}";
	}
	

}
