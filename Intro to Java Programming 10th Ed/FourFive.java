// David Romanski
// Create: unknown
// Updated: 04/09/20
// Introduction to Java Programming
// Y Daniel Liang
// Programming Exercise 11.9
// Comments: Determine the area of a polygon.
// Added validation

import java.util.Scanner;

public class FourFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		double s;
		
		do {
			System.out.print("Enter the NUMBER of sides: ");
			while(!input.hasNextInt()) {
				System.out.println("I'm sorry, I need a positive integer.");
				input.next();
				System.out.print("Enter the NUMBER of sides: ");
			} n = input.nextInt();
		}while(n<=0);
			
		do {
			System.out.print("Enter the LENGTH of sides: ");
			while(!input.hasNextDouble()) {
				System.out.println("I'm sorry, I need a positive number");
				input.next();
				System.out.print("Enter the LENGTH of sides: ");
			} s = input.nextDouble();
		} while(s<0);
		
		double area = ((n * Math.pow(s, 2))/(4*Math.tan(Math.PI/n)));
		
		area = Math.round(area*100);
		area = area/100;
		System.out.println(area);
		input.close();
	}
}