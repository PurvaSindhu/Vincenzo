package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.bridge.SevenHillsSuperMarket;
import com.xworkz.supermarket.object.Shop;

public class MarketRunner {
	
	public static void main(String [] args) {
		SevenHillsSuperMarket hills = new SevenHillsSuperMarket();
		Shop shop = new Shop();
		shop.getPlace();
	}

}
