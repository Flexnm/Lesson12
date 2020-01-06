package furnituresHWInClass;

public class Test {

	public static void main(String[] args) {

		Furniture[] stuff = new Furniture[20]; // Creating the furniture array.
		String[] colors = { "Blue", "Red", "Green", "Black", "Orange", "White", "Purple" }; // Array of colors to
																							// randomize from, length of
																							// this array is arbitrary.
		for (int i = 0; i < stuff.length; i++) {
			int type = (int) (Math.random() * 3 + 1); // This will randomize the type of Furniture Object.
			int l = (int) (Math.random() * 10 + 1); // Random length
			int w = (int) (Math.random() * 10 + 1); // Random Width
			int h = (int) (Math.random() * 10 + 1); // Random height
			int c = (int) (Math.random() * colors.length); // Random color from the array.
			// All these random numbers above are arbitrary and can be anything.

			switch (type) { // Using a switch to randomize the elements of the array.
			// The unique attribute is calculated when it is relevant.
			case 1: // Chair
				stuff[i] = new Chair(l, w, h, colors[c], (int) (Math.random() * 4 + 1));
				break;

			case 2: // Table
				stuff[i] = new Table(l, w, h, colors[c], (int) (Math.random() * 8 + 1));
				break;

			case 3: // Bed
				boolean maybe;
				if ((int) (Math.random() * 2) == 0) { // If the Object is a bed, only then randomize for couple/single
					maybe = false;
				} else {
					maybe = true;
				}
				stuff[i] = new Bed(l, w, h, colors[c], maybe);
				break;
			}
		}
		for (int i = 0; i < stuff.length; i++) { // This is the last request (number 10) in the instructions.
			System.out.println(stuff[i]); // Printing the display (aka toString).
			stuff[i].draw(); // The draw.
			// Checking the element type to then print the unique line that was asked for.
			if (stuff[i] instanceof Chair) {
				System.out.println("The chair has " + ((Chair) stuff[i]).getLegNum() + " legs.");
			} else if (stuff[i] instanceof Table) {
				System.out.println("The table has " + ((Table) stuff[i]).getSeats() + " seats.");
			} else if (stuff[i] instanceof Bed) {
				if (((Bed) stuff[i]).getCouple() == true) {
					System.out.println("The bed is a couples bed.");
				} else {
					System.out.println("The bed is a singles bed.");
				}
			}
		}
	}
}