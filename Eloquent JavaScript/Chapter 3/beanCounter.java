import java.util.Scanner;

public class beanCounter {

	public static int countChar(String word, char key) {
		  int count = 0;
		  for (int i=0; i<word.length(); i++)
		    if (word.charAt(i) == key)
		      count += 1;
		  return count;
	}

	public static int countBs(String word) {
		return countChar(word, 'B');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  David Romanski
		//  JavaScript Exercises
		//  Created: 04/07/2020
		//  Updated: 04/09/2020
		//  Eloquent Javascript
		//  Chapter 3: Bean Counting
		//  Comments: Write a function that counts the numbers of Bs in a string
		//       Then write a function that counts the number of any character in a string
		//  Updated to include inputs and validation
		
		Scanner input = new Scanner(System.in);
		String test;
		String strKey;
		char key;
		
		System.out.print("Please enter a string to search: ");
		test = input.next();
			
		do {
			System.out.print("Please enter a key (char) to search for: ");
			strKey = input.next();
		} while(strKey.length() != 1);
		key = strKey.charAt(0);

		System.out.println(countChar(test, key));

		input.close();
	}
}
