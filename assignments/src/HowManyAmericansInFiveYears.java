
// task 1.8
public class HowManyAmericansInFiveYears {

	public static void main(String[] args) {
		// assign number af americans currently
		long americans = 312032486;
		
		//calculate number of seconds
		int years = 5;
		long  seconds = (long) years * 365*24*60*60;
		
		// calculate number of births (every 7th second)
		long births = seconds/7;
		
		
		// calculate number of deaths (every 13th second)
		long deaths = seconds/13;
		
		// calculate number of imigrants (every 45th second)
		long imigrants = seconds/45;
		
		
		//calculate number of americans in 5 years
		americans = americans + births - deaths + imigrants;
		
		// display result
		System.out.println("In 5 years there will be "+americans +" americans");
	}

}
