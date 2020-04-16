import java.util.Scanner;
import java.util.Random;

public class threeDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programmer: David Romanski
		// Three Dice Game
		// Created: 04/16/2020
		// Simple random game. Updated input/output and added verification. Also updated for Python3.
		Scanner input = new Scanner(System.in);
		String enter;
		Random rand = new Random();
		int die;
		
		System.out.println("You are given a 6 sided dice.  After you roll you get the amount back in dollars (1 = $1, 2 = $2,...).");
		System.out.println("After you roll once you can keep or roll again. After your second roll you can keep");
		System.out.println("or roll again. After your third roll you muss keep the roll.  Hit enter to roll the first die:");

		System.out.print("Hit enter 'r' to roll the first die: ");
		enter = input.next();
		die = rand.nextInt(6) + 1;
		System.out.println("You rolled a " + die + ".");

		do {
			System.out.println("Do you want to keep your first roll?(y/n): ");
			enter = input.next();
		} while ((enter.charAt(0) != 'y') && (enter.charAt(0) != 'n'));
			
		if (enter.charAt(0) != 'y') {
			System.out.println("Rolling again!!!");
			die = rand.nextInt(6) + 1;
			System.out.println("You rolled a " + die + ".");
			
			do {
				System.out.println("Do you want to keep your second roll?(y/n): ");
				enter = input.next();
			} while ((enter.charAt(0) != 'y') && (enter.charAt(0) != 'n'));

			if (enter.charAt(0) != 'y') {
				System.out.println("Rolling again!!!");
				die = rand.nextInt(6) + 1;
				System.out.println("You rolled a " + die + ".");
			}
		}
		
		System.out.println("You won $" + die + "!!!");
		input.close();
	}
}