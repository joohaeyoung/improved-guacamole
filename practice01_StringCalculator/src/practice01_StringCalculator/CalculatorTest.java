package practice01_StringCalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class CalculatorTest {
	StringCalculator cal;
	
	@Before
	public void setup() {
		cal= new StringCalculator();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void StringCalculator() {
		
		assertEquals(6.0 , cal.calculator("1:2,3") );
		
	}
}
