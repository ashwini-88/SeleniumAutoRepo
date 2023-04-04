package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmitButton {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	emailTextField.clear();
	emailTextField.sendKeys("Ashwini");
	Thread.sleep(3000);
	WebElement passwordTextField = driver.findElement(By.id("pass"));
	passwordTextField.clear();
	passwordTextField.sendKeys("12345");
	Thread.sleep(2000);
	WebElement loginButton = driver.findElement(By.name("login"));
	loginButton.submit();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
