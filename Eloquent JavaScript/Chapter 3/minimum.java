
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
		//  4/07/2020
		//  Eloquent Javascript
		//  Chapter 3: Minimum
		//  Comments: Give 2 numbers displays the minimum number

		int num1 = 100;
		int num2 = 10;
		System.out.print("Between " + num1 + " and " + num2 + " the minimum is ");
		System.out.print(min(num1, num2));
	}

}
