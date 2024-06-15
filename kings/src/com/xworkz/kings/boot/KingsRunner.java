package com.xworkz.kings.boot;

import com.xworkz.kings.childClass.Akbar;
import com.xworkz.kings.childClass.KrishnaDevaraya;

public class KingsRunner {
	public static void main(String[] args) {
		//hirarical inhertance
		Akbar name = new Akbar();
		KrishnaDevaraya krishna = new KrishnaDevaraya();
		
		krishna.kingName();
		name.kingName();
	}

}
