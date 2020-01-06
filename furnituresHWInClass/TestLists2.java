package furnituresHWInClass;

import java.util.ArrayList;

public class TestLists2 {
	
	public static void main(String[] args) {
		// This is the same as Test but with the last request in the instructions built
		// into the switch for convenience.

		ArrayList<Furniture> stuff = new ArrayList<Furniture>();
		String[] colors = { "Blue", "Red", "Green", "Black", "Orange", "White", "Purple" };

		for (int i = 0; i < (int) (Math.random() * 16 + 5); i++) {
			int type = (int) (Math.random() * 3 + 1);
			int l = (int) (Math.random() * 10 + 1);
			int w = (int) (Math.random() * 10 + 1);
			int h = (int) (Math.random() * 10 + 1);
			int c = (int) (Math.random() * colors.length);
			switch (type) {
			case 1:
				stuff.add(new Chair(l, w, h, colors[c], (int) (Math.random() * 4 + 1)));
				System.out.println(stuff.get(i));
				stuff.get(i).draw();
				System.out.println("The chair has " + ((Chair) stuff.get(i)).getLegNum() + " legs.");
				break;
			case 2:
				stuff.add(new Table(l, w, h, colors[c], (int) (Math.random() * 8 + 1)));
				System.out.println(stuff.get(i));
				stuff.get(i).draw();
				System.out.println("The table has " + ((Table) stuff.get(i)).getSeats() + " seats.");
				break;
			case 3:
				boolean maybe = (int) (Math.random() * 2) == 0 ? false : true;
				stuff.add(new Bed(l, w, h, colors[c], maybe));
				System.out.println(stuff.get(i));
				stuff.get(i).draw();
				if (maybe == true) {
					System.out.println("The bed is a couples bed.");
				} else {
					System.out.println("The bed is a singles bed.");
				}
				break;
			}
		}
	}

}
