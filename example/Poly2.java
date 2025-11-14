package com.example;
class Printer {
    void print() {
        System.out.println("Printing a blank page");
    }

    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    void print(int copies) {
        System.out.println("Printing " + copies + " copies");
    }

    void print(String text, int copies) {
        System.out.println("Printing \"" + text + "\" " + copies + " times");
    }
}
public class Poly2 {
	 public static void main(String[] args) {
	        Printer p = new Printer();
	        p.print();
	        p.print("Hello World");
	        p.print(3);
	        p.print("Java Rocks", 2);
	    }
}
