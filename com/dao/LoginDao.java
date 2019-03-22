package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.CommandInterface.*;

import com.util.Util;

public class LoginDao implements commandInterface {

	Connection con=Util.getConnection();
	public boolean Login(String uname,String pwd/*,String role*/) throws SQLException
	{
		 //long role1=Long.parseLong(role);
		 	
			PreparedStatement ps =con.prepareStatement(check_login);
			ps.setString(1,uname);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				String name=rs.getString(1);
				String pass=rs.getString(2);
				long r=rs.getLong(3);
				if(name.equals(uname) && pass.equals(pwd) /*&& r==role1*/)
					return true;
				
			}
			return false;
	}
}
