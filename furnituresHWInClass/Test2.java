package furnituresHWInClass;

public class Test2 {

	public static void main(String[] args) {
		// This is the same as Test but with the last request in the instructions built
		// into the switch for convenience.

		Furniture[] stuff = new Furniture[20];
		String[] colors = { "Blue", "Red", "Green", "Black", "Orange", "White", "Purple" };

		for (int i = 0; i < stuff.length; i++) {
			int type = (int) (Math.random() * 3 + 1);
			int l = (int) (Math.random() * 10 + 1);
			int w = (int) (Math.random() * 10 + 1);
			int h = (int) (Math.random() * 10 + 1);
			int c = (int) (Math.random() * colors.length);
			switch (type) {
			case 1:
				stuff[i] = new Chair(l, w, h, colors[c], (int) (Math.random() * 4 + 1));
				System.out.println(stuff[i]);
				stuff[i].draw();
				System.out.println("The chair has " + ((Chair) stuff[i]).getLegNum() + " legs.");
				break;
			case 2:
				stuff[i] = new Table(l, w, h, colors[c], (int) (Math.random() * 8 + 1));
				System.out.println(stuff[i]);
				stuff[i].draw();
				System.out.println("The table has " + ((Table) stuff[i]).getSeats() + " seats.");
				break;
			case 3:
				boolean maybe;
				if ((int) (Math.random() * 2) == 0) {
					maybe = false;
				} else {
					maybe = true;
				}
				stuff[i] = new Bed(l, w, h, colors[c], maybe);
				System.out.println(stuff[i]);
				stuff[i].draw();
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