package oopEx;

import java.util.Arrays;

public class Car {

	private String model;
	private int year; // between 1960 - 2019.
	private Driver[] drivers = new Driver[2];

	public Car(String model, int year, Driver[] drivers) {
		setModel(model);
		setYear(year);
		setDrivers(drivers);
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public Driver[] getDrivers() {
		return drivers;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		if (year >= 1960 && year <= 2019) {
			this.year = year;
		}
	}

	public void setDrivers(Driver[] drivers) {
		this.drivers = drivers;
	}
	
	public String toString() {
		return "Car: " + model + ", " + year + ", Drivers: " + "[" + Arrays.toString(drivers) + "]";
	}

}
