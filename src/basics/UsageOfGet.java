package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/doodles");
	driver.get("https://www.ajio.com/");
	driver.get("https://www.myntra.com/");
	//driver.close();
	driver.quit();
}
}
