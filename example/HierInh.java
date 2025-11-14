package com.example;
class Person {
    public void greet() {
        System.out.println("Hello! I am a person.");
    }
}
class Teacher extends Person {
    public void teach() {
        System.out.println("Teacher is teaching.");
    }
}
class Student extends Person {
    public void study() {
        System.out.println("Student is studying.");
    }
}
public class HierInh {

	public static void main(String[] args) {
		Teacher t = new Teacher();
        Student s = new Student();

        t.greet();   // Inherited from Person
        t.teach();   // Defined in Teacher

        s.greet();
        s.study();   // Defined in Student
	}

}
