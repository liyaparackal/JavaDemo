package com.example;
//METHOD LEVEL SYNC
public class User2 extends Thread{

	public static void main(String[] args) {
		Table tbl=new Table();
		AA2 a=new AA2(tbl);

		a.start();
	}
}
