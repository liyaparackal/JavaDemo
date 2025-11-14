package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("mango");
		al.add("apple");
		al.add("oarnge");
		//can add specific DT only-after specifying it
		for(String s:al)
		{
			System.out.println(s);
		}
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			//System.out.println((String)itr.next());
			System.out.println(itr.next());
			//better to put (string)
		}

	}

}
