
import java.util.Scanner;
public class HowManyMinutes {

	public static void main(String[] args) {
		// Ask for minutes
		System.out.print("Please enter a number of minutes: ");
		
		//let user enter minutes
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		
		//calculate minutes into days and years
		int totalNumberOfDays = minutes/(60*24);
		int days = totalNumberOfDays % 365;
		
		int years = totalNumberOfDays/365;
		
		//display result
		System.out.println("You entered "+ minutes + " minutes");
		System.out.println("This is "+ years + " years and "+ days +" days");
		

	}

}
