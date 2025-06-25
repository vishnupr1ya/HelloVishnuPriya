package javaobject;

public class Employee {
	//variables
	int eid;
	String empName;
	String job;
	int sal;
	
	
	//constructor - 2 types
	//default
	Employee(){
		eid = 101;
		empName = "John";
		job = "Engineer";
		sal = 5000;
		
		
	}
	//parameterised constructor
	Employee(int id, String name, String job1, int salary){
		 eid = id;
		 empName = name;
		 job = job1;
		 sal = salary;
		
		
		
	}
	
	//Methods
	void display(){
		System.out.println(eid);
		System.out.println(empName);
		System.out.println(job);
		System.out.println(sal);
		
	}
	void printEmployeeData() {
		System.out.println(eid+empName+job+sal);
	}

	
	
}
