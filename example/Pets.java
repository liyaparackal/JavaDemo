//ABSTRACTION AND INTERFACE
package com.example;

interface Pets {
void eat();

abstract class Dog implements Pets
{
	abstract void bark();
	}
class Dashmund extends Dog
{
	public void eat()
	{
		System.out.println("dashmund is eating bones");
	}
	public void bark()
	{
		System.out.println("dashmund is barking aloud");
	}
	public static void main(String[] args)
	{
		Dashmund d=new Dashmund();
		d.bark();
		d.eat();
	}
}

}
