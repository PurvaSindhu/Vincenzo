package com.xworkz.facebook.Dto;

public class FaceBookDto {
	
	private String name;
	private int numberOfAccounts;
	private boolean picsUploaded;
	private String facebookID;
	
	public FaceBookDto(String name, int numberOfAccounts, boolean picsUploaded, String facebookID) {
		super();
		this.name = name;
		this.numberOfAccounts = numberOfAccounts;
		this.picsUploaded = picsUploaded;
		this.facebookID = facebookID;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}


	public void setNumberOfAccounts(int numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}


	public boolean isPicsUploaded() {
		return picsUploaded;
	}


	public void setPicsUploaded(boolean picsUploaded) {
		this.picsUploaded = picsUploaded;
	}


	public String getFacebookID() {
		return facebookID;
	}


	public void setFacebookID(String facebookID) {
		this.facebookID = facebookID;
	}


	@Override
	public String toString() {
		return "FaceBookDto [name=" + name + ", numberOfAccounts=" + numberOfAccounts + ", picsUploaded=" + picsUploaded
				+ ", facebookID=" + facebookID + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facebookID == null) ? 0 : facebookID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfAccounts;
		result = prime * result + (picsUploaded ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaceBookDto other = (FaceBookDto) obj;
		if (facebookID == null) {
			if (other.facebookID != null)
				return false;
		} else if (!facebookID.equals(other.facebookID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfAccounts != other.numberOfAccounts)
			return false;
		if (picsUploaded != other.picsUploaded)
			return false;
		return true;
	}
	
	

}
