package longWords;

import java.util.Scanner;

public class longWords {

	public static void main(String[] args) {

		// invoke a scanner object

		Scanner userInput = new Scanner(System.in);

		// Get the input from the user

		System.out.println("\n Enter any number of words (0-Exit):");

		String strArr = "";

		// invoke a while loop for when user enters 0 so it ends the input
		while (true) {

			// Stores input from user

			String word = userInput.next();

			// Condition if user enters 0

			if (word.equals("0")) {

				break;
			}

			strArr = strArr + word + "\n";
		}

		// declare an array of words and split the words array into single letters

		String words[] = strArr.split("\n");

		// Display the input

		System.out.println("\nWords are: \n");

		int count = 0;

		int sum = 0;

		// Iterate through the array an display input of words

		for (int i = 0; i < words.length; i++) {

			System.out.println(words[i]);

			// Checks for words longer than 4 letters
			if (words[i].length() > 4) {

				count = count + 1;
			}

			sum = sum + words[i].length();
		}

		// Calculate average length of the words

		double avg = (double) sum / words.length;

		// Displays the input

		System.out.println("\n The number of words longer than 4 letters : " + count);

		System.out.println("\n The average length of the words " + avg);

		System.out.println("\n");

	}

}
