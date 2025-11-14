package com.Example;

public class EX2 {
	public static int a[]=new int[5];
	public static void div(int x,int y)
	{a[0]=11;
	a[1]=22;
		try
		{System.out.println(x/y);
		try
		{
			a[11]=17;
		}
		catch(ArrayIndexOutOfBoundsException aioob)
		{
			System.out.println(" aioob error:"+aioob );
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("enter non zero  to prevent error:"+e );
			// System.err.println("enter non zero  to prevent error:"+e );
			//this displays in red
		}
		
		
		}
	}


