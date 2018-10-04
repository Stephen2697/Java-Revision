package com.stephen.revision.java;

public class Person {
	
	private String name;
	private char gender;
	
	
	Person(String x, char y)
	{
		//set variables through setter functions
		setName(x);
		setGender(Character.toUpperCase(y));
	}
	
	//Return Name
	String getName()
	{
		return this.name;
	}
	
	//Pass In Name
	void setName(String newName)
	{
		this.name = newName;
	}
	
	//Return Char Gender
	char getGender()
	{
		return this.gender;
	}
	
	//Set Gender
	void setGender(char y)
	{
		this.gender = y;
	}
	
	public String toString()
	{
		return getName() + ", " + getGender();
	}

}
