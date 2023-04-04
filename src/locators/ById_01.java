package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById_01 {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.actitime.com/");
	//find the username text field and enter the data
	WebElement userNameTextfield=driver.findElement(By.id("username"));
	//userNameTextfield.sendKeys("admin");
	userNameTextfield.sendKeys("trainee");
	Thread.sleep(5000);
	WebElement passwordTextField=driver.findElement(By.name("pwd"));
	passwordTextField.sendKeys("trainee");
	Thread.sleep(5000);
	WebElement keepLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
	keepLoggedInCheckBox.click();
	Thread.sleep(5000);
	WebElement loginButton=driver.findElement(By.id("loginButton"));
	loginButton.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
