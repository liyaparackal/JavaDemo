package com.example;

import java.util.Vector;

public class Cityvector {

	public static void main(String[] args) {
		
		Vector al=new Vector();
		//ADD
		al.add("cochin");
		al.add("trivandrum");
		al.add("delhi");
		System.out.println("The vector is : "+al);//order is preserved
		//REMOVE
		al.remove(2);//index
		System.out.println("After deletion: "+al);
		//UPDATE set(index,new ele)
		al.set(0,"chennai");
		System.out.println("after update: "+al);

	}

}
