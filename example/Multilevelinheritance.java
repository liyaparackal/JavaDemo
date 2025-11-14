package com.example;

class Vehicle {
    public void start() {
        System.out.println("Vehicle started.");
    }
}
class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving.");
    }
}
class ElectricCar extends Car {
    public void charge() {
        System.out.println("Electric car is charging.");
    }
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		ElectricCar v = new ElectricCar();

        v.start();   // Inherited from Vehicle
        v.drive();   // Inherited from Car
        v.charge();  // Defined in ElectricCar
	}

}
