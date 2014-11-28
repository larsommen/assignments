//task 1.9
import java.util.Scanner;

public class PromtYearsHowManyAmericans {

	public static void main(String[] args) {
		
		// assign number af americans currently
		long americans = 312032486;
		
		//promt user for number of years
		java.util.Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years into the future you want to know the number of americans for: ");
		int years = input.nextInt();
		
		//calculate number of seconds
		long  seconds = (long) years * 365*24*60*60;
		
		// calculate number of births (every 7th second)
		long births = seconds/7;
		System.out.printf("Number of births 1'st year %d\n", births);
		
		// calculate number of deaths (every 13th second)
		long deaths = seconds/13;
		System.out.printf("Number of deaths 1'st year %d\n",deaths);
		
		// calculate number of imigrants (every 45th second)
		long imigrants = seconds/45;
		System.out.printf("Number of emigrants 1'st year is %d\n", imigrants);
		
		//calculate number of americans in 5 years
		americans = americans + births - deaths + imigrants;
		
		// display result
		System.out.println("In "+  years + " years there will be "+americans +" americans");

		//cleanup
		input.close();
	}

}
