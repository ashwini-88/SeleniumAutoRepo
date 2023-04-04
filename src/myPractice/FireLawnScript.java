package myPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireLawnScript {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://firelawn.com/");
	WebElement loginButton = driver.findElement(By.id("fl_login_btn"));
	loginButton.click();
	WebElement userTextfield = driver.findElement(By.id("fl_email"));
	
	userTextfield.sendKeys("ashwini.horizons@gmail.com");
	WebElement passwordTextfield = driver.findElement(By.id("fl_password"));
	passwordTextfield.sendKeys("Ashwini#1");
    WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
    //submitButton.submit();
    submitButton.click();
    //Thread.sleep(3000);
    // BELOW LINE IS FOR WITHOUT CREATING AN ACCOUNT 
	//WebElement loginButton = driver.findElement(By.cssSelector("button[class='navbar_Loginbutton__xIXoV']"));
	WebElement menLink = driver.findElement(By.xpath("(//a[@href='/men'])[1]"));
	Thread.sleep(3000);
	menLink.click();
	Thread.sleep(3000);
    WebElement menTshirtsLink = driver.findElement(By.cssSelector("a[href='/sub-category/men-tshirt']"));
    menTshirtsLink.click();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
}
}
