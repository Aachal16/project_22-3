package com.bean;

public class Service_Course {
	public long ScService,ScCourse;

	//Default Constructor
	public Service_Course() {
		super();
	}

	//Parameterised Constructor
	public Service_Course(long scService, long scCourse) {
		super();
		ScService = scService;
		ScCourse = scCourse;
	}

	//Getter Setter
	public long getScService() {
		return ScService;
	}

	public void setScService(long scService) {
		ScService = scService;
	}

	public long getScCourse() {
		return ScCourse;
	}

	public void setScCourse(long scCourse) {
		ScCourse = scCourse;
	}
	
	
}
