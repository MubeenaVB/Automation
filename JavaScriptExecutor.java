package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	@SuppressWarnings("deprecation")
	@Test
	public void javaScriptExecutorHandle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("persistent"));
		JavascriptExecutor js = (JavascriptExecutor)driver;//driver cheytatoke javaScript executor aayi connect cheyanam
		//we are creating an alert
		js.executeScript("alert('hello this is an alert')");
		//Thread.sleep(3000);
		driver.switchTo().alert().accept();
		js.executeScript("arguments[0].click();", ele);
		
	}
}
