
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
		//  Eloquent Javascript
		//  Chapter 3: Bean Counting
		//  Comments: Write a function that counts the numbers of Bs in a string
		//       Then write a function that counts the number of any character in a string


		String test1 = "BBbbBB";
		String test2 = "WWwwWW";
		char key2 = 'w';

		System.out.print("Testing countBs with " + test1 + ". Count is: ");
		System.out.println(countBs(test1));
		System.out.print("Testing countChar with " + test2 + " using " + key2 + ". Count is: ");
		System.out.println(countChar(test2, key2));
	}

}
