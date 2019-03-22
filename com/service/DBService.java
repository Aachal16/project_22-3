package com.service;

import java.sql.SQLException;

import com.bean.EAddress;
import com.bean.EUser;
import com.dao.SignUpDao;
public class DBService 
{

	SignUpDao dao=new SignUpDao();
	
	public int AddUser(EUser g,EAddress addr) throws SQLException 
	{
		int m=dao.AddUser(g,addr);
		return m;	
	}
		
	
}
