package furnituresHWInClass;

public class Bed extends Furniture {

	private boolean couple;

	public Bed(int length, int width, int height, String color, boolean couple) {
		super(length, width, height, color);
		this.couple = couple;
	}

	public boolean getCouple() {
		return couple;
	}

	public void draw() {
		System.out.println("   ||");
		System.out.println("   ||                   ||");
		System.out.println("||/||___                ||");
		System.out.println("|| /`   )____________||_/|");
		System.out.println("||/___ //_/_/_/_/_/_/||/ |");
		System.out.println("||(___)/_/_/_/_/_/_/_||  |");
		System.out.println("||     |_|_|_|_|_|_|_|| /|");
		System.out.println("||     | | | | | | | ||/||");
		System.out.println("||~~~~~~~~~~~~~~~~~~~||");
		System.out.println("||                   ||");
	}

	public String toString() {
		String bed = "This Bed is ";
		if (getCouple() == true) {
			bed += "for a couple ";
		} else {
			bed += "for a single person ";
		}
		bed += "and its " + super.toString();
		return bed;
	}

}