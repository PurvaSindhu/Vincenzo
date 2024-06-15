package com.xworkz.supermarket.object;

import com.xworkz.supermarket.bridge.SevenHillsSuperMarket;

public class Shop {
	
	public SevenHillsSuperMarket place;
	
	public void place (SevenHillsSuperMarket place) {
		this.place=place;
	}

	public SevenHillsSuperMarket getPlace() {
		return place;
	}

	public void setPlace(SevenHillsSuperMarket place) {
		this.place = place;
	}
	
	

}
