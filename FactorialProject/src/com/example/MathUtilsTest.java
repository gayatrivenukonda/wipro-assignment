package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
	

	   @Test
	    public void testFactorialValidInputs() {
	        assertEquals(1, MathUtils.factorial(0));
	        assertEquals(1, MathUtils.factorial(1));
	        assertEquals(120, MathUtils.factorial(5));
	        assertEquals(3628800, MathUtils.factorial(10));
	    }

	   @Test
	    public void testFactorialNegativeInput() {
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            MathUtils.factorial(-1);
	        });
	        assertEquals("Factorial is undefined for negative numbers", exception.getMessage());
	    }
	}

	
	

	

	   	 

	 
