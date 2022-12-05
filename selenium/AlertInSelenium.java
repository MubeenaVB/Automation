package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertInSelenium {

	@Test
	public void Alerts() throws InterruptedException
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));//iFrame inte akathu kerunu
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();//try it il click cheynu
		//Thread.sleep(3000);
		//iFrame inakathu ninu kond iFrame inte puratulla theme maatunna button click cheyna nokunu
		//inagne cheyumpol unable to locate element enna exception varum
		//karanam aa element iFrame inte puratanu.
		//iFrame il kereet puratullatine access cheyanel adhyam iFrame ninu purat varanam
		driver.switchTo().defaultContent();//iFrame inu munp namal evide aaruno aa sthalathek pokum
		driver.findElement(By.xpath("//a[@title='Change Theme'])[1]")).click();
		//veendum iFrame inte akathu pokunu alert varutunu accept chyunu
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));//iFrame inte akathu kerunu
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();//try it il click cheynu
		driver.switchTo().alert().accept();//accept or click ok on alert
		driver.findElement(By.id("runbtn")).click();
	}
}
