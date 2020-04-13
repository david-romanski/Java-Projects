import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reversingAnArray {

	public static List<Character> reverseArray(List<Character> arrayIn) {
		  List<Character> arrayOut = new ArrayList<Character>();
		  for (int i=0; i<arrayIn.size(); i++)
		    arrayOut.add(arrayIn.get((arrayIn.size()-1)-i));
		  return arrayOut;
	}

	public static List<Character> reverseArrayInPlace(List<Character> arrayIn) {
		  char temp = arrayIn.get(0);
		  for (int i=0; i<arrayIn.size(); i++)
		    arrayIn.set(i, arrayIn.get((arrayIn.size()-1)-i));
		  arrayIn.set(arrayIn.size()-1, temp);
		  return arrayIn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// David Romanski
		// JavaScript Exercises
		// 04/13/2020
		// Eloquent Javascript
		// Chapter 4: Reversing An Array
		// Comments: Given an array return a new array with everything reversed, then reverse array without using a new array.


		List<Character> test = Arrays.asList('A','B','C');
		System.out.println("Reversing array " + test);
		System.out.println(reverseArray(test));

		System.out.println("Reversing array in place " + test);
		System.out.println(reverseArrayInPlace(test));

		test = Arrays.asList('1', '2', '3', '4', '5');
		System.out.println("Reversing array " + test);
		System.out.println(reverseArray(test));

		System.out.println("Reversing array in place " + test);
		System.out.println(reverseArrayInPlace(test));
	}
}