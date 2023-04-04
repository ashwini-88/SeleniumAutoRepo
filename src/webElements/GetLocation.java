package webElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetLocation {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	List<WebElement> allMenuOptions = driver.findElements(By.className("desktop-navContent"));
	for (WebElement menuOption : allMenuOptions) {
		Point menuEleLocation = menuOption.getLocation();
		//System.out.println(menuEleLocation);
		System.out.println(menuEleLocation.getX());
		System.out.println(menuEleLocation.getY());
	}
	driver.manage().window().minimize();
	driver.quit();
	

}
}
