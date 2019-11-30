package assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalculationTest {


	@Test
	public void testSum() {
		
		
		int sum=Calculation.add(10, 5);
		assertNotNull(sum);
		assertEquals(15, sum);
		
	}
	
	@Test
	public void testSubstract() {
		
		
		int subtract=Calculation.sub(10, 5);
		assertNotNull(subtract);
		assertEquals(5, subtract);
		
		
	}
}
