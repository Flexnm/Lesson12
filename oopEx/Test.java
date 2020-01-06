package oopEx;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		Circuit[] circuits = new Circuit[4];

		// dates:
		ArrayList<String> dates = new ArrayList<String>();
		
		while (dates.size() < 30) {
			int d = (int) (Math.random() * 30 + 1);
			int m = (int) (Math.random() * 30 + 1);
			int y = (int) (Math.random() * 60 + 1960);
			dates.add("(" + d + "/" + m + "/" + y + ")");
		}
		
		int lengthavg = 0; // Average length of circuits.
		int ageavg = 0; // Average age of drivers.
		int earliest = 3000; // Earliest model year.
		int agec = 0; // Counter for ages.
		int first = 0; // Counter for first places.
		int third = 0; // Counter for third places.
		
		ArrayList<String> achievements = new ArrayList<String>(); // List of dates of first places.
		
		for (int a = 0; a < circuits.length; a++) { // Circuits
			Car[] cars = new Car[10];
			for (int b = 0; b < cars.length; b++) { // Cars
				Driver[] drivers = new Driver[2];
				for (int c = 0; c < drivers.length; c++) { // Drivers
					Medal[] medals = new Medal[4];
					for (int d = 0; d < medals.length; d++) { // Medals
						int position = (int) (Math.random() * 3 + 1);
						String date = dates.get((int) (Math.random() * dates.size()));
						medals[d] = new Medal(position, date);
						if (position == 1) { // Position checkers
							first++;
							achievements.add(date); // Adding first place date to the list.
						} else if (position == 3) {
							third++;
						}
					} // Medals
					
					String driverName = "Driver #" + (int) (Math.random() * 1000 + 1);
					int age = (int) (Math.random() * 61 + 20);
					ageavg += age; // Summing ages.
					drivers[c] = new Driver(driverName, age, medals);
					agec++; // Counting ages
				} // Drivers
				
				String carModel = "Model T" + (int) (Math.random() * 1000 + 1);
				int year = (int) (Math.random() * 60 + 1960);
				cars[b] = new Car(carModel, year, drivers);
				if (earliest > year) { // Checking for oldest car.
					earliest = year;
				}
			} // Cars
			
			String Cname = "Circuit #" + (int) (Math.random() * 10 + 1);
			String Ccountry = "Country " + (int) (Math.random() * 100 + 100);
			int length = (int) (Math.random() * 27 + 4);
			lengthavg += length; // Summing lengths.
			circuits[a] = new Circuit(Cname, Ccountry, length, cars);
		} // Circuits
		
		System.out.println("Average length of circuits: " + lengthavg / 4);
		System.out.println("Average driver age: " + ageavg / agec);
		System.out.println("Oldest car model: " + earliest);
		System.out.println("List of years when a first place was achieved: " + achievements);
		System.out.println("Number of first place: " + first);
		System.out.println("Number of third place: " + third);
		System.out.println(Arrays.toString(circuits));
	}
}