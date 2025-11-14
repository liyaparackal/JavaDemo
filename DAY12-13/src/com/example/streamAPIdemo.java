package com.example;

import java.util.stream.Stream;
import java.util.List;
import java.util.function.Consumer;
import java.util.*;
public class streamAPIdemo {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,3,2,5);
		//same as list l= but use generics for convenience
		/*use asList to easily create a lsit in 1 step
		  instead of list l=new arraylist
		 &  l.add(1)..
		*/
		Stream<Integer> s=l.stream();
		s.forEach(t->System.out.println(t));
		// we can pass only once to stream class never use same stream again
				//access whats defined in his pgm
	//FASTEST METHOD OF DATA ACCESS			

	}

}
