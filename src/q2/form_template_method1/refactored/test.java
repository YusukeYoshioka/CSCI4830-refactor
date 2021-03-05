package q2.form_template_method1.refactored;

import org.junit.Assert;
import org.junit.Test;

public class test
{
	@Test
	public void test()
	{
		A test = new A();
		int testResult = test.m1(0, 8);
		System.out.println(testResult);
			
		
		
	    int sum = 0;
	    for (int i = 0; i <= 8; i++) {
	         sum += i;
	    }
	    Assert.assertEquals(sum, testResult);
	    
	    testResult = test.m2(1, 5);
	    System.out.println(testResult);
		sum = 0;
	    for (int i = 1; i <= 5; i++) {
	    	sum += i * i;
		}
	    Assert.assertEquals(sum, testResult);
	}

}
