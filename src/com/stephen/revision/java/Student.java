package com.stephen.revision.java;

import java.util.UUID;

//Created By: Stephen Alger
//Created Date: September 2018
//Program Purpose: Revision of Java after Summer 2018
//Student Class

public class Student extends Person implements PublishDetails {

	//private variables on the class
	private String studentID;
	private String courseID = "DT228";
	
	//Static variable assigned once at program compile time
	//Replaced & Commented Out
	//static String studentIDCounter = UUID.randomUUID().toString();
	
	
	//Constructor Method
	Student(String x, char y)
	{
		//call superclass constructor (Person)
		super(x, y);
		
		//Method Call - creates new random 128 bit number for new student instance
		setID(createNewID());
		
	}
	
	//Private Variable Setting Method - assigning instance 'studentID' variable passed value
	void setID(String ID)
	{
		this.studentID = ID;
	}
	
	//Private Variable Accessing Method returning instance 'studentID' variable
	String getID()
	{
		return this.studentID;
	}
	
	//Private Variable Accessing Method returning instance 'courseID' variable
	String getCourse()
	{
		return this.courseID;
	}
	
	//toString Specifying Method
	public String toString()
	{
		//formatting using super class toString() method as a base for toString() on this class
		return super.toString() + ", "  + getID() + "." ;
	}
	
	//Method to Output Instance object's 'name' variable to console
	public void confirmDetails()
	{
		System.out.print(this.getName());
	}
	
	//Method to Output Instance object's 'courseID' variable to console
	public void  getCourseCode()
	{
		System.out.println(" Is Enrolled In Course: " + this.getCourse());
	}
	
	//Method to create a UUID - 128 bit unique id upon method call
	public String createNewID()
	{	
		return UUID.randomUUID().toString();
	}
	
} //end student class
