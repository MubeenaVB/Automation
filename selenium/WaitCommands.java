package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitCommands {

	//Thread.sleep(3000)----> Red(120mins)
	//Implicit wait---->element undo ennu idak idak check cheyum epol element kituno apo atine edukum
	//implicit wait(120) koduthal oro sec nokum ee 120 sec epo element kituno apo namal element edutond pokum
	//explicit wait---->especially for this (condition for a particular element)

	@Test
	public void waitCommands()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
	}
}
