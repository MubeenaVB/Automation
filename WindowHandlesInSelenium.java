package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesInSelenium {

	@Test
	public void testGetWindow() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();

		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.findElement(By.xpath("//b[contains(text(),'Open New Page')]")).click();

		// Get main window handle.
		String tabonehandle = driver.getWindowHandle();
		System.out.println(tabonehandle + " is tab one window handle.");

		// Get all windows handles using getWindowHandles() in selenium
		Set<String> allhandles = driver.getWindowHandles();

		// Iterate through allhandles.
		Iterator<String> it = allhandles.iterator();

		String tabtwohandle = null;

		while (it.hasNext()) {
			// Store iterator window handle value in temp
			String temp = it.next();

			// compare temp value with tabonehandle
			if (!tabonehandle.equalsIgnoreCase(temp)) {
				// If not match with tabonehandle then it is tab two handle and store it in
				// tabtwohandle.
				tabtwohandle = temp;
				System.out.println(tabtwohandle + " is tab two window handle.");
			}

		}

		// Switch to tab two of browser using tabtwohandle
		driver.switchTo().window(tabtwohandle);
		// type text in text box of tab two
		driver.findElement(By.id("fname")).sendKeys("some text");

		// Switch to tab one of browser using tabonehandle
		driver.switchTo().window(tabonehandle);
		// select radio button on tab one.
                driver.findElement(By.id("radio2")).click();

		Thread.sleep(5000);
		// Opens a new tab and switches to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);

		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);

		// Access each dimension individually
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		System.out.println("Width" + width);
		System.out.println("height" + height);

		// Or store the dimensions and query them later
		Dimension size = driver.manage().window().getSize();
		int width1 = size.getWidth();
		int height1 = size.getHeight();

		System.out.println("Width" + width1);
		System.out.println("height" + height1);
	}
}