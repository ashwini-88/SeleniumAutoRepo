package WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisEnabled_2 {
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	WebElement usernameTextField= driver.findElement(By.id("username"));
	if(usernameTextField.isEnabled())
	{
		System.out.println("Boolean True");
	}
	else 
	{
		System.out.println("Boolean False");
	}
	WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	if(keepLoggedInCheckBox.isEnabled())
	{
		System.out.println("Boolean True");
	}
	else 
	{
		System.out.println("Boolean False");
	}
	
	driver.manage().window().minimize();
	driver.quit();
}
}
