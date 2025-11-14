package com.example;

import java.util.TreeSet;
import java.util.Vector;

public class TreeDemo {

	public static void main(String[] args) {
		TreeSet al=new TreeSet();
		//ADD
		al.add("mango");
		al.add("x");
		//al.add(1);
		//only homo-THROWS CLASSCAST ERROR
		System.out.println(al);//order is preserved
		//REMOVE
		al.remove("x");//index
		System.out.println(al);
		//UPDATE set(index,new ele)
		//al.set(0,"apple");
	}

}
