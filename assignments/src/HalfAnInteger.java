// taks1.5
import java.util.Scanner;
public class HalfAnInteger {

	public static void main(String[] args) {
		// input an integer
		System.out.print("Enter an integer please: ");
		Scanner input = new Scanner(System.in);
		int myInt = input.nextInt();
		
		// compute half and display
		double result = myInt/2.0;
		
		//display myInt and result
		System.out.println("You entered this: "+myInt);
		System.out.println("Half of that is: "+result);

	}

}
