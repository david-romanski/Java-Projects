// David Romanski
// Create: unknown
// Updated: 04/15/2020
// Introduction to Java Programming
// Y Daniel Liang
// Programming Exercise 11.9
// Comments: Fill a variable sized matrix with 1s and 0s 
// then find the rows and columns with the most 1s.
// Updated to include validation for input.

import java.util.ArrayList;
import java.util.Scanner;

public class ElvenNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Enter the array size n (positive integer): ");
			while (!input.hasNextInt()) {
				System.out.println("I'm sorry, that is not an integer.");
				input.next();
				System.out.print("Enter the array size n (positive integer): ");
			} n = input.nextInt();
		} while (n <= 0);
			
		int[][] randomMatrix = new int[n][n];
				
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				randomMatrix[i][j] = (int)(Math.round(Math.random()));
					
		System.out.println("The random array is");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(randomMatrix[i][j]);
			System.out.println();
		}

		ArrayList<Integer> largestRow = new ArrayList<>();
				
		int largeRow = 0;
		for (int i = 0; i < n; i++) {
			int ones = 0;
			for (int j = 0; j < n; j++)
				ones += randomMatrix[i][j];
			if (ones > largeRow) {
				largeRow = ones;
				largestRow.clear();
				largestRow.add(i);
			} else if (largeRow == ones)
				largestRow.add(i);
		}
			
		System.out.println("The largest row index: " + largestRow);

		ArrayList<Integer> largestColumn = new ArrayList<>();
				
		int largeColumn = 0;
		for (int j = 0; j < n; j++) {
			int ones = 0;
			for (int i = 0; i < n; i++)
				if (randomMatrix[i][j] == 1)
					ones++;
				if (ones > largeColumn) {
					largeColumn = ones;
					largestColumn.clear();
					largestColumn.add(j);
				} else if (largeColumn == ones)
					largestColumn.add(j);
			}

		System.out.println("The largest column index: " + largestColumn);
		input.close();
	}
}
