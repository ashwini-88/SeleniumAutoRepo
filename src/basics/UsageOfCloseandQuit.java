package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCloseandQuit {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	//JavascriptExecutor jse=(JavascriptExecutor)driver;
	//jse.executeScript("window.scrollBy(0,200)");
    driver.findElement(By.id("windowButton")).click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	Thread.sleep(5000);
	//driver.close();
	driver.quit();
}
}
