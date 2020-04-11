// David Romanski
// Create: unknown
// Computer Lab Project
// Monty Hall Puzzle
// Comments: One of the three paradoxes. There are three doors: one with a prize and two 
// with goats. You can choose a door then a goat is revealed. Then you can change your 
// choice or keep your choice. This program allows you to choose if you change or not and 
// run this selection multiple times.

import java.util.Scanner;

public class MontyHallPuzzle {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//String choice = "";
		
		System.out.print("How many times would you like to loop? ");
		int iteration = input.nextInt();
		System.out.print("Which door would you like to pick? ");
		int answer = input.nextInt();
		System.out.print("Would you like to change your choice?(y/n) ");
		String choice = input.next();
		int count = 0;
		int wins = 0;
		int loses = 0;
		double percentageWins;
		
		input.close();

		while (count<iteration) {
		
		double random = Math.random();
//		System.out.println("random number: " + random);
		int prize = (int)(random/34 * 100) + 1;
//		System.out.println("Prize = " + prize);
//		System.out.println("There are three boxes.  One of them has a prize and two of them have goats!");
//		System.out.print("Please pick a box: ");
//		int answer = input.nextInt();
		switch (answer) {
		case 1 : 
				if (prize == 2) {
					System.out.println("The prize is not in box 3.  Do you want to switch?(y/n)");
//					choice = input.next();
					if (choice.equals("y"))
						answer = 2;
				}
				else {
					System.out.println("The prize is not in box 2.  Do you want to switch?(y/n)");
//					choice = input.next();
					if (choice.equals("y"))
						answer = 3;
				}
				if (answer == prize) {
					System.out.println("You won!!!");
					wins++;
				}
				else {
					System.out.println("Sorry, you lost.");
					loses++;
				}
				break;
		case 2 : 
			if (prize == 1) {
				System.out.println("The prize is not in box 3.  Do you want to switch?(y/n)");
//				choice = input.next();
				if (choice.equals("y"))
					answer = 1;
			}
			else {
				System.out.println("The prize is not in box 1.  Do you want to switch?(y/n)");
//				choice = input.next();
				if (choice.equals("y"))
					answer = 3;
			}
			if (answer == prize) {
				System.out.println("You won!!!");
				wins++;
			}
			else {
				System.out.println("Sorry, you lost.");
				loses++;
			}
			break;
		case 3 : 
			if (prize == 1) {
				System.out.println("The prize is not in box 2.  Do you want to switch?(y/n)");
//				choice = input.next();
				if (choice.equals("y"))
					answer = 1;
			}
			else {
				System.out.println("The prize is not in box 1.  Do you want to switch?(y/n)");
//				choice = input.next();
				if (choice.equals("y"))
					answer = 2;
			}
			if (answer == prize) {
				System.out.println("You won!!!");
				wins++;
			}
			else {
				System.out.println("Sorry, you lost.");
				loses++;
			}
			break;
				
		default: System.out.println(answer);
		}
		percentageWins = (double)wins/((double)wins+(double)loses) * 100;
		System.out.println("Wins: " + wins + " Loses: " + loses + " Percentage Wins: " + percentageWins + "%");
		count++;
		}
	}
}