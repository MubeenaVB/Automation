package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ticket {
	@Test
	public void checkFlights() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-decider-header='flights']")).click();
		//driver.findElement(By.xpath("//a[@aria-controls='flights']")).click();)
		
		//1.Adult and child
		//Thread.sleep(3000);
		WebElement adult = driver.findElement(By.xpath("//div[@data-testid='input_occupancy_desktop_passengers_trigger']"));
		adult.click();
		//adult count increase
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_adults_increase']")).click();
		//child count increase
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_children_increase']")).click();
		//age of first child
		WebElement increaseAge = driver.findElement(By.xpath("//select[@class='InputSelect-module__field___wEAQl']"));
		Thread.sleep(3000);
		increaseAge.click();
		Thread.sleep(3000);
		Select sel = new Select(increaseAge);
		Thread.sleep(3000);
		sel.selectByIndex(2);
		Thread.sleep(5000);
		
		//2.date selection
		driver.findElement(By.xpath("(//div[@data-testid='searchbox_date_picker_desktop_calendar_0'])[1]")).click();
		Thread.sleep(5000);
		//start date
		driver.findElement(By.xpath("//span[@data-date-cell='2022-12-25']")).click();
		Thread.sleep(5000);
		//return date
		driver.findElement(By.xpath("//span[@data-date-cell='2023-01-01']")).click();
		//driver.findElement(By.xpath("//span[@data-date-cell='2022-12-25']")).click();
		
		//2.Where To
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("css-1tl2oa1")).sendKeys("MAA Chennai International Airport");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='css-1hhenib']")).click();
		
		//3.Click on search
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='css-ya5gr9 wide']")).click();
		
		//4.click on cheapest
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-controls='CHEAPEST']")).click();
		
		//5.Print lowest prize
		Thread.sleep(5000);
		WebElement lowestPrice=driver.findElement(By.xpath("(//div[@data-test-id='flight_card_price_main_price'])[1]"));
		Thread.sleep(3000);
		System.out.println("Lowest price for one person is : "+lowestPrice.getText());
	}

}


