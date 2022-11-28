package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		WebElement multipleOPtions=driver.findElement(By.id("multi-select-field"));
		Select sele=new Select(multipleOPtions);
		
		sele.selectByIndex(0);
		sele.selectByValue("Yellow");
		sele.selectByVisibleText("Green");
		
		driver.findElement(By.id("button-first")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("button-all")).click();
		
		

	}

}
