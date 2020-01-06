package moreAboutStrings;

import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {

		String str1 = "Hello"; // Making a new String Object.

		String str2 = new String("Hello 2"); // The actual syntax when making a new String Object.

		// Information of String Objects:

		System.out.println("Length: " + str1.length());
		System.out.println("char at index: " + str1.charAt(1)); // String.charAt(index)
		System.out.println("Last char: " + str1.charAt(str1.length() - 1));
		// System.out.println("char at index: " + str1.charAt(str1.length())); Error
		System.out.println("Index of char: " + str1.indexOf('e')); // String.indexOf(char) or String.indexOf(String) <-
																	// will return the index of the first character.
		// If this will look for a char that does not exist in the String Object, it
		// will return -1.
		System.out.println("Last index of char 'l': " + str1.lastIndexOf("l")); // String.lastIndexOf(String) <- returns
																				// the
		// index of the first occurrence of the
		// String going from the end of the original
		// String going backwards.
		System.out.println("Is \"ell\" in str1? " + str1.contains("ell")); // String.contains(String) <- returns boolean
																			// if the String is in the original String
																			// Object.
		System.out.println("Start with 'H': " + str1.startsWith("H")); // String.startWith(String) <- returns boolean if
																		// the Original String starts with the specified
																		// String.
		System.out.println("Start with 'e' at index: " + str1.startsWith("e", 1)); // String.startWith(String, index) <-
																					// returns
		// boolean if the Original String starts
		// with the specified String at the
		// specified index.
		System.out.println("Substring from index 3: " + str1.substring(3)); // String.substring(index) <- returns a
																			// String starting at index.
		System.out.println("Substring from 0 to 4: " + str1.substring(0, 4)); // String.substring(index1, index2) <-
																				// returns a String starting at index1
																				// and ends at (index2 - 1).
		System.out.println("replace 'l' with 'g': " + str1.replace('l', 'g')); // String.replace(char, char) replaces
																				// the specified character with a new
																				// character.
		System.out.println("str1 comapre to str2: " + str1.compareTo(str2)); // String1.compareTo(String2) <- returns a
																				// number that is the difference in
																				// unicode value of the first characters
																				// that have difference in unicode
																				// value. If returns 0 then both strings
																				// are identical.
		// All actions on a String Object creates a new String Object. The original
		// String Object never changes in memory: It is Immutable.
		System.out.println("str1: " + str1);

		String sentence = "Hello world! How are you?";
		// String.split(String) creates an Array Object with elements that consist of
		// parts of the original String that are separated by the specified String
		// Object in the ().
		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));

		StringBuilder builder = new StringBuilder(); // Is used for strings that need to be changed.
		for (int i = 0; i < 10; i++) {
			builder.append("b");
		}

		System.out.println("builder: " + builder); // Default size of 16 and is doubling its size whenever it needs more
													// memory space.
	}

}
