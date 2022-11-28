package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassInSelenium {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();

		WebElement staticDropDown=driver.findElement(By.id("single-input-field"));
		
		Select sele = new Select(staticDropDown);
		sele.selectByIndex(2);//select option with index number
		//Thread.sleep(3000);
		sele.selectByValue("Red");
		//Thread.sleep(3000);
		//sele.selectByVisibleText("Green");
		//sele.deselectByIndex(2);//select cheytha option clear cheyan us e cheyum
		/*List<WebElement> option=driver.findElements(By.id("single-input-field"));
		int size=option.size();
		for(int i=0;i<size;i++)
		{
			if(option.get(i).getText().equals("Green"))
			{
				option.get(i).click();
				break;
			}
		}*/
	}

}
