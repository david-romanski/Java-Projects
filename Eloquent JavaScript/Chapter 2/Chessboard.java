import java.util.Scanner;

public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// David Romanski
		// JavaScript Exercises
		// Created: 04/07/2020
		// Updated: 04/08/2020
		// Eloquent Javascript
		// Chapter 2: Chessboard
		// Comments: Draw a chessboard grid of size
		// Updated to allow input to determine size.
		Scanner input = new Scanner(System.in);
		int size;
		
		do {
			System.out.print("Please enter a positive integer for the size of the requested chessboard: ");
			while (!input.hasNextInt()) {
				System.out.println("I'm sorry, that is not an integer.");
				input.next();
				System.out.print("Please enter a positive integer for the size of the requested chessboard: ");
			} 
			size = input.nextInt();
		} while (size <= 0);
		
		for (int i=0; i < size; i++) {
		  for (int j=0; j < size; j++)
		    if (i%2 == 1)
		      if (j%2 == 0)
		        System.out.print(" ");
		      else System.out.print("#");
	        else if (j%2 == 0)
	        	System.out.print("#");
		    else System.out.print(" ");
		  System.out.println();
		}
		input.close();
	}
}
