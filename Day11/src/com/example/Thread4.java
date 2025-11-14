//DOING DIFF OPERNS USING THREAD  WITHOUT DIFF CLASSES  IE IN SINGLE PGM
//ANONYMOUS OBJECTS with reference
package com.example;

public class Thread4 {

	public static void main(String[] args) {
				{
		/*FOR WITHOUT REFERENCE ANON OBJECTS WRITE:
		 * new Thread()
			{public void run()
			{
					System.out.println("Thread 1");

			}
			};	
		
		*/
			Thread t1=new Thread()	{	
			public void run()
			{
					System.out.println("Thread 1");

			}
			};
		Thread t2=new Thread()
				{
				public void run()
				{
					System.out.println("Thread 2");

				}
				};
t1.start();
t2.start();
	}
	}
}
//MULTIPLE RUNNABLE OBJECTS
/*
new Thread(new Runnable()) {public void run()

	{System.out.println("runnable obj");}
}).start();
}}
*/
