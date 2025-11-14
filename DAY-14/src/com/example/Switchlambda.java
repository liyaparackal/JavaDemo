package com.example;
//A SWITCH THAT CAN RETURN VALUE NOT ONLY PRINT IT
public class Switchlambda {	
public static void main(String args[])
{
	String day="monday";
	String res=switch(day){case "monday"->"day 1";
	case "tuesday"->"day 2";
	//use -> instead of yield res=()
	 default -> "invalid";
	};
	
	System.out.println(res);
}
}
