import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BruteForce {

	public static List<Integer> findPrimes(int remainder) {
		int tempRem;
		List<Integer> factorsArray = new ArrayList<Integer>();
		
		System.out.print("Primes for " + remainder + ": ");
		while (true) {
			tempRem = remainder;
			for(int i = 2; i < remainder; i++)
				if (remainder%i == 0) {
					System.out.print(i + " ");
					factorsArray.add(i);
					remainder = remainder/i;
					break;
				}
			if (tempRem == remainder) {
				factorsArray.add(remainder);
				System.out.println(remainder);
				break;
			}
		}
		return factorsArray;
	}
		
	public static int GCF(int num1, int num2, int num3) {
		// This is used to reduce the original quadratic equation
		// TODO: Allow removal of negatives
		int number1 = num1;
		List<Integer> num1Array = new ArrayList<Integer>();
		int number2 = num2;
		List<Integer> num2Array = new ArrayList<Integer>();
		int number3 = num3;
		List<Integer> num3Array = new ArrayList<Integer>();
		List<Integer> commonFactors = new ArrayList<Integer>();

		num1Array = findPrimes(number1);
		num2Array = findPrimes(number2);
		num3Array = findPrimes(number3);

		for(int i = 0; i < num1Array.size(); i++)
			for(int j = 0; j < num2Array.size(); j++)
				for(int k = 0; k < num3Array.size(); k++)
				if ((num1Array.get(i) == num2Array.get(j)) && (num1Array.get(i) == num3Array.get(k)) && (num2Array.get(j) == num3Array.get(k))){
					commonFactors.add(num1Array.get(i));
					i++;j++;k++;
				}

		int finalGCF = 1;
		for(int i = 0; i < commonFactors.size(); i++)
			finalGCF *= commonFactors.get(i);
		return finalGCF;
	}
	
	public static List<Integer> findFactors(int term) {
		List<Integer> listFactors = new ArrayList<Integer>();

		if (term>0) {
			for(int i=1; i<=Math.sqrt(term); i++) {
				if ((term % i) == 0) {
					listFactors.add(term/i);
					listFactors.add(i);
					listFactors.add(-term/i);
					listFactors.add(-i);
				}
			}
		}
		if (term<0) {
			int absTerm = Math.abs(term);
			for(int i=1; i<=Math.sqrt(absTerm); i++) {
				if ((absTerm % i) == 0) {
					listFactors.add(-absTerm/i);
					listFactors.add(i);
					listFactors.add(absTerm/i);
					listFactors.add(-i);
				}
			}
		}
		return listFactors;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programmer: David Romanski
		// Written: 04/17/2020
		// Program: Factoring First Method
		// Comments: This way is just called 'Starting Out' 
		// and seems like a brute force method to solve.

		int A = 0;
		// var factorsA = [];
		int B = 0;
		// var possibleB;
		int C = 0;
		// var factorsC = [];
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Please enter a nonzero integer for the first term: ");
			while (!input.hasNextInt()) {
				System.out.println("I'm sorry, that is not an integer.");
				input.next();
				System.out.print("Please enter a nonzero integer for the first term: ");
			} A = input.nextInt();
		} while (A == 0);

		do {
			System.out.print("Please enter a nonzero integer for the second term: ");
			while (!input.hasNextInt()) {
				System.out.println("I'm sorry, that is not an integer.");
				input.next();
				System.out.print("Please enter a nonzero integer for the second term: ");
			} B = input.nextInt();
		} while (B == 0);

		do {
			System.out.print("Please enter a nonzero integer for the third term: ");
			while (!input.hasNextInt()) {
				System.out.println("I'm sorry, that is not an integer.");
				input.next();
				System.out.print("Please enter a nonzero integer for the third term: ");
			} C = input.nextInt();
		} while (C == 0);

		System.out.println("Original equation: " + A + "x^2 + " + B + "x + " + C);

		int reduceGCF = GCF(A,B,C);
		if (reduceGCF > 1) {
			A = A/reduceGCF;
			B = B/reduceGCF;
			C = C/reduceGCF;
		}
							
		// Just Making sure that the values loaded.
		System.out.println(reduceGCF + "(" + A + "x^2 + " + B + "x + " + C + ")");

		// Showing factors of A
		System.out.print("A(" + A + ") can be ");
		List<Integer> factorsA = findFactors(A);
		System.out.println(factorsA);

		// Showing factors of C
		System.out.print("C(" + C + ") can be ");
		List<Integer> factorsC = findFactors(C);
		System.out.println(factorsC);

		System.out.println("That means that B(" + B + ") can be ");

		String answer = "";
		int possibleB;
		
		for(int i=0; i<factorsA.size(); i += 2) {
			for(int j=0; j<factorsC.size(); j += 2) {
				System.out.print("(" + factorsA.get(i) + " * " + factorsC.get(j) + ") + (" + factorsA.get(i+1) + " * " + factorsC.get(j+1) + ") = ");
				possibleB = factorsA.get(i) * factorsC.get(j) + factorsA.get(i+1) * factorsC.get(j+1); 
				System.out.println(possibleB);
				if (possibleB == B)
					if (!((factorsA.get(i) < 0) && (factorsA.get(i+1) < 0) && (factorsC.get(j) < 0) && (factorsC.get(j+1) < 0))) {
							if (reduceGCF != 1)
								answer += Integer.toString(reduceGCF);  
							answer += "(";
							if (!(Math.abs(factorsA.get(i)) == 1)) 
								answer += factorsA.get(i);
							if (factorsA.get(i) == -1)
								answer += "-";
							answer += "x + " + factorsC.get(j+1) + ")(";
							if (!(Math.abs(factorsA.get(i+1)) == 1))
								answer += factorsA.get(i+1);
							if (factorsA.get(i+1) == -1)
								answer += "-";
							answer += "x + " + factorsC.get(j) + ")\n";
							System.out.println(answer);
						}
					System.out.print("(" + factorsA.get(i+1) + " * " + factorsC.get(j) + ") + (" + factorsA.get(i) + " * " + factorsC.get(j+1) + ") = ");
					possibleB = factorsA.get(i+1) * factorsC.get(j) + factorsA.get(i) * factorsC.get(j+1);
					System.out.println(possibleB);
					if (possibleB == B)
						if (!((factorsA.get(i) < 0) && (factorsA.get(i+1) < 0) && (factorsC.get(j) < 0) && (factorsC.get(j+1) < 0))) {
							if (reduceGCF != 1)
								answer += reduceGCF;  
							answer += "(";
							if (!(Math.abs(factorsA.get(i)) == 1)) 
								answer += factorsA.get(i);
							if (factorsA.get(i) == -1)
								answer += "-";
							answer += "x + " + factorsC.get(j+1) + ")(";
							if (!(Math.abs(factorsA.get(i+1)) == 1))
								answer += factorsA.get(i+1);
							if (factorsA.get(i+1) == -1)
								answer += "-";
							answer += "x + " + factorsC.get(j) + ")\n";
							System.out.println(answer);	
						}

				}				
			} 
			System.out.println("My answer is: " + answer);
			input.close();
	}
}
