package WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	String expectedToolTipText = "Do not select if this computer is shared";
	System.out.println("expectedToolTipText = " +expectedToolTipText);
	WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	String actualToolTipText = keepLoggedInCheckBox.getAttribute("title");
	System.out.println("actualToolTipText = "+actualToolTipText);
	if(actualToolTipText.equals(expectedToolTipText))
	{
		System.out.println("Pass : The tool tip text for the keepLoggedInCheckBox is correct and verified" );
	}
	else
	{ 
		System.out.println("Fail : The tool tip text for the keepLoggedInCheckBox is incorrect and verified" );
	}
      	
	driver.manage().window().minimize();
	driver.quit();
}
}
