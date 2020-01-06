package furnituresHWInClass;

import java.util.ArrayList;

public class TestLists { // Same as Test but with ArrayLists.

	public static void main(String[] args) {

		ArrayList<Furniture> stuff = new ArrayList<Furniture>();
		String[] colors = { "Blue", "Red", "Green", "Black", "Orange", "White", "Purple" };

		for (int i = 0; i < (int) (Math.random() * 16 + 5); i++) {
			int type = (int) (Math.random() * 3 + 1);
			int l = (int) (Math.random() * 10 + 1);
			int w = (int) (Math.random() * 10 + 1);
			int h = (int) (Math.random() * 10 + 1);
			int c = (int) (Math.random() * colors.length);

			switch (type) {
			case 1: // Chair
				stuff.add(new Chair(l, w, h, colors[c], (int) (Math.random() * 4 + 1)));
				break;

			case 2: // Table
				stuff.add(new Table(l, w, h, colors[c], (int) (Math.random() * 8 + 1)));
				break;

			case 3: // Bed
//				boolean maybe;
//				if ((int) (Math.random() * 2) == 0) {
//					maybe = false;
//				} else {
//					maybe = true;
//				}
//				stuff.add(new Bed(l, w, h, colors[c], maybe));
//				break;
				// More efficient if + else code is the 'condition' ? if true : else' line.
				stuff.add(new Bed(l, w, h, colors[c], (int) (Math.random() * 2) == 0 ? false : true));
			}
		}
		for (Furniture furniture : stuff) {
			System.out.println(furniture);
			furniture.draw();
			if (furniture instanceof Chair) {
				System.out.println("The chair has " + ((Chair) furniture).getLegNum() + " legs.");
			} else if (furniture instanceof Table) {
				System.out.println("The table has " + ((Table) furniture).getSeats() + " seats.");
			} else if (furniture instanceof Bed) {
				if (((Bed) furniture).getCouple() == true) {
					System.out.println("The bed is a couples bed.");
				} else {
					System.out.println("The bed is a singles bed.");
				}
			}
		}
	}
}