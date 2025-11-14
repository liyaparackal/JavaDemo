package com.example;

import java.util.LinkedList;
import java.util.Vector;

public class LLDemo {
//IF WE USE INDEX BASED OPERNS IN HASHSET -ERROR
	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		//ADD
		al.add("mango");
		al.add('x');
		al.add(1);
		al.add(1,"guava");
		System.out.println(al);//order is preserved
		//REMOVE
		al.remove(2);//index
		System.out.println(al);
		//UPDATE set(index,new ele)
		al.set(0,"apple");
		System.out.println(al);
		System.out.println(al.contains("apple"));
		System.out.println(al.size());
		System.out.println(al.get(0));
	}

}
