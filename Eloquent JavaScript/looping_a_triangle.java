
public class looping_a_triangle {

	public static void main(String[] args) {
		//  David Romanski
		//  JavaScript Exercises
		//  4/7/2020
		//  Eloquent Javascript
		// Chapter 2: Looping A Triangle

		for (int i=0; i<7; i++) {
		  String line = "";
		  for (int j=0; j<i; j++)
		    line += "#";
		  System.out.println(line);
		}
	}

}
