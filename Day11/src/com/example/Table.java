package com.example;
//BLOCK LEVEL SYNC
public class Table {
	public void print(int x)
	//FOR OBJECT LEVEL USE PUBLIC STATIC SYNCHRONIZED VOID PRINT
// IF WE PUT SYNCHRONISED(THIS){} -we r locking a whole block via curr class obj(table obj) ex)100-500 ,then 600-1000 and so on 
	//WE ACQUIRE LOCK ON TABLE CURR OBJ
	//SINCE IT IS CURR CLASS WE USE THIS
	{
synchronized(this) {
	for(int i=1;i<=5;i++)

	{

	System.out.println(i*x);

	try {

	Thread.sleep(3000);

	} catch (InterruptedException e) {

	// TODO Auto-generated catch block

	 e.printStackTrace();
	}
	}
	}
	}
}

