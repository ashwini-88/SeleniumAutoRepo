package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapabalityOfClickMethod {
public static void main(String[] args) throws Throwable{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement watchLink = driver.findElement(By.linkText("Watch"));
			//driver.findElement(By.xpath("//a[text()='Watch']"));
			watchLink.click();
			Thread.sleep(3000);
			driver.manage().window().minimize();
			driver.quit();
			}

}