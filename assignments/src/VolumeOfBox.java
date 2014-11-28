//task 1.6
import java.util.Scanner;
public class VolumeOfBox {

	public static void main(String[] args) {
		// ask user to enter data - 𝐿𝑒𝑛𝑔𝑡h ∙ 𝑊𝑖𝑑𝑡h ∙ 𝐻𝑒𝑖𝑔h𝑡
		System.out.print("Please enter 𝐿𝑒𝑛𝑔𝑡h ∙ 𝑊𝑖𝑑𝑡h ∙ 𝐻𝑒𝑖𝑔h𝑡 of your box with spaces in between and press enter:");
		
		//catch input
		Scanner input = new Scanner(System.in);
		double length = input.nextDouble();
		double width = input.nextDouble();
		double height = input.nextDouble();
		
		//compute result
		double volume = length * width * height;
		
		// print to console given values and result
		System.out.println("You entered length as: "+ length);
		System.out.println("You entered width as: "+ width);
		System.out.println("You entered height as: "+ height);
		System.out.println("Your box has the volume: "+ volume);
		
		//close scanner
		input.close();
	}

}
