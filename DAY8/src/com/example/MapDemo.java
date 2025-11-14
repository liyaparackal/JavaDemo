package com.example;

//import java.util.LinkedHashMap;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
	LinkedHashMap hm=new LinkedHashMap();
	//TreeMap=new 
	hm.put(3, "mango");
	hm.put('x', 33.4);
	hm.put("A", 55);
	System.out.println(hm);
	System.out.println(hm.containsKey("A"));
	System.out.println(hm.get('x'));
	System.out.println(hm.remove(3));
	System.out.println(hm);
	
//hash
	//map-no order
	//TreeMap-gives in sorted order of keys(wont work with hetero data)
	//to  get only key or value separately use enhanced for loop
	//
	
}
}
