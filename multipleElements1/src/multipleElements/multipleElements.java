package multipleElements;

import java.util.Scanner;

public class multipleElements {

	public static void main(String[] args) {

		// invoke a scanner object

		Scanner sc = new Scanner(System.in);

		// declare a 2 dimensional array of size 3 rows and 4 columns

		int[][] multipleElementArr = new int[3][4];

		System.out.println("Enter 4 integers");

		// Get the input from the user

		for (int i = 0; i < 4; i++) {

			multipleElementArr[0][i] = sc.nextInt();
		}

		// Calculate the multiples and store them in the first and second rows

		for (int i = 0; i < 4; i++) {
			multipleElementArr[1][i] = multipleElementArr[0][i] * 2;

			multipleElementArr[2][i] = multipleElementArr[0][i] * 3;

		}

		// Display the input

		for (int i = 0; i < 3; i++)

			for (int j = 0; j < 4; j++)

				System.out.print(multipleElementArr[i][j] + "\t");

		System.out.println();

	}
}
