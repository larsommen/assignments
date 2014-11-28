// task 1.4
public class OutputKilometers {

	public static void main(String[] args) {
		// declare miles and assign value
		double miles = 100;
		
		//declare constant KILOMETERS_PER_MILE
		final double KILOMETERS_PER_MILE = 1.609;
		
		//declare and compute kilometers
		double kilometers = miles * KILOMETERS_PER_MILE;
		
		//display kilometers
		System.out.println(kilometers);

	}

}
