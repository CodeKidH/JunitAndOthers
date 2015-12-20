package BasicOfJunit.Chapter1_FirstStep;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest_Ver3 {
	
	@Test
	public void testAdd(){
		
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 50);
		assertEquals(60,result, 0); //expected, result, delta
	}

}
