//SINGLE LEVEL INHERITANCE
package com.example;
class Persons {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

class Students extends Persons {
    String school;

    void study() {
        System.out.println(name + " is studying at " + school + ".");
    }
}


public class SchoolApp {
	 public static void main(String[] args) {
	        Students s = new Students();
	        s.name = "Liya";
	        s.age = 16;
	        s.school = "VPS";

	        s.introduce(); // inherited from Person
	        s.study();     // defined in Student
	    }

}
