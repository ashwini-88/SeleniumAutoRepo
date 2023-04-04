package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoad {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2, 2));
	driver.get("https://www.ajio.com/");//Exception in thread "main" org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 1.844
    
	driver.quit();
  }
}
