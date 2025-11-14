package com.example;

public class TempSet {

	public static void main(String[] args) {
		 Temp temp = new Temp();

	        temp.setCelsius(25.0);
	        System.out.println("Temperature in Kelvin: " + temp.toKelvin());
	        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());
	}

}
