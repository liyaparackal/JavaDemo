package com.Example;

public class EX {
	public static void main(String[] args) {
		int x=22;
		int y=0;
		try
		{
			System.out.println(x/y);
		}
		catch(Exception e)
		//catch(ArithmeticException e)
		{
			System.out.println("enter non zero  to prevent error:"+e );
		}
		//finally {System.out.println("bye");}
		
		System.out.println("bye");
		//we need to add CATCH OR FINALLY OR BOTH with TRY

	}

}
