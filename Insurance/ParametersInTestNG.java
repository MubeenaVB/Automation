package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersInTestNG {

	@Parameters({"URL","Username","Password"})
	@Test
	public void UsingDataProvideForLogin(String url,String Username, String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys(Username);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}
}
