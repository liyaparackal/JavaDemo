package com.example;

public class Threadmethods extends Thread{
	
	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());

}
}