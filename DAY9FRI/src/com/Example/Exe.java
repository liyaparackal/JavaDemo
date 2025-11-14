package com.Example;

public class Exe {
public static int a[]=new int[5];
	public static void div(int x,int y)
	{a[0]=11;
	a[1]=22;
		try
		{System.out.println(x/y);
			
			a[11]=77;
			//this is an exception but the other exceptn e is the one being handled
			//this is not handled only e is handled  
		}
		//catch(Exception e)
		catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error:"+e );
			
			// System.err.println("enter non zero  to prevent error:"+e );
			//this displays in red
		}
		
//		catch(ArrayIndexOutOfBoundsException aioob)
//		{
//			System.out.println("enter non zero  to prevent error:"+aioob );
//			//to format it use getMessage; 
//			//System.out.println("enter non zero  to prevent error:"+aioob.getMessage() );
//			// aioob.printStackTrace();
//			//method in THROWABLE traces the path of excptn
//		}
		//this catch wont even be considered do in diff try blocks
		
	}
	
	public static void main(String[] args) {
		int x=22;
		int y=0;
		Exe.div(x,y);
		// TODO Auto-generated method stub

	}

}
