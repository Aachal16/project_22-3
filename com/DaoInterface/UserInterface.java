package com.DaoInterface;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.*;

public interface UserInterface {

	//Profile
	public boolean Edit_Age(long age,long uid) throws SQLException; 
	
	public boolean Edit_Address(long uid,EAddress addr) throws SQLException; 
	
	public boolean Edit_Contact(long contact,long uid) throws SQLException; 
	
	public boolean Edit_Password(String pwd,long uid) throws SQLException; 
	
	public void Deactivate_profile(EUser euser) throws SQLException;
	
	public ArrayList<Service> Availed_Services();
	
	public ArrayList<Course> Availed_Courses();
	
	
	//Transaction
	public ArrayList<Service> Transaction_history();
	
	
	//List of Services
	public ArrayList<Service> Available_Services();
	
	public boolean Payment(Service s);
	
	public ArrayList<Course> Available_Courses();
	
	//public EUser SetEUser(String uname) throws SQLException;
	
	//public EAddress SetAddress(String uname) throws SQLException;
}
