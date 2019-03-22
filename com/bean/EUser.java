package com.bean;

public class EUser {
	public String Name,gender,password;
	public long Age,role,contact_number,user_id;
	
	//Default Constructor
	public EUser() {
		super();
	}
	
	//Parameterised Constructor
	public EUser(long user_id,String name, long age, String gender, long contact_number,
			 String password, long role) {
		super();
		Name = name;
		this.gender = gender;
		this.password = password;
		this.user_id = user_id;
		Age = age;
		this.role = role;
		this.contact_number = contact_number;
		//this.address_id = address_id;
	}
	
	//Getter Setter
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getAge() {
		return Age;
	}

	public void setAge(long age) {
		Age = age;
	}

	public long getRole() {
		return role;
	}

	public void setRole(long role) {
		this.role = role;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	/*public long getAddressId() {
		return address_id;
	}

	public void setAddressId(long address) {
		this.address_id = address;
	}*/
	
	
	
}
