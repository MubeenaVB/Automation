package Insurance;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LifeInsurance {

	@BeforeSuite
	public void BeforeSuit()
	{
		System.out.println("I am going to run first");
	}
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("I am going to run before Test cases");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("*********"+"I am going to run before each Test Methods");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I am running before first test method of current class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("I am running after all test method of current class run");
	}
	@BeforeGroups("Smoke")
	public void beforeGroup()
	{
		System.out.println("I am running before the first method belongs to group Smoke");
	}
	@Test(groups= {"Smoke"})
	public void MobileLogin()
	{
		System.out.println("Life insurance - mobile login");
	}
	@AfterGroups("Smoke")
	public void afterGroup()
	{
		System.out.println("I am running after the last method belongs to group Smoke");
	}
	@Test
	public void MobileLogout()
	{
		System.out.println("Life insurance - mobile logout");
	}
	@Test(groups= {"Smoke"})
	public void WebLogin()
	{
		System.out.println("Life insurance - web login");
	}
	@Test
	public void WebLogout()
	{
		System.out.println("Life insurance - web logout");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("--------"+"I am going to run after each Test Methods");
	}
	@AfterTest
	public void AfterTestMethod()
	{
		System.out.println("I am going to run after the Test cases got executed");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am going to run at the end");
	}
}
