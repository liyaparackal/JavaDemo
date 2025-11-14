package com.example;
//DEMO TO SHOWINTRO OF SYNC 
public class ThreadDemo extends Thread{

	public static void main(String[] args) {
	ThreadDemo t1=new ThreadDemo();
	ThreadDemo t2=new ThreadDemo();
	//create thread obj by extending thread class
	t1.start();
	t2.start();
	//call start to get thread running
//it AUTOMATICALLy calls RUN
	}

	public void run()
	{
		for(int i=1;i<=5;i++)
//		{System.out.println(i);
			try {
				Thread.sleep(3000);
				//static method so use class name Thread not an obj
			}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
	}

	

