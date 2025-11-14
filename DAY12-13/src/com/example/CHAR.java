package com.example;
//BYTE ORIENTED WRITING TEXT INTO FILE
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CHAR {

	public static void main(String[] args) throws IOException {
		FileReader fis=new FileReader("C:\\Users\\Administrator\\Desktop\\Java Demo\\CC.txt");
//System.out.println(fis.read())-only show ascii val of 1st char
		int i=0;
		while((i=fis.read())!=-1)
		{
			// System.out.print(i);
			System.out.print((char)i);
			//con ascii to char
		}
	}

}
