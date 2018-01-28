package pl.rpf.learningByDoing.services.interfaces;

public interface RestaurantActivities {

	default public void drinkYaCoffee() {
		System.out.println("Here is your coffee sir!");
	}
	
	public String eat(int hungerLevel);
	
}
