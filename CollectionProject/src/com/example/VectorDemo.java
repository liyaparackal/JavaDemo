package com.example;

import java.util.Vector;
//VECTOR METHODS ARE SYNCHRONISED SO LESS PERFORMANCE-OPERNS ONE AT A TYM
//THIS IS THE ONLY DIFFERENCE
public class VectorDemo {
		public static void main(String[] args) {
			Vector al=new Vector();
			//ADD
			al.add("mango");
			al.add('x');
			al.add(1);
			System.out.println(al);//order is preserved
			//REMOVE
			al.remove(2);//index
			System.out.println(al);
			//UPDATE set(index,new ele)
			al.set(0,"apple");
			System.out.println(al);
			System.out.println(al.get(0));
	}

}
//STACK and LINKEDLIST -SAME FORMAT ,METHODS AS ARRAYLIST BUT WITH EXTRA METHODS
