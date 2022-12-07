package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollVerticalAndHorizontal {

	@Test
	public void scrollVertiAndHorix()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/index.php");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Scroll to right
		js.executeScript("window.scollBy(8000,0)");
		
		//Scroll to left
		js.executeScript("window.scollBy(-2000,0)");
	}
}
