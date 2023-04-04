package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName_01 {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nbtindia.gov.in/");
	Thread.sleep(4000);
	//identify the search text field
	WebElement searchTextField = driver.findElement(By.name("search"));
    searchTextField.sendKeys("India");
	searchTextField.click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
