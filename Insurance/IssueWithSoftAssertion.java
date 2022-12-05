package Insurance;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//soft assert il namal same object use cheyumpol randamate test case true aanelum fail aakum.
//karanam,adhyate test case fail aakumpo automatically randamate case um fail akum
//but ivide randamate test case work aakunund
public class IssueWithSoftAssertion {

	SoftAssert soft = new SoftAssert();
	@Test
	void demo1()
	{
		soft.assertEquals("wel", "welcome");
		soft.assertAll();
	}
	void demo2()
	{
		soft.assertEquals("welcome", "welcome");
		soft.assertAll();
	}
	
}
