package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.EAddress;
import com.bean.EUser;

import com.util.Util;

public class SignUpDao 
{
	
	
	Connection con= Util.getConnection();
	public int AddUser(EUser e,EAddress addr) throws SQLException
	{
		
		int a=0;
		try{
			
		String cmd="insert into EUser values(?,?,?,?,?,?,?)";
		String cmd1="insert into EAddress values(?,?,?,?,?,?,?)";
		PreparedStatement pst= con.prepareStatement(cmd);
		
		long uid=generateUid();
		
		
		
	     pst.setLong(1,uid);
	     pst.setString(2, e.getName());
	     pst.setLong(3,e.getAge());
	     pst.setString(4, e.getGender());
	     pst.setLong(5, e.getContact_number());
	     pst.setString(6, e.getPassword());
	     pst.setLong(7, e.getRole());
	     
		 a=pst.executeUpdate();
		 
		 PreparedStatement pst1= con.prepareStatement(cmd1);
		 pst.setLong(1,uid);
		 pst1.setString(2,addr.getAddress_line_1() );
		 pst1.setString(3,addr.getAddress_line_2() );
		 pst1.setString(4,addr.getCity() );
		 pst1.setString(5,addr.getState());
		 pst1.setString(6,addr.getCountry() );
		 pst.setLong(7, addr.getPin_code());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return a;
	}
	
	
	
	public long generateUid() throws SQLException{
	String cmd2="Select EUser_seq.nextval from dual";
	Statement smt1=con.createStatement();
	ResultSet rs1=smt1.executeQuery(cmd2);
	long uid=0;
	if(rs1.next())
	{
		uid=(long)rs1.getInt(1);
		System.out.println(uid);
	}
	return uid;
	}
	
	
		
}
