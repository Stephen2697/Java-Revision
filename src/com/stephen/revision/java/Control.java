package com.stephen.revision.java;

// Created By: Stephen Alger
// Created Date: September 2018
// Program Purpose: Revision of Java after Summer 2018
// Control Class containing main()

public class Control {

	//Java program entry point
	public static void main(String[] args)
	{
		
		//Below is simple formatted console output
		/*==============================*/
		int i = 1;
		
		for (int t=0; t<30; t++)
			System.out.print("-");
		
		System.out.println("\nObject Records");
		
		for (int t=0; t<30; t++)
			System.out.print("=");
		/*==============================*/
		
		
		//Instantiation Below
		/*==============================*/
		
		//Instantiate Person objects
		Person stephen = new Person("Stephen", 'M');
		Person amy = new Person("Amy", 'F');
		
		//Instantiate Student objects
		Student alex = new Student("Alex", 'M');
		Student anna = new Student("Anna", 'F');
		/*==============================*/
		
		//More formatted output to console below
		/*==============================*/
		System.out.println("\nobj" + i + ": " + stephen);
		i++;
		System.out.println("obj" + i + ": " + amy);
		i++;
		System.out.println("obj" + i + ": " + alex);
		i++;
		System.out.println("obj" + i + ": " + anna);
		/*==============================*/
		
		//Below is utilisation of class interfaces
		/*==============================*/
		for (int t=0; t<30; t++)
			System.out.print("-");
		
		System.out.println("\nInterface Behaviour");
		
		for (int t=0; t<30; t++)
			System.out.print("=");
		
		//Call interfaces on instances
		alex.confirmDetails();
		alex.getCourseCode();
		
		anna.confirmDetails();
		anna.getCourseCode();
		/*==============================*/
		
	} //end main
} //end control class
