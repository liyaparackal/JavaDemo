package com.example;

import java.util.HashSet;
import java.util.LinkedList;
//PUSH AND POP USE START NOT END IN LL
//STACK PUSH 
//HASHSET -ORDER NO INDEX NO DUP NO
//LINKED HASHSET -ORDER YES INDEX NO DUP NO
//LINKEDLIST CAN HAVE DUPLICATES LHS OR HS -NO DUPLICATES
public class HashSetDemo {
//NO ORDER NO INDEX
	public static void main(String[] args) {
		HashSet al=new HashSet();
		al.add("1st");
		al.add("2nd");
		al.add("3rd");
		// error for index al.add(1,"guava");
		System.out.println(al);
		//output isnt in order 1st 2nd 3rd its random

	}

}
