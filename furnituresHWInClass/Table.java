package furnituresHWInClass;

public class Table extends Furniture {

	private int numOfSeats;

	public Table(int length, int width, int height, String color, int numOfSeats) {
		super(length, width, height, color);
		this.numOfSeats = numOfSeats;
	}

	public int getSeats() {
		return numOfSeats;
	}

	public void draw() {
		System.out.println("   =====================");
		System.out.println("  /                   /");
		System.out.println(" /                   /|");
		System.out.println("===================== |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
	}

	public String toString() {
		String table = "This Table has " + getSeats() + " seats and its " + super.toString();
		return table;
	}

}
