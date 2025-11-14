//ENCAPSULATION
package com.example;

public class Temp {
	 private double celsius;

	    public void setCelsius(double celsius) {
	        this.celsius = celsius;
	    }
	    public double toKelvin() {
	        return celsius + 273.15;
	    }
	    public double toFahrenheit() {
	        return (celsius * 9/5) + 32;
	    }
}
