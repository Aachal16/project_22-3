package com.DaoInterface;

import java.util.ArrayList;

import com.bean.EUser;

public interface AdminInterface {

	public EUser Add_User();
	
	public EUser Add_Vendor();
	
	public EUser Upadate_User();
	
	public ArrayList<EUser> ListUsers();
	
	public ArrayList<EUser> ListVendor();
	
	
}
