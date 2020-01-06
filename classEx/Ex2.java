package classEx;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Text: ");
		String text = scan.nextLine();
		
		StringBuilder newText = new StringBuilder();

		for (int i = text.length() - 1; i >= 0; i--) {
			newText.append(text.charAt(i));
		}
		
		System.out.println("Reverse: " + newText);
		
		StringBuilder newText2 = new StringBuilder();
		newText2.append(text);
		System.out.println("StringBuilder.reverse()  " + newText2.reverse());
		
		scan.close();
	}
}