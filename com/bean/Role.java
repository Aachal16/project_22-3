package com.bean;

public class Role {
	public String RName;
	public long Rcode;
	
	//Default Constructor
	public Role() {
		super();
	}
	
	//Parameterised Constructor
	public Role(String rName, long rcode) {
		super();
		RName = rName;
		Rcode = rcode;
	}

	//Getter Setter
	public String getRName() {
		return RName;
	}

	public void setRName(String rName) {
		RName = rName;
	}

	public long getRcode() {
		return Rcode;
	}

	public void setRcode(long rcode) {
		Rcode = rcode;
	}
	
	
}
