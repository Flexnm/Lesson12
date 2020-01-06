package furnituresHWInClass;

public class Chair extends Furniture {

	private int legNum;

	public Chair(int length, int width, int height, String color, int legNum) {
		super(length, width, height, color);
		this.legNum = legNum;
	}

	public int getLegNum() {
		return legNum;
	}

	public void draw() {
		System.out.println("  i______i");
		System.out.println("  I______I");
		System.out.println("  I      I");
		System.out.println("  I______I");
		System.out.println(" /      /I");
		System.out.println("(______( I");
		System.out.println("I I    I I");
		System.out.println("I      I");
	}

	public String toString() {
		String chair = "This Chair has " + getLegNum() + " legs and its " + super.toString();
		return chair;
	}

}