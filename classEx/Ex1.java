package classEx;

public class Ex1 {
	public static void main(String[] args) {

		String[] emails = new String[10];

		emails[0] = "One@derp.com";
		emails[1] = "Two@what.co.uk";
		emails[2] = "Three@oof.nails";
		emails[3] = "Four@video.games";
		emails[4] = "Five@java.lang";
		emails[5] = "Six@gmail.com";
		emails[6] = "Seven@walla.co.il";
		emails[7] = "Eight@ynet.net";
		emails[8] = "Nine@gmail.com";
		emails[9] = "Ten@grammar.com";

		for (int i = 0; i < emails.length; i++) {
			String [] email = emails[i].split("@");
			for (int j = 0; j < email.length; j++) {
				System.out.print(email[j] + "\t");
			}
			System.out.println();
		}
	}
}