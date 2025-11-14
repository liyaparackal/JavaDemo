package com.example;
//BYTE ORIENTED WRITING TEXT INTO FILE
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java Demo\\BB.txt");
	String str="welcome to Ust";
	byte b[]=str.getBytes();
	//should convert to array of bytes
	fos.write(b);
System.out.println("message written");
	}

}
