package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class submit {

	@Test
	public void submitMethod()
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		WebElement box=driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]"));
		box.sendKeys("Alaska");
		box.submit();
	}
}
