package com.stephen.revision.java;

import java.util.UUID;

public class Student extends Person implements PublishDetails {

	private String studentID;
	private String courseID = "DT228";
	static String studentIDCounter = UUID.randomUUID().toString();
	
	
	
	Student(String x, char y)
	{
		super(x, y);
		setID(createNewID());
		
	}
	
	void setID(String ID)
	{
		this.studentID = ID;
	}
	
	String getID()
	{
		return this.studentID;
	}
	
	String getCourse()
	{
		return this.courseID;
	}
	
	public String toString()
	{
		return super.toString() + ", "  + getID() + "." ;
	}
	
	//print out name
	public void confirmDetails()
	{
		System.out.print("\n" + this.getName());
	}
	
	//print out course code
	public void  getCourseCode()
	{
		System.out.println("." + this.getCourse());
	}
	
	public String createNewID()
	{
		
		return UUID.randomUUID().toString();
	}
}
