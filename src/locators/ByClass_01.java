package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClass_01 {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	//InvalidSelectorException
	//WebElement hdpCloseOption=driver.findElement(By.className("_2KpZ6l _2doB4z"));
	WebElement hdpCloseOption=driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
	hdpCloseOption.click();
	Thread.sleep(4000);
	WebElement loginButton=driver.findElement(By.className("_1_3w1N"));
	
	loginButton.click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
