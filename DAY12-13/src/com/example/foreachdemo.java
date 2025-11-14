package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class foreachdemo {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,3,2,5);
		Consumer<Integer> c=new Consumer<Integer>()
				{
//creating and defining cons inter
					@Override
					public void accept(Integer t) {
						System.out.println("data "+t);
						
					}
			
				};
				l.forEach(c);
				//instead of putting a lambda exp we pass obj of consumer-same effect
				//here we access whats defined in his pgm
				
				l.forEach(new Consumerdemo());
				//access whats defined in foreachdemo class
				
				//THIRD METHOD
				// List<Integer> l=Arrays.asList(1,3,2,5);
				// l.forEach(t->System.out.println(t));
				

	}

}
