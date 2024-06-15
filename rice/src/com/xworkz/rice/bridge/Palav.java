package com.xworkz.rice.bridge;

import com.xworkz.rice.thing.Rice;
import com.xworkz.rice.thing.Spices;

public class Palav implements Rice ,Spices{

	@Override
	public void spices() {
		System.out.println("the number of required spices is");
	}

	@Override
	public void rice() {
		System.out.println("the required quantity of rice is");
		
	}

}
