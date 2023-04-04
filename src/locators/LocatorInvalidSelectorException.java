package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInvalidSelectorException {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cowin.gov.in/");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(4000);
	
	//Identify the Vaccination Center Search Button
	//InvalidSelectorException -Selenium Library-Run time exception(Unchecked)
	//Here class attributr vale contains Spaces
	WebElement vaccinationCenterSearchButton=driver.findElement(By.className("searchBtn pin-search-btn district-search accessibility-plugin-ac"));
	vaccinationCenterSearchButton.click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
