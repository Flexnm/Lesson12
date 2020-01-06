package oopEx;

public class Medal {

	private int position; // must be 1 or 2 or 3.
	private String date;
	

	public Medal(int position, String date) {
		setPosition(position);
		setDate(date);
	}

	public int getPosition() {
		return position;
	}

	public String getDate() {
		return date;
	}

	public void setPosition(int position) {
		if (position >= 1 && position <= 3) {
			this.position = position;
		}	
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String toString() {
		return "Pos: " + position + ", Date: " + date;
	}

}
