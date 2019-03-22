package com.DaoInterface;

import java.util.ArrayList;

import com.bean.Course;
import com.bean.EUser;
import com.bean.Service;

public interface VendorInterface {

	//Profile
     public EUser Edit_profile(); 
	
	public void Deactivate_profile();
	
	//Transaction
		public ArrayList<Service> Tranaction_history();
		
		
		//Services
		public Service Add_Service();
		
		public Service Modify_Service();
		
		public Course Add_Course();
		
		public Course Modify_Course();
		
		public void Deactivate_Service(Service s);
		
		public void Deactivate_Course(Course c);
}
