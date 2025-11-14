package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
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
		//ITERATION WAYS TO DO
		//1
		for(Object o :al)
		{ System.out.println(o);

		}//ENHANCED FOR LOOP
		//2)
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//3)
		al.forEach(x->{System.out.println(x);});//lambda
		//4)
		al.forEach(System.out::println);//method reference
		//HERE WE DONT STORE ANYWHERE IN VARIABLE LIKE X JUST ACCESS DIRECTLY
	}
}
