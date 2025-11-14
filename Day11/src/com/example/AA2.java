package com.example;
//METHOD LEVEL SYNC
public class AA2 extends Thread{

	Table t;

	AA2(Table t)

	{

	this.t=t;

	}

	public void run()

	{

	t.print(100);

	}
	//FOR OBJECT LEVEL-ITS STATIC -SO JUST RUN P V RUN USING Table.print() ie class name 
	//and PUT STATIC SYNCHRONISED IN PUBLIC STATIC SYNHRONISED VOID
	
	/* 
	 public class AA2 extends Thread{

	Table t;
	public void run()

	{

	t.print(100);

	}
	 */

}
