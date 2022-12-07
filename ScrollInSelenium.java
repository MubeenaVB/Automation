package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollInSelenium {

	@Test
	public void scrolling()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Scroll by pixel
		js.executeScript("window.scollTo(0,1000)");
		
		//Scroll to particular element
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'All Courses include')]"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		//Scroll to bottom of page
		js.executeScript("window.scollTo(0,document.body.scrollHeight)");
		
		//Scroll back to top of page
		js.executeScript("window.scollTo(0,document.body.scrollHeight,0)");
	}
}
