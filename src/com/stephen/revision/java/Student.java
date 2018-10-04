package com.stephen.revision.java;

public class Student extends Person {

	String studentId;
	
	Student(String x, char y, String z)
	{
		super(x, y);
		setID(z);
		
	}
	
	void setID(String ID)
	{
		this.studentId = ID;
	}
	
	String getID()
	{
		return this.studentId;
	}
	
	public String toString()
	{
		return super.toString() + ", "  + getID() + "." ;
	}
	
}
