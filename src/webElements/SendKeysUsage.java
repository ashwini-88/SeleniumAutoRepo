package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUsage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	//identify the username textfield
	WebElement userNameTextField = driver.findElement(By.id("username"));
	userNameTextField.clear();
	userNameTextField.sendKeys("admin");
	userNameTextField.sendKeys(Keys.CONTROL+"a");
	userNameTextField.sendKeys(Keys.BACK_SPACE);
	WebElement passwordTextField = driver.findElement(By.id("password"));
	passwordTextField.clear();
	passwordTextField.sendKeys("Test@123");
	passwordTextField.sendKeys(Keys.CONTROL+"a");
	passwordTextField.sendKeys(Keys.BACK_SPACE);
    //WebElement signInButton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
	WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
    signInButton.sendKeys(Keys.ENTER);
	
	}
}
