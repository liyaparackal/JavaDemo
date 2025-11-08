package com.Example;
public class Ex3 
{
public static void div(int x,int y)throws ArithmeticException 
{
System.out.println("division is "+x/y);
	
}
public static void main(String[] args) {
try {
Ex3.div(12,0);}
catch(ArithmeticException e)
{
	System.out.println(e.getMessage());
}

	}
}


