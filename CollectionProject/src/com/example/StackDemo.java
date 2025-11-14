package com.example;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		Stack al=new Stack();
		//ADD
		al.add("mango");
		al.add('x');
		al.add(1);
		al.add(5);
		System.out.println(al);//order is preserved
		//REMOVE
		al.remove(2);//index
		al.pop();//from end only-A STACK SPL 
		System.out.println(al);
		//UPDATE set(index,new ele)
		al.set(0,"apple");
		System.out.println(al);
		System.out.println(al.get(0));
		al.push("banana");
		System.out.println(al.peek());
		System.out.println(al);

	}

}
