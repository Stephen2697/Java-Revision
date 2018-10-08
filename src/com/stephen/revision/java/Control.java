package com.stephen.revision.java;



public class Control {

	public static void main(String[] args)
	{

		int i = 1;
		
		for (int t=0; t<30; t++)
			System.out.print("-");
		
		System.out.println("\nObject Records");
		
		for (int t=0; t<30; t++)
			System.out.print("=");
		
		
		
		//Instantiate objects
		Person stephen = new Person("Stephen", 'M');
		Person amy = new Person("Amy", 'F');
		
		//Instantiate objects
		Student alex = new Student("Alex", 'M');
		Student anna = new Student("Anna", 'F');
		
		
		System.out.println("\nobj" + i + ": " + stephen);
		i++;
		System.out.println("obj" + i + ": " + amy);
		i++;
		System.out.println("obj" + i + ": " + alex);
		i++;
		System.out.println("obj" + i + ": " + anna);
		
		for (int t=0; t<30; t++)
			System.out.print("-");
		
		System.out.println("\nInterface Behaviour");
		
		for (int t=0; t<30; t++)
			System.out.print("=");
		
		//Call interfaces
		alex.confirmDetails();
		alex.getCourseCode();
		
		anna.confirmDetails();
		anna.getCourseCode();
		
		
		
	}
}
