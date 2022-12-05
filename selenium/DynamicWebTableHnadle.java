package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableHnadle {

	//$x("//table[@id='customers']")---table xpath
	//$x("//table[@id='customers']//th")---columns
	//$x("//table[@id='customers']//tr")---rows
	//$x("//table[@id='customers']//td")---will consider values in each row.td:table data
	//$x("//table[@id='customers']//tr//td[2]")---gives all row values(that is,company names here)
	
	@Test
	public void dynamicWebTable()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/");
		driver.manage().window().maximize();
		
		//1.All the columns
		////table[@id='customers']/tbody/tr/th
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total count of headers : "+allHeaders.size());
		//The assertion message will print only when the count is mismatching
		Assert.assertEquals(allHeaders.size(), 5,"Column count is not matching");
		
		boolean status=false;
		for(WebElement ele:allHeaders)
		{
			String str=ele.getText();
			System.out.println(str);
			if(str.contains("Country"))//Country enulla search kitumpol if condition ninu puratu varum
			{
				status=true;
				break;//want to stop the checking once I get the correct comparison
			}
		}
		Assert.assertTrue(status,"Header is not present");//If we haven't found any value then it will be false and will fail
		System.out.println("==============================");
		
		//2.All the rows
		List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total count of rows : "+allRows.size());
		Assert.assertEquals(allRows.size(), 7,"Total row count in table is not matching");
		
		//3.All data
		List<WebElement> allData=driver.findElements(By.xpath("//table[@id='customers']//td"));//get all data
		boolean dataStatus=false;
		for(WebElement ele1:allData)
		{
			String str1=ele1.getText();
			System.out.println(str1);
			if(str1.contains("Ola"))
			{
				dataStatus=true;
				break;
			}
		}
		Assert.assertTrue(dataStatus,"Data is not present");
		System.out.println("==============================");
		
		//4.Pick only single element
		WebElement singleData = driver.findElement(By.xpath("//table[@id='customers']//tr//td[2]"));
		boolean status2=false;
		String str2=singleData.getText();
		if(str2.equals("FlipKart"))
		{
			status2=true;
		}
		Assert.assertEquals(str2, "FlipKart","Expected data is not matching with data received");
		
		//4.click on check box
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	}
}
