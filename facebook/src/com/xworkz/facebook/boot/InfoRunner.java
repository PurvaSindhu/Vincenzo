package com.xworkz.facebook.boot;

import com.xworkz.facebook.thing.FaceBookInfo;

public class InfoRunner {
	
	public static void main(String[] args) {
		FaceBookInfo info = new FaceBookInfo();
		info.read("sindhu", 2, false, "sindhu");
	}

}
