
public class recursion {

	public static String isEven(int num) {
		  if (num == 0)
		      return "even";
		  if (num == 1)
		      return "odd";
		  return isEven(num-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  David Romanski
		//  JavaScript Exercises
		//  04/07/2020
		//  Eloquent Javascript
		//  Chapter 3: Recursion
		//  Comments: Using recursion determine if a number is odd or even


		int num = 50;
		System.out.print("The number " + num + " is " + isEven(num));
	}

}
