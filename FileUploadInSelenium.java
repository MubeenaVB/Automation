package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadInSelenium {

	@Test
	public void FileUploadInSelenium() throws AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload')]")).click();
		
		//using sendkeys()
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\admin\\Downloads\\Mubeena.docx");
		
		//using robot class
		WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;//driver cheytatoke javaScript executor aayi connect cheyanam
		js.executeScript("arguments[0].click();",button);
		
		Robot rb = new Robot();
		StringSelection ss = new StringSelection("C:\\Users\\admin\\Downloads\\Mubeena.docs");
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);	
	}
}
