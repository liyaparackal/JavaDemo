//ABSTRACTION AND INTERFACE
package com.example;

public interface English {
	void info();

	abstract class Alphabets implements English
	{
		abstract void displaylist();
		}
	class Vowels extends Alphabets
	{
		public void info()
		{
			System.out.println("English has 26 Alphabets");
		}
		public void displaylist()
		{
			System.out.println("A,E,I,O,U are vowels");
		}
		public static void main(String[] args)
		{
			Vowels d=new Vowels();
			d.info();
			d.displaylist();
		}
	}


}
