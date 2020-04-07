
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// David Romanski
		// JavaScript Exercises
		// 04/07/2020
		// Eloquent Javascript
		// Chapter 2: FizzBuzz
		// Comments: From 1 to 100
		// If a number is divisible by 3 it prints Fizz
		// If a number is divisible by 5 it prints Buzz
		// If a number is both it prints FizzBuzz
		
		for (int i=1; i<=100; i++) {
		  if ((i%3 == 0) && (i%5 == 0))
		      System.out.println("FizzBuzz");
		  else if (i%3 == 0) 
			  System.out.println("Fizz");
		  else if (i%5 == 0)
		    System.out.println("Buzz");
		  else System.out.println(i);
		}
	}

}
