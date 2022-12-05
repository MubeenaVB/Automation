package Insurance;

import org.testng.annotations.Test;

public class VehicleInsurance {

	@Test(groups= {"Smoke"})
	public void MobileLogin()
	{
		System.out.println("Vehicle insurance - mobile login");
	}
	@Test
	public void MobileLogout()
	{
		System.out.println("Vehicle insurance - mobile logout");
	}
	@Test(groups= {"Smoke"})
	public void WebLogin()
	{
		System.out.println("Vehicle insurance - web login");
	}
	@Test
	public void WebLogout()
	{
		System.out.println("Vehicle insurance - web logout");
	}
}
