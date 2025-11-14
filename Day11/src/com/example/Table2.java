package com.example;
//METHOD LEVEL SYNC
public class Table2 {
	public void print(int x)
// IF WE PUT SYNCHRONISED(THIS){} 
	//WE ACQUIRE LOCK ON TABLE CURR OBJ
	//SINCE IT IS CURR CLASS WE USE THIS
	{

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

