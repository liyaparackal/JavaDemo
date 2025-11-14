package com.example;
//BYTE ORIENTED WRITING TEXT INTO FILE
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class fis {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\Administrator\\Desktop\\Java Demo\\CC.txt");
//dont  show ascii value
		int i=0;
		String str="welcome";
		fw.write(str);
		// or fw.write("welcomee");
		fw.write("welcomee");
		System.out.println("written well");
		fw.close();
		//while writing its manadatory to close or execn wont be compelte
	}

}
