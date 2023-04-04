package jse;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheElementNotInViewPortArea {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/doodles");
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	for(;;) {
		try {
	WebElement israelDoodle = driver.findElement(By.linkText("Israel Independence Day 2022"));
	israelDoodle.click();
    break;
		}
		catch(NoSuchElementException e)
		{
			jse.executeScript("window.scrollBy(0,500)");
		}
	}
}
	}
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element


