
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
		// TODO Auto-generated method stub
		//  David Romanski
		//  JavaScript Exercises
		//  Updated: 04/08/2020
		//  Eloquent Javascript
		//  Chapter 4: The Sum Of A Range
		//  Comments: Write a range function that returns an array from beginning to end inclusive. Then write a function that returns the sum of 
		//  array. As a bonus add a third argument in range that performs as a stepper.
		//  NOTE: THIS WAS A TOUGH TRANSLATE!!!

		int[] currRange = rangeOfArray(1,10);
	
		System.out.print("Range from 1 to 10: ");
		for (int i=0; i<currRange.length; i++)
			System.out.print(currRange[i] + " ");
		
		System.out.println();

		int[] currRange2 = rangeOfArray(10,1,-1);

		System.out.print("Range from 10 to 1: ");
		for (int i=0; i<currRange2.length; i++)
			System.out.print(currRange2[i] + " ");
		
		System.out.println();

		int[] currRange3 = rangeOfArray(5,2,-1);
		
		System.out.print("Range from 5 to 2 using step -1: ");
		for (int i=0; i<currRange3.length; i++)
			System.out.print(currRange3[i] + " ");
		
		System.out.println();

		int[] currRange4 = rangeOfArray(1,10);
		
		System.out.print("Sum from 1 to 10: " + sumOfArray(currRange4));

		System.out.println();

		int[] currRange5 = rangeOfArray(1,100,5);
		
		System.out.print("Sum from 1 to 100 using step 5: ");
		System.out.print(sumOfArray(currRange5));
	}

}
