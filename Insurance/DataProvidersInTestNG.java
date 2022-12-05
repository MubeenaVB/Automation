package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersInTestNG {

	@Test(dataProvider="getLoginDetails")
	public void UsingDataProvideForLogin(String Username, String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys(Username);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}
	
	@DataProvider
	public Object[][] getLoginDetails()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		data[2][0]="problem_user";
		data[2][1]="secret_sauce";
		return data;
		
	}
}
