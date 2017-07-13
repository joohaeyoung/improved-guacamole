package test;

import org.junit.Test;
import static org.junit.Assert.*;

public class SplitTest {
	
	@Test
	public void split() {
		assertArrayEquals( new String[] {"1"}, "1".split(","));
		assertArrayEquals( new String[] {"1","2"}, "1,2".split(","));
	}

}
