import java.util.ArrayList;
import java.util.List;

public class GFC {
	
	public static List<Integer> findPrimes(int num) {
		int remainder = num;
		int tempRem;
		List<Integer> factorsArray = new ArrayList<Integer>();

		System.out.println("Number is " + num);

		while (true) {
			tempRem = remainder;
			for(int i = 2; i < remainder; i++)
				if (remainder%i == 0) {
					System.out.print(i);
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 100;
		List<Integer> num1Array = new ArrayList<Integer>();
		int number2 = 25;
		List<Integer> num2Array = new ArrayList<Integer>();
		List<Integer> commonFactors = new ArrayList<Integer>();

		num1Array = findPrimes(number1);
		num2Array = findPrimes(number2);

		for(int i = 0; i < num1Array.size() ; i++)
			for(int j = 0; j < num2Array.size(); j++)
				if (num1Array.get(i) == num2Array.get(j)) {
					commonFactors.add(num1Array.get(i));
					break;
				}

		System.out.print("For number ");
		System.out.print(number1);
		System.out.print(" prime numbers are: ");
		System.out.println(num1Array);
		System.out.print("For number ");
		System.out.print(number2);
		System.out.print(" prime numbers are: ");
		System.out.println(num2Array);
		
		System.out.print("Common factors are: ");
		System.out.println(commonFactors);

		int total = 1;
		for(int i = 0; i < commonFactors.size(); i++)
			total *= commonFactors.get(i);

		System.out.print("Or: ");
		System.out.println(total);
	}

}
