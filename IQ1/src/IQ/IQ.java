package IQ;

public class IQ {

	public static void main(String[] args) {

		// Initializing an array

		double[] testResults = { 40, 80, 120, 200, 250 };

		// Declare variable and initialize it to 0

		double total = 0;

		// iterate through the for loop testResults

		for (int i = 0; i < testResults.length; i++) {

			total = total + testResults[i];
		}

		/*
		 * testResults returns the number of elements present in the array
		 */

		// Calculates average
		double averageIq = total / testResults.length;

		// Displays the input add conditional statements for the different scores

		if (averageIq >= 130) {
			System.out.println("Very Superior");
		} else if (averageIq >= 120 && averageIq <= 129) {
			System.out.println("Superior");
		} else if (averageIq >= 110 && averageIq <= 119) {
			System.out.println("High Average");
		} else if (averageIq >= 90 && averageIq <= 109) {
			System.out.println("Average");
		} else if (averageIq >= 80 && averageIq <= 89) {
			System.out.println("Low Average");
		}

		else if (averageIq >= 70 && averageIq <= 79) {
			System.out.println("Borderline");
		} else if (averageIq >= 0 && averageIq <= 69) {
			System.out.println("Extremely Low");
		}

		System.out.println(averageIq);
	}

}
