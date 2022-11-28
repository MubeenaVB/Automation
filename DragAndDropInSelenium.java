package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropInSelenium {

	@Test
	public void dargAndDrop()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement dragAmount=driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement dropPlace=driver.findElement(By.id("amt7"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragAmount, dropPlace).perform();
	}
}
