import java.util.Scanner;
import java.lang.Math;

public class recursion {

	public static String isEven(int num) {
		  if (Math.abs(num) == 0)
		      return "even";
		  if (Math.abs(num) == 1)
		      return "odd";
		  return isEven(Math.abs(num)-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  David Romanski
		//  JavaScript Exercises
		//  Created: 04/07/2020
		//  Updated: 04/09/2020
		//  Eloquent Javascript
		//  Chapter 3: Recursion
		//  Comments: Using recursion determine if a number is odd or even
		//  Added input and validation.
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Please enter integer to determine if odd or even:");
		while(!input.hasNextInt()) {
			System.out.println("I'm sorry, that isn't an integer.");
			input.next();
			System.out.print("Please enter integer to determine if odd or even:");			
		} num = input.nextInt();
		System.out.print("The number " + num + " is " + isEven(num));
		
		input.close();
	}
}
