package com.example;
sealed class A permits B,C,D
{//SPECIFIES WHO CAN INHERIT WHOM
	//INHERITED CLASS SHOULDNT BE FINAL
	public void printn()
{System.out.println("default");}
}
non-sealed class B extends A
{
	public void printn()
	{System.out.println("A");}	
}


//public class C extends B{
//sealed class C extends A {
//current java version doesnt support sealedC to extend-we may use FINAL OR NON SELAED
non-sealed class C extends A {

	public void printn()
	{System.out.println("C");}	

}
final class D extends A {

	public void printn()
	{System.out.println("D");}	

}

