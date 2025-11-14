package com.example;

import java.io.*;

public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EmployeeBean eb=new EmployeeBean(101,"liya",321);
		//id is transient so op will be shown as 0 not 101
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\demo.ser");
		//created an ser or txt file
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(eb);
		//wrote data as stream object into it
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Desktop\\demo.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		EmployeeBean e=(EmployeeBean)ois.readObject();
		//user reads and cconverts back
		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());
	}

}
