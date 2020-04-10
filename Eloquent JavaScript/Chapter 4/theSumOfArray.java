import java.util.Scanner;

public class theSumOfArray {

	public static int[] rangeOfArray(int start, int end) {
		int len = end - start + 1;
		int[] rangeArray = new int[len];
		int index = 0;
		
		for (int i=start; i<=end; i++) {
			rangeArray[index] = i;
			index++;
		}
		return rangeArray;
	}

	public static int[] rangeOfArray(int start, int end, int step) {
		int len;
		if (end>start)
			len = end - start + 1;
		else
			len = start - end + 1;
		int[] rangeArray = new int[len];
		int index = 0;

		if (start < end)
			for (int i=start; i<=end; i += step) {
				rangeArray[index]= i;
				index++;
			}
		  else
			//Since step is needed to we need this separated?
		    for (int i=start; i>=end; i += step) {
		      rangeArray[index]=i;
		      index++;
		    }
		  return rangeArray;
	}

	public static int sumOfArray(int[] rangeArray) {
		  int sumArray = 0;
		  for (int i=0; i<=rangeArray.length-1; i++)
		    sumArray += rangeArray[i];
		  return sumArray;
	}

	public static void main(String[] args) {
		//  David Romanski
		//  JavaScript Exercises
		//  Created: 04/08/2020
		//  Updated: 04/09/2020
		//  Eloquent Javascript
		//  Chapter 4: The Sum Of A Range
		//  Comments: Write a range function that returns an array from beginning to end inclusive. Then write a function that returns the sum of 
		//  array. As a bonus add a third argument in range that performs as a stepper.
		//  NOTE: THIS WAS A TOUGH TRANSLATE!!! (Outputting the arrays)
		//  Updated to include inputs and validation
		Scanner input = new Scanner(System.in);
		int startRange, endRange, stepRange;
		
		System.out.print("Please enter value for the start of the range: ");
		while (!input.hasNextInt()) {
			System.out.println("I'm sorry, I need an integer.");
			input.next();			
			System.out.print("Please enter value for the start of the range: ");
		} startRange = input.nextInt();
		
		System.out.print("Please enter value for the end of the range: ");
		while (!input.hasNextInt()) {
			System.out.println("I'm sorry, I need an integer.");
			input.next();			
			System.out.print("Please enter value for the end of the range: ");
		} endRange = input.nextInt();
		
		do {
			System.out.print("Please enter value for the step: ");
			while (!input.hasNextInt()) {
				System.out.println("I'm sorry, I need an integer.");
				input.next();			
				System.out.print("Please enter value for the step: ");
			} stepRange = input.nextInt();			
		} while(((startRange < endRange) && stepRange < 0) || ((startRange > endRange) && stepRange > 0));
		
		System.out.print("The sum of the range of the sum is: ");
		System.out.println(sumOfArray(rangeOfArray(startRange, endRange, stepRange)));
		
		input.close();
	}
}
