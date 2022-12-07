package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassInSelenium {

	@Test
	public void robotclass() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testfile.org/all-pdf-sample-test-file-download-direct/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//h4[contains(text(),'10MB']")).click();
		driver.findElement(By.xpath("(//h4[@class='bdt-list-title'])[0]")).click();
		
		//click ctrl+s+enter to save the pdf file
		Robot rb = new Robot();//Robot class java de part aanu
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);//ctrl key
		rb.keyPress(KeyEvent.VK_CONTROL);//S key
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);//Enter key
		
		//key release cheyanam
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
