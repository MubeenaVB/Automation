package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightTicketBooking {
	
	@Test
	public void ticktBooking() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4Aq-K15sGwAIB0gIkMGMwM2ViMTQtMTA2Zi00MmI0LWJjN2UtYzAzZjQ1NGIwMjk22AIF4AIB&sid=0210b7531f813a7134752091b4ee6c7f&keep_landing=1&sb_price_type=total&");
		driver.get("https://www.booking.com/flights/index.en.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Aq-K15sGwAIB0gIkMGMwM2ViMTQtMTA2Zi00MmI0LWJjN2UtYzAzZjQ1NGIwMjk22AIG4AIB&sid=6b154f40371e132fbe72c8cb8065fd06&from=booking&");
		driver.manage().window().maximize();
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='bui-tab__text'])[1]")).click();*/
		//WebElement economy = driver.findElement(By.xpath("//div[@class='css-1ntod47']"));
		//economy.click();
		List<WebElement> economy= driver.findElements(By.xpath("//div[@class='css-1ntod47']"));
		
		for(WebElement opt:economy)
		{
			if(opt.getText().equalsIgnoreCase("Economy"));
			{
				System.out.println("!!!!!!!!!"+opt.getText());
				opt.click();
			}
		}
	}
}
