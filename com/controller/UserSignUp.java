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

import com.bean.EAddress;
import com.bean.EUser;
import com.dao.LoginDao;
import com.dao.SignUpDao;
import com.service.DBService;

/**
 * Servlet implementation class UserSignUp
 */
public class UserSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		DBService ds=new DBService();
		String target="";
				
			
			HttpSession hsn=request.getSession();
			SignUpDao udao=new SignUpDao();				
			String act=request.getParameter("action");
			try
			{
			if(act.equals("Submit"))
			{
				
			String Name=request.getParameter("UserName");
			String gender=request.getParameter("gender");
			String password=request.getParameter("pwd");
			long user_id = udao.generateUid();
			long age=Integer.parseInt(request.getParameter("age"));
			long role=Integer.parseInt(request.getParameter("role"));
			long contact_number=Long.parseLong(request.getParameter("num"));
			
			
			String address_line_1=request.getParameter("add1");
			String address_line_2=request.getParameter("add2");
			String  city=request.getParameter("city");
			String state=request.getParameter("state");
			String country=request.getParameter("country");
			long pin_code=Long.parseLong(request.getParameter("pinc"));
			
			EUser u=new EUser(user_id,Name,age,gender,contact_number,password,role);
			EAddress addr=new EAddress( user_id, address_line_1,  address_line_2, city,  state, country,
					 pin_code);
			
			/*hsn.setAttribute("Name", Name);
			hsn.setAttribute("Gender", gender) ;
			hsn.setAttribute("password", password);
			hsn.setAttribute("user_id", user_id);
			hsn.setAttribute("age", age);
			hsn.setAttribute("role", role);
			hsn.setAttribute("contact_number",contact_number);
			hsn.setAttribute("address_id",address_id);
						*/
			
			int b = ds.AddUser(u,addr);
			System.out.println("aaaaaaaaaaa........");
			if(b>0)
			{
			System.out.println("abcde.......");
			target="/JSP/Login1.jsp";
			}
			}
			else if(act.equals("Login"))
			{
				String Name=request.getParameter("UserName");
				String pass=request.getParameter("pwd");
				LoginDao ldao=new LoginDao();
				boolean x=ldao.Login(Name, pass);//session value
				if(x)
				{
					target="/JSP/Dummy-UserHome.jsp";
				}
				else
				{
					pw.print("Login Failed");
				}
				
			}
				
			
			
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			
			
			
			
			
			
				
			RequestDispatcher rd=request.getRequestDispatcher(target);
			rd.forward(request, response);
			pw.close();
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
