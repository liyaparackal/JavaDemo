package com.example;

import java.io.File;
import java.io.IOException;
public class Demo {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\Administrator\\Desktop\\Folder1");
		File f2=new File("C:\\Users\\Administrator\\Desktop\\Folder2");
		// File f3=new File("C:\\Users\\Administrator\\Desktop\\Java Demo\\V.txt");
		f1.renameTo(f2);
		//rename a folder
		//f1.mkdir();
		//create a folder
System.out.println("folder created");		
	//System.out.println("folder renamed");

//	try
//	{
//		f3.createNewFile();
//	}
//	catch(IOException e)
//	{
//		e.printStackTrace();
//	}
	}

}
