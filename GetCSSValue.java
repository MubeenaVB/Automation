package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GetCSSValue {

	@Test
	public void css()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("(//h4)[1]"));
		//getCssValue ellam nama; styles ilanu nokendat
		//font weight 700 means bold
		//font weight 400 means normal
		//System.out.println("Font size is : "+ele.getCssValue("font-weight"));
		System.out.println("value 0f attribute display is : "+ele.getCssValue("display"));//dispaly type inte value kitum
	}
}
