package com.Example;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("enter age");	
	int a=sc.nextInt();
	if(a>=18)
	{
		System.out.println("valid age");
	}
	else
	{
		try
		{
			throw new InvalidAgeException(a);
		}
		catch(InvalidAgeException ia)
		{
			System.out.println(ia);
		}
	}

	}

}
