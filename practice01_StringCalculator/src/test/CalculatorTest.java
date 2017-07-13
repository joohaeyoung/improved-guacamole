package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


import calculator.StringCalculator;
public class CalculatorTest {
	
	StringCalculator cal;
	
	@Before
	public void setup() {
		
		cal= new StringCalculator();
	}
	
	@Test
	public void add_null_�Ǵ�_����() {
		assertEquals(0, cal.add(null));
		assertEquals(0, cal.add(""));
	}
	
	@Test
	public void add_�����ϳ�() throws Exception{
		assertEquals(1, cal.add("1"));
	}
	
	@Test
	public void add_��ǥ������() throws Exception{
		assertEquals(3, cal.add("1,2"));
	}
	
	
}
