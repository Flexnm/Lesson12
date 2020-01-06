package oopEx;

import java.util.Arrays;

public class Driver {

	private String name;
	private int age;
	private Medal[] medals = new Medal[4];

	public Driver(String name, int age, Medal[] medals) {
		setName(name);
		setAge(age);
		setMedals(medals);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Medal[] getMedals() {
		return medals;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMedals(Medal[] medals) {
		this.medals = medals;
	}
	
	public String toString() {
		return "Driver: " + name + ", " + age + ", [" + Arrays.toString(medals) + "]";
	}

}
