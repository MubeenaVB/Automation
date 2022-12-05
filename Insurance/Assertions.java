 package Insurance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	void demo()
	{
		//hard assertion
		Assert.assertTrue(true);//passed
		Assert.assertEquals("welcome","welcome");//true-passed
		//Assert.assertEquals("selenium", "Selenium");//false-failed.so rest of the statements execute cheyila
		System.out.println("SCCESSFULL!!!!");
	}
}
