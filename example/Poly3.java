//RUNTIME POLYMORPHISM
package com.example;
class Writer {
    void write() {
        System.out.println("Writing Articles");
    }
}

class Poet extends Writer {
    @Override
    void write() {
        System.out.println("Writing a poem...");
    }
}


public class Poly3 {
	public static void main(String[] args) {
        Writer w = new Poet(); 
        w.write();
        Writer ww=new Writer();
        ww.write();
        		// overridden method in Poet
    }
}
