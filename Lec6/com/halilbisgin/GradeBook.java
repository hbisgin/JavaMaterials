package com.halilbisgin;

public class GradeBook {
	private String course; //attribute for this class
	private int courseSize;
	
	public void setCourse(String theCourse)
	{
		course = theCourse;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public void setCourseSize(int theSize)
	{
		courseSize = theSize;
	}
	
	public int getCourseSize()
	{
		return courseSize;
	}
	
	public void displayMessage()
	{
		System.out.println("Welcome to " + course + " we are " + courseSize + " students.");
	}

}
