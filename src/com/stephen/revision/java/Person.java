package com.stephen.revision.java;

//Created By: Stephen Alger
//Created Date: September 2018
//Program Purpose: Revision of Java after Summer 2018
//Person Class 

public class Person {
	
	//private variables on the class
	private String name;
	private char gender;
	
	//Constructor Method
	Person(String x, char y)
	{
		//set variables through setter functions
		setName(x);
		setGender(Character.toUpperCase(y));
	}
	
	//Private Variable Accessing Method returning instance 'name' variable
	String getName()
	{
		return this.name;
	}
	
	//Private Variable Setting Method - assigning instance 'name' variable passed value
	void setName(String newName)
	{
		this.name = newName;
	}
	
	//Private Variable Accessing Method returning instance 'gender' variable
	char getGender()
	{
		return this.gender;
	}
	
	//Private Variable Setting Method - assigning instance 'gender' variable passed value
	void setGender(char y)
	{
		this.gender = y;
	}
	
	//toString Specifying Method
	public String toString()
	{
		return getName() + ", " + getGender();
	}

} //end Person Class
