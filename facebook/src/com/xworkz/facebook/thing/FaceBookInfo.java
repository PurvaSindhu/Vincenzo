package com.xworkz.facebook.thing;

import com.xworkz.facebook.Dto.FaceBookDto;

public class FaceBookInfo {

	public void read(String names, int numberOfAccount, boolean uploaded, String id) {
		FaceBookDto bookDto = new FaceBookDto(id, numberOfAccount, uploaded, id);
		bookDto.getName();
		bookDto.getFacebookID();
		bookDto.getNumberOfAccounts();
		bookDto.isPicsUploaded();
	}

}
