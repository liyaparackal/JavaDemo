package com.example;

import java.util.ArrayList;

public class FruitsList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("mango");
		al.add("apple");
		al.add("banana");
		System.out.println(al);//order is preserved
		al.remove(2);//index
		System.out.println(al);
		al.set(0,"orange");
		System.out.println(al);
		for(Object o :al)
		{ System.out.println(o);}
}
}
