package practice01_StringCalculator;

public class StringCalculator {
	
	int calculator(String s) {
		
		
		String[] array = s.split(",|:");
		int sum = 0;
		
		for( String splitedString : array ) {
			
			sum+= Integer.parseInt(splitedString);
		
		}
		return sum;
	}
}
