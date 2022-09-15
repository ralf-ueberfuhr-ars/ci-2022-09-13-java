package de.schulung.samples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	void shouldAdd1And1To2() {
		// A rrange - Setup 
		Calculator calculator = new Calculator();
		
		// A ct - Test
		int result = calculator.add(1,1);
		
		// A ssert - Verify
		Assertions.assertEquals(2, result);
		
	}

	@Test
	void shouldAdd1And0To1() {
		// A rrange - Setup 
		Calculator calculator = new Calculator();
		
		// A ct - Test
		int result = calculator.add(1,0);
		
		// A ssert - Verify
		Assertions.assertEquals(1, result);
		
	}

	@Test
	void shouldAdd1AndMinus2ToMinus1() {
		// A rrange - Setup 
		Calculator calculator = new Calculator();
		
		// A ct - Test
		int result = calculator.add(1,-2);
		
		// A ssert - Verify
		Assertions.assertEquals(-1, result);
		
	}
	
	@Test
	void shouldDivide4By2To2() {
		// A rrange - Setup 
		Calculator calculator = new Calculator();
		
		// A ct - Test
		double result = calculator.divide(4,2);
		
		// A ssert - Verify
		Assertions.assertEquals(2, result);
		
	}

	@Test
	void shouldDivide5By2To2Dot5() {
		// A rrange - Setup 
		Calculator calculator = new Calculator();
		
		// A ct - Test
		double result = calculator.divide(5,2);
		
		// A ssert - Verify
		Assertions.assertEquals(2.5, result);
		
	}

	@Test
	void shouldNotDivideBy0() {
		// A rrange - Setup 
		Calculator calculator = new Calculator();
		
		// A ct - Test
		// A ssert - Verify
		Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
		
	}

	


}
