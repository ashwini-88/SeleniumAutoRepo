package WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagName {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	String actualTagName = loginButton.getTagName();
	System.out.println(actualTagName);
	if(actualTagName.equals("button"))
	{
		System.out.println("Since the tagName is <'+actualTagName'> we will perform the action");
		loginButton.click();
	}
	else 
	{
		System.out.println("Since the login button doesnot belongs to <button> and  we will not perform the action");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
