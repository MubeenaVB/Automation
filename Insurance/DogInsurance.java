package Insurance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DogInsurance {
	@Test(groups= {"Smoke"})
	public void MobileLogin()
	{
		System.out.println("Dog insurance - mobile login");
		Assert.assertEquals(false, true);
	}
	@Test
	public void MobileLogout()
	{
		System.out.println("Dog insurance - mobile logout");
	}
	@Test(groups= {"Smoke"})
	public void WebLogin()
	{
		System.out.println("Dog insurance - web login");
	}
	@Test
	public void WebLogout()
	{
		System.out.println("Dog insurance - web logout");
	}

}
