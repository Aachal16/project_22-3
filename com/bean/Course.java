package com.bean;

public class Course {
	public String CName, Ccode;

	//Default Constructor
	public Course() {
		super();
	}

	//Parameterised Constructor
	public Course(String cName, String ccode) {
		super();
		CName = cName;
		Ccode = ccode;
	}

	//Getter Setter
	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public String getCcode() {
		return Ccode;
	}

	public void setCcode(String ccode) {
		Ccode = ccode;
	}
	
	
	
}
