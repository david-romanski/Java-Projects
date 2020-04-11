import java.util.Scanner;

public class ThreeFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int future = input.nextInt();
		int futureDate = 0;
		
		if (today == 0) {
			System.out.print("Today is Sunday and the future day is ");
		}
		if (today == 1)
			System.out.print("Today is Monday and the future day is ");
		if (today == 2)
			System.out.print("Today is Tuesday and the future day is ");
		if (today == 3)
			System.out.print("Today is Wednesday and the future day is ");
		if (today == 4)
			System.out.print("Today is Thursday and the future day is ");
		if (today == 5)
			System.out.print("Today is Friday and the future day is ");
		if (today == 6)
			System.out.print("Today is Saturday and the future day is ");
		futureDate = today + future;
		futureDate = futureDate % 7;
		if (futureDate == 0)
			System.out.println("Sunday");
		if (futureDate == 1)
			System.out.println("Monday");
		if (futureDate == 2)
			System.out.println("Tuesday");
		if (futureDate == 3)
			System.out.println("Wednesday");
		if (futureDate == 4)
			System.out.println("Thursday");
		if (futureDate == 5)
			System.out.println("Friday");
		if (futureDate == 6)
			System.out.println("Saturday");
			
		input.close();
	}
}