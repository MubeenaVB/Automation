package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadInSelenium {

	@Test
	public void downloadInSelenium() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://wordpress.org/themes/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(@class,'button-primary')])[1]")).click();
		
	}
}
