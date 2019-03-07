package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        String dir = args[1];
        System.out.println("Scanning dir " + dir);
        Car bmv = new Car();
        System.out.println( "Hello World!" );
        System.out.println("Hello :D"+bmv.getBrand());
        System.out.println("Hellow");
    }
}

class Car {
    private String brand = "Somewhat";

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}


}
