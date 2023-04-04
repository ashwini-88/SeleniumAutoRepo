package basics;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsageOfGetWindowHandle {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Instantiate the browser specific class 
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Scroll the webpage
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		//find the new WIndow button in the webpage
		WebElement newWindowButton = driver.findElement(By.id("windowButton"));
		newWindowButton.click();
		Thread.sleep(5000);
		//capture the window ID
		//It will capture the window id which is under the driver control
		String parentwindowId = driver.getWindowHandle();
		System.out.println("parentwindowId = " + parentwindowId);
		Thread.sleep(5000);
		Set<String> allwindowIds = driver.getWindowHandles();
		//System.out.println(allwindowIds);
		for (String wid : allwindowIds) {
			//System.out.println(wid);
			if (driver.switchTo().window(wid).getCurrentUrl().equals("https://demoqa.com/browser-windows")) {
				driver.switchTo().window(wid).close();
			}else if (driver.switchTo().window(wid).getCurrentUrl().equals("https://demoqa.com/sample")) {
				driver.switchTo().window(wid).manage().window().maximize();
			}
			
			
		}
		//driver.quit();
		
		
		
	}

}
