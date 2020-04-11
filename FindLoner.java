// David Romanski
// Create: unknown
// Computer Lab Project
// Find Loner
// Comments: Given a list of pairs and one number with no pair, find the loner.

public class FindLoner {
	public static void main(String[] args) {
		int[] numbers = {4, 2, 4, 5, 5, 6, 1, 6, 7, 3, 7, 8, 3, 8, 2, 1, 9};
		int answer = 0;
		for(int i = 0; i <= numbers.length-1; i++)
			answer = answer ^ numbers[i];
		System.out.println(answer);
	}
}