//ABSTRACTION AND INTERFACE
package com.example;

public interface Food {

	void color();

	abstract class Vegetable implements Food
	{
		abstract void nutrients();
		}
	class Carrots extends Vegetable
	{
		public void color()
		{
			System.out.println("Carrot is orange in color");
		}
		public void nutrients()
		{
			System.out.println("Carrot has several vitamins");
		}
		public static void main(String[] args)
		{
			Carrots d=new Carrots();
			d.color();
			d.nutrients();
		}
	}

	}
