package Insurance;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	void demo()
	{
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(true);//passed
		soft.assertEquals("welcome", "Welcome");//false - failed
		soft.assertEquals("selenium", "selenium");//true - pass
		System.out.println("SUCCESSFULL!!!");//fail aayalum ee sattement execute akum.hard assertion il atu patila
		//soft assert use cheyumpol rest of statements execute aakum.but ethelum test pottiyo enulat edutu tarunatinanu
		//assertAll enna method use cheyunat
		soft.assertAll();//used to caught all exceptions during selenium test automation execution
	}
}
