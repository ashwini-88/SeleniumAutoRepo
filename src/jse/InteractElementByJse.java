package jse;

import org.openqa.selenium.JavascriptExecutor;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractElementByJse {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
    JavascriptExecutor jse=  (JavascriptExecutor)driver;
    Thread.sleep(5000);
    jse.executeScript("document.getElementById('keepLoggedInCheckBox').click()");
    jse.executeScript("");
    Thread.sleep(2000);
    jse.executeScript("document.getElementById('loginButton').click()"); 	
    Thread.sleep(3000);
    driver.manage().window().minimize();
    driver.quit();
    
}
}