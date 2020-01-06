package tvHWInClass;

import java.util.Scanner;

public class TVTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		TV tv = new TV("TV", 2, false);
		while (true) {

			System.out.print("\nEnter input (X to change status, E to exit program or number to change volume): "
					+ tv.getVol() + " is curent volume. ");
			String input = scan.next();
			if (input.equalsIgnoreCase("X")) {
				System.out.print("TV mute status changed to ");
				tv.changeMute();
			} else if (input.equalsIgnoreCase("E")) {
				System.out.println("Program end.");
				scan.close();
				break;
			} else {
				try {
					tv.changeVol(Integer.parseInt(input)); // Using parseInt to eliminate the 2nd input.
				} catch (NumberFormatException e) {
					System.out.println("You did not enter a number.");
				} catch (InvalidVolumeException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}