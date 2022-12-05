package Insurance;

import org.testng.annotations.Test;

public class SingleTestMultipleRun {

	@Test(invocationCount=5)
	public void message()
	{
		System.out.println("Welcome to TestNG");
	}
}
