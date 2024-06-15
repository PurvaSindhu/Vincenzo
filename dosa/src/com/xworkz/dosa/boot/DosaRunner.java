package com.xworkz.dosa.boot;

import com.xworkz.dosa.childClass.MasalaDosa;
import com.xworkz.dosa.childClass.RagiDosa;

public class DosaRunner {
	
	public static void main(String[] args) {
		//multiple Inheritance
		RagiDosa dosa = new RagiDosa();
		MasalaDosa dosa2 = new MasalaDosa();
		
		dosa.numberOfDosa();
		dosa.name();
		dosa2.numberOfDosa();
		dosa2.name();
		
		}

}
