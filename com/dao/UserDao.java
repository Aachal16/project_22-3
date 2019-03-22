package com.dao;
import com.DaoInterface.UserInterface;
import com.util.Util;
import com.bean.Course;
import com.bean.EAddress;
import com.bean.EUser;
import com.bean.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.CommandInterface.*;


public class UserDao implements UserInterface,commandInterface {
	
	Connection con=Util.getConnection();
	
	public boolean Edit_Age(long age,long uid) throws SQLException
	{ 		
	    boolean b=false;
		 	
		PreparedStatement ps =con.prepareStatement(update_Age);
		ps.setLong(1,age);
		ps.setLong(2, uid);
		int z=ps.executeUpdate();
	     if(z>0)
	     {
	    	 b=true;
	    	 return b;
	     }
		return b;
	}


	public boolean Edit_Address(long uid,EAddress addr ) throws SQLException {
		boolean b=false;
		//Connection con=ConnectionsUtil.getConnection(); 	
		PreparedStatement ps =con.prepareStatement(get_Address);
		ps.setString(1,addr.getAddress_line_1());
		ps.setString(2,addr.getAddress_line_2());
		ps.setString(3,addr.getCity());
		ps.setString(4,addr.getState());
		ps.setString(5,addr.getCountry());
		ps.setLong(6, addr.getPin_code());
		ps.setLong(7, uid);
		ps.executeUpdate();
		
		int z=ps.executeUpdate();
	     if(z>0)
	     {
	    	 b=true;
	    	 return b;
	     }
		return b;
	}


	public boolean Edit_Contact(long contact,long uid) throws SQLException {
		 boolean b=false;
		 	
			PreparedStatement ps =con.prepareStatement(update_Contact);
			ps.setLong(1,contact);
			ps.setLong(2, uid);
			int z=ps.executeUpdate();
		     if(z>0)
		     {
		    	 b=true;
		    	 return b;
		     }
			return b;
		
	}


	public boolean Edit_Password(String pwd,long uid) throws SQLException {
		boolean b=false;
	 	
		PreparedStatement ps =con.prepareStatement(update_Contact);
		ps.setString(1,pwd);
		ps.setLong(2, uid);
		int z=ps.executeUpdate();
	     if(z>0)
	     {
	    	 b=true;
	    	 return b;
	     }
		return b;
	}


	public void Deactivate_profile(EUser euser) throws SQLException {
		
		PreparedStatement ps ;
		ps=con.prepareStatement(delete_Service);
		ps.setLong(1, euser.getUser_id());
		ps.executeUpdate();
		ps=con.prepareStatement(delete_Address);
		ps.setLong(1, euser.getUser_id());
		ps.executeUpdate();
		ps=con.prepareStatement(delete_User);
		ps.setLong(1, euser.getUser_id());
		ps.executeUpdate();
		
		
	}

	public ArrayList<Service> Availed_Services() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Course> Availed_Courses() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Service> Transaction_history() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Service> Available_Services() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Payment(Service s) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Course> Available_Courses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public EUser SetEUser(String uname) throws SQLException
	{
		EUser eu=new EUser();
		PreparedStatement ps;
		ps=con.prepareStatement(get_user);
		ps.setString(1, uname);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			eu.setUser_id(rs.getLong(1));
			eu.setName(rs.getString(2));
			try {
				eu.setAge(rs.getLong(3));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			eu.setGender(rs.getString(4));
			eu.setContact_number(rs.getLong(5));
			eu.setAddress_id(rs.getLong(6));
			eu.setPassword(rs.getString(7));
			eu.setRole(rs.getLong(8));
			
		}
		return eu;
	}
	
	public Address SetAddress(String uname) throws SQLException
	{
		Address addr=new Address();
		//EUser eu=new EUser();
		PreparedStatement ps;
		ps=con.prepareStatement(get_Address);
		ps.setString(1, uname);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			addr.setAddress_line_1(rs.getString(1));
			addr.setAddress_line_2(rs.getString(2));
			addr.setCity(rs.getString(3));
			addr.setState(rs.getString(4));
			addr.setCountry(rs.getString(5));
			addr.setPin_code(rs.getLong(6));
		}
		return addr;
	}*/


	

	


}

	