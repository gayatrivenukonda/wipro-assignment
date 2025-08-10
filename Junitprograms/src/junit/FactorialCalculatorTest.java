package junit;
import static org.junit.Assert.*;
import org.junit.Test;
public class FactorialCalculatorTest {
	

	    @Test
	    public void testValidInputs() {
	        assertEquals(120, FactorialCalculator.factorial(5));
	        assertEquals(1, FactorialCalculator.factorial(0));
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testNegativeInputThrowsException() {
	        FactorialCalculator.factorial(-1);
	    }
	}
	

	   

