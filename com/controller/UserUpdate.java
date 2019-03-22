package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.bean.EAddress;
import com.bean.EUser;

/**
 * Servlet implementation class UserUpdate
 */
public class UserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		 String target="";
		
		 UserDao udao=new UserDao();
		 HttpSession hsn=request.getSession();
		 
		 String uname=(String) hsn.getAttribute("name");
		 try {
			EUser euser=new EUser();
			 EAddress addr=new EAddress();
			 
			 long uid=euser.getUser_id();
			 System.out.println(uid);
			 
			 String act=request.getParameter("action");
			 
			 if(act.equals("Edit_age"))
			 {
				 long new_age=Long.parseLong(request.getParameter("age"));//set
				 boolean flag=udao.Edit_Age(new_age, uid);
				 if(flag){
					 pw.print("Age updated");//set
				 euser.setAge(new_age);
				 }
			 }
			 
			 if(act.equals("Edit_address"))
			 {
				 String addr_line1=request.getParameter("addr1");//set
				 String addr_line2=request.getParameter("addr2");//set
				 String city=request.getParameter("city");//set
				 String state=request.getParameter("state");//set
				 String country =request.getParameter("country");//set
				 long pin=Long.parseLong(request.getParameter("pin"));//set
				 
				 addr.setAddress_line_1(addr_line1);
					addr.setAddress_line_2(addr_line2);
					addr.setCity(city);
					addr.setState(state);
					addr.setCountry(country);
					addr.setPin_code(pin);
				 
				 boolean flag=udao.Edit_Address(uid, addr);
				 if(flag)
					 pw.print("Address updated");//set
			 }
			 
			 
			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
