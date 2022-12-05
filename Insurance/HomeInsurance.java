package Insurance;

import org.testng.annotations.Test;

public class HomeInsurance {
	
	@Test(priority=4,groups= {"Smoke"})
	public void MobileLogin()
	{
		System.out.println("Home insurance - mobile login");
	}
	@Test(priority=1)
	public void MobileLogout()
	{
		System.out.println("Home insurance - mobile logout");
	}
	@Test(priority=2,groups= {"Smoke"},enabled=true)
	public void WebLogin()
	{
		System.out.println("Home insurance - web login");
	}
	@Test(priority=3,dependsOnMethods= {"WebLogin"})
	public void WebLogout()
	{
		System.out.println("Home insurance - web logout");
	}
}
