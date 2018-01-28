package pl.rpf.learningByDoing.services.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.rpf.learningByDoing.models.people.Client;

@RestController
public class RestaurantController {
	
	@GetMapping("/")
	public String mainPage() {
		Client c = new Client();
		c.setName("Joanna");
		c.setSurname("Kutasiak");
		c.setVip(true);
		
		return "{'fullname':'" + c.whoAreYou() + "'}";
	}

}
