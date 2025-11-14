package com.example;

public class Numbers {
	int num=0;
	public synchronized void odd(int num)
	{
for(int i=1;i<=5;i++)
	{{if(num%2==1)

	 {System.out.println("number is odd ");}}

	try {

	wait();

	} catch (InterruptedException e) {

	// TODO Auto-generated catch blo

	 e.printStackTrace();

	}

	}

	System.out.println("Printing Odd number");
	}

	public synchronized void even(int num)

	{if(num%2==0)
	{
		System.out.println("Printed even  successfully "+num);	
	}

	notify();

	}

	public static void main(String[] args) {

	Numbers n=new Numbers();

	new Thread() {

	public void run()

	{

	n.odd(4000);

	}

	}.start();

	new Thread() {

	public void run()

	{

	n.even(10000);

	}

	}.start();

	}

}
