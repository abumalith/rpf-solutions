package pl.rpf.learningByDoing.models.people;

import pl.rpf.learningByDoing.models.common.User;

public class Client extends User {
	
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
	
	

}
