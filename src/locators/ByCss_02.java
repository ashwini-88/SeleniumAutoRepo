package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCss_02 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	
	//find the SignIn Button
	WebElement signInButton = driver.findElement(By.cssSelector("button[type='submit']"));
	signInButton.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
