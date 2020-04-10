//  David Romanski
//  Created: 04/10/2020
//  Find Primes
//  Comments: This program finds all the primes of a number

import java.util.*;

public class findPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 144;
		int remainder = number1;
		int tempRem;
		List<Integer> factorsArray = new ArrayList<Integer>();

		System.out.println("Number is " + number1);

		while (true) {
			tempRem = remainder;
			for(int i = 2; i < remainder; i++)
				if (remainder%i == 0) {
					System.out.print(i);
					factorsArray.add(i);
					remainder = remainder/i;
					break;
				}
			if (tempRem == remainder) {
				factorsArray.add(remainder);
				System.out.println(remainder);
				break;
			}
		}
		
		System.out.println("Prime factors are: " + factorsArray);
	}
}