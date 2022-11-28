package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassRightClick {

	@Test
	public void rightclick() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement rightClick = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
		WebElement doubleclick = driver.findElement(By.tagName("button"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		act.doubleClick(doubleclick).perform();
		driver.switchTo().alert().accept();
	}
}
