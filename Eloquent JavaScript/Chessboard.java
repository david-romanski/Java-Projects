
public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// David Romanski
		// JavaScript Exercises
		// 2/24/2020
		// Eloquent Javascript
		// Chapter 2: Chessboard
		// Comments: Draw a chessboard grid of size

		int size = 10;
		for (int i=0; i < size; i++) {
		  for (int j=0; j < size; j++)
		    if (i%2 == 1)
		      if (j%2 == 0)
		        System.out.print(" ");
		      else System.out.print("#");
	        else if (j%2 == 0)
	        	System.out.print("#");
		    else System.out.print(" ");
		  System.out.println();
		}
	}

}
