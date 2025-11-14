package com.example;

import java.util.Stack;

public class Animalstack {

	public static void main(String[] args) {
		Stack al=new Stack();
		//ADD
		al.add("cat");
		al.add("dog");
		al.add("monkey");
		al.add("cow");
		System.out.println(al);
		//REMOVE
		al.remove(2);//index
		System.out.println("after deletion stack is: "+al);
		al.pop();//from end only-A STACK SPL 
		System.out.println("after pop stack is: "+al);
		//UPDATE set(index,new ele)
		al.set(0,"kitten");
		System.out.println("after update stack is: "+al);
		al.push("puppy");
		System.out.println("top element is: " +al.peek());
		System.out.println("final stack is: " +al);
	}

}
