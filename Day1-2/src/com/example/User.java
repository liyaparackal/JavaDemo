package com.example;
import javax.swing.JOptionPane;
public class User {
	public static void main(String[] args) {
String s1=JOptionPane.showInputDialog("enter num1");
String s2=JOptionPane.showInputDialog("enter num2");
//JOptionPane.showMessageDialog(jb,"hai"+ name+"welcome"); this wont work
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);

JOptionPane.showMessageDialog(null,"hai "+ (a+b));
//only if component is null -we will get result else error


//accessing static main method
	}

}
