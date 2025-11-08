package com.example;
import javax.swing.JOptionPane;
public class Checkj {

	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("enter num");
		int a=Integer.parseInt(s1);
		if(a%2==0) {
			JOptionPane.showMessageDialog(null,"even");}
		else {
			JOptionPane.showMessageDialog(null,"odd");
			}
		}
		// TODO Auto-generated method stub
	}


