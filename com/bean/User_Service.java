package com.bean;

public class User_Service {
	public long UcService, EUser;

	//Default Constructor
	public User_Service() {
		super();
	}

	//Parameterised Constructor
	public User_Service(long ucService, long eUser) {
		super();
		UcService = ucService;
		EUser = eUser;
	}

	//Getter Setter
	public long getUcService() {
		return UcService;
	}

	public void setUcService(long ucService) {
		UcService = ucService;
	}

	public long getEUser() {
		return EUser;
	}

	public void setEUser(long eUser) {
		EUser = eUser;
	}
	
	
}
