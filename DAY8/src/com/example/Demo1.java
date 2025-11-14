package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String str=sdf.format(d);
		System.out.println(str);
		
		//OR
//		String str="22/05/2025";
//		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy)");
//		Date d=sdf.parse(str);
		//System.out.println(c.get(Calendar.DATE)+"/"+(c.getCalendar.Month)+1);

	}

}
