package com.example;

public class Ex {
//RECORDS
record Employee(int empid,String name)
{
	
}
	
	public static void main(String[] args) {
	Employee e=new Employee(101,"liya");
System.out.println(e);
//immutable version of employeebean-no need tostsring but etxt will be printed not memeory

//		String str="""
//		JAVA is programming language.
//		it is multithreaded
//		its platform indepenedent.""";		
//System.out.println(str);
	}

}
