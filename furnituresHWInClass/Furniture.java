package furnituresHWInClass;

public abstract class Furniture {
	
	// Abstract super class with the universal attributes and methods. I didnt think
		// setters are really needed.
		private int length;
		private int width;
		private int height;
		private String color;

		public Furniture(int length, int width, int height, String color) {
			this.length = length;
			this.width = width;
			this.height = height;
			this.color = color;
		}

		public double getLength() {
			return length;
		}

		public double getWidth() {
			return width;
		}

		public double getHeight() {
			return height;
		}

		public String getColor() {
			return color;
		}

		public abstract void draw();

		public String toString() {
			String furniture = "Furniture charactaristics are: [Length: " + getLength() + ", Width: " + getWidth()
					+ ", Height: " + getHeight() + ", Color: " + getColor() + "]";
			return furniture;
		}

}
