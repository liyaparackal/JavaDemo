package com.example;

public class Thread2 implements Runnable {

	public static void main(String[] args) {
		Thread2 t=new Thread2();
		//MAKE CLASS OBJ
		Thread t1=new Thread(t);
		//MAKE THREAD ONJ AND PASS CLASS OBJ THERE
		t1.start();
		//USE THREAD OBJ TO CALL START
		Thread t2=new Thread(t);
		t2.start();
		// MULTIPLE INH VIA INTERFACE
		//without this we cant use start method twice in psvm
		// this is the better option
	}
public void run()
{System.out.println("runnable object");
}
}
