package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocationAndGetSize {

	@Test
	public void getting()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("login-button"));
		
		System.out.println("Location of web element : "+ele.getLocation());
		System.out.println("Size of web element : "+ele.getSize());
		System.out.println("Tag name of web element : "+ele.getTagName());
		System.out.println("Attribute of web element : "+ele.getAttribute(""));
	}
}
