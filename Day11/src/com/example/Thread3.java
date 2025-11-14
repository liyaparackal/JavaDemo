package com.example;

public class Thread3 extends Thread{

	public static void main(String[] args) {
		A t1=new A();
		/*if this was implementing runnable we'd do:
		A t1=new A()
		Thread t=new Thread(t1);
		t.start();
		 */
		//this is bcs A cant directly access start -it needs a thread obj
		
		//USING LAMBDA-not calling A 
		/*Runnable r=()->{System.out.println("runnable int");};
		Thread t=new Thread(r);
		t.start();
		*/
		
		B t2=new B();
		t1.start();
		t2.start();
	
	}

}
//this is how we make diff threads do diff operns together
