package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).click();
		
		//we are storing all the options of dynamic drop down in a list
		List<WebElement> DropValue= driver.findElements(By.xpath("//li[@role='option']"));
		
		//iterate through each elements in List
		for(WebElement opt:DropValue)
		{
			System.out.println("WebElement is : "+opt+"!!!! This is value"+opt.getText());
			if(opt.getText().equalsIgnoreCase("lowa"));
			{
				opt.click();
			}
		}
	}
	

}
