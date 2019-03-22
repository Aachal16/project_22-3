package com.bean;

public class Service {
	public String SName, SCode;
	public long Duration, Amount;
	
	//Default Constructor
	public Service() {
		super();
	}

	//Parameterised Constructor
	public Service(String sName, String sCode, long duration, long amount) {
		super();
		SName = sName;
		SCode = sCode;
		Duration = duration;
		Amount = amount;
	}
	
	//Getter Setter
	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public String getSCode() {
		return SCode;
	}

	public void setSCode(String sCode) {
		SCode = sCode;
	}

	public long getDuration() {
		return Duration;
	}

	public void setDuration(long duration) {
		Duration = duration;
	}

	public long getAmount() {
		return Amount;
	}

	public void setAmount(long amount) {
		Amount = amount;
	}
	
	
}
