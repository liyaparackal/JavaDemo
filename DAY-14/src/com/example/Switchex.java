package com.example;
//A SWITCH THAT CAN RETURN VALUE NOT ONLY PRINT IT
public class Switchex {
	public static String validate(String day) {
//	switch(day)
//	{
//	case "monday":System.out.println("day 1");break;
//	case "tuesday":System.out.println("day 1");break;
//	}
	
	switch(day)
	{
	case "monday":return("day 1");
	}
	return day;
	
	}
public static void main(String args[])
{
	System.out.println(Switchex.validate("monday"));
}
}
