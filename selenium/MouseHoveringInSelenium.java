package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MouseHoveringInSelenium {
	
	@Test
	public void ActionClaaMouseHover() throws InterruptedException
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		try
		{
			closebutton.click();
		}
		catch(Exception e)
		{
			closebutton.click();
		}
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Electronics']"));//Electronics webelement
		ele.click();
		//WebElement ele1 = driver.findElement(By.linkText(""))
		//Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.linkText("Soundbars"));
		//WebElement ele2 = driver.findElement(By.linkText("Soundbars"));)
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		//Thread.sleep(3000);
		act.moveToElement(ele2).click().perform();
		//oro vattam moveToElement kodukunenu pakaram singlr line il inganeyum exhutham
		//act.moveToElement(ele).moveToElement(ele2).click().perform();
	}
	
}
