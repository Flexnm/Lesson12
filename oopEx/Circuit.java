package oopEx;

import java.util.Arrays;

public class Circuit {

	private String name;
	private String country;
	private int length; // km between 4 - 30.
	private Car[] cars = new Car[10];

	public Circuit(String name, String country, int length, Car[] cars) {
		setName(name);
		setCountry(country);
		setLength(length);
		setCars(cars);
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public int getLength() {
		return length;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLength(int length) {
		if (length >= 4 && length <= 30) {
			this.length = length;
		}
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	
	
	public String toString() {
		return "Name: " + name + ", Length: " + length + ", Country: " + country + "[" + Arrays.toString(cars) + "]";
	}

}
