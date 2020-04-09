import java.util.Scanner;

public class minimum {

	public static String min(int num1, int num2) {
		  if (num1 == num2)
		    return "both are equal.";
		  else if (num1 > num2)
		    return Integer.toString(num2);
		  else return Integer.toString(num1);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  David Romanski
		//  JavaScript Exercises
		//  Created: 04/07/2020
		//  Updated: 04/09/2020
		//  Eloquent Javascript
		//  Chapter 3: Minimum
		//  Comments: Give 2 numbers displays the minimum number
		//  Updated to include inputs and validation.
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Please enter two integer to determine the minimum.");

		System.out.print("Please enter first integer:");
		while(!input.hasNextInt()) {
			System.out.println("I'm sorry, that wasn't an integer.");
			input.next();
			System.out.print("Please enter first integer:");				
		} num1 = input.nextInt();
		
		System.out.print("Please enter second integer:");
		while(!input.hasNextInt()) {
			System.out.println("I'm sorry, that wasn't an integer.");
			input.next();
			System.out.print("Please enter second integer:");				
		} num2 = input.nextInt();
		
		System.out.print("Between " + num1 + " and " + num2 + " the minimum is ");
		System.out.print(min(num1, num2));
		
		input.close();
	}
}
