package co.edu;

import org.junit.Test;

public class IntegerUtilsTest {
	int[]a = new int[] {9,2,7,4,56,1,8};


	@Test public void maxValue() { 
		int max = IntegerUtils.MaxValue(a);
		assert(max==56); 
		System.out.println("max test pass"); 
	}

	@Test public void minValue() { 
		int min = IntegerUtils.MinValue(a);
		assert(min==1); 
		System.out.println("min test pass"); 
	}


}
