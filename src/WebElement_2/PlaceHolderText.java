package WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	String expectedUserNamePlaceHolderText="Username";
    System.out.println("expectedUserNamePlaceHolderText = "+expectedUserNamePlaceHolderText);
	WebElement userNameTextField = driver.findElement(By.id("username"));
	String actualUserNamePlaceHolderText = userNameTextField.getAttribute("placeholder");
	System.out.println("actualUserNamePlaceHolderText = "+actualUserNamePlaceHolderText);
	if(actualUserNamePlaceHolderText.equals(expectedUserNamePlaceHolderText))
	{
		System.out.println("Pass: The Placeholder text of username text field is found correct and it is verified");
	}
	else 
	{	System.out.println("Fail: The Placeholder text of username text field is found incorrect and it is verified");
		
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
