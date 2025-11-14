package com.example;

import java.util.function.Consumer;

public class Consumerdemo implements Consumer<Integer>{

//	@Override
//	public void accept(Object t) {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void accept(Integer t) {
System.out.println("data is "+t);
}
}
