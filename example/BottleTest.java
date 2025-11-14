package com.example;

public class BottleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bottle b=new Bottle(100);
b.fill(50);
System.out.println("Current water level: " +b.getLevel());
b.drink(30);
System.out.println("Current water level: " +b.getLevel());
b.fill(40);
System.out.println("Current water level: " +b.getLevel());
	}

}
