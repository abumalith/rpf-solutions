package pl.rpf.learningByDoing.models.people;

import pl.rpf.learningByDoing.models.common.User;
import pl.rpf.learningByDoing.services.interfaces.RestaurantActivities;

public class Client extends User implements RestaurantActivities {
	
	private Boolean vip;
	
	private Integer discount;

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	@Override
	public String eat(int hungerLevel) {
		
		if (vip) {
			if (hungerLevel > 10) {
				return "I'll have some sea food!";
			} else {
				return "I'll have gluten free bread with the most vegan dish you have!";
			}
		} else {
			return "I'm not a VIP so I can eat shit...";
		}
	}
	
	

}
