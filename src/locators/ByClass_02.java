package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClass_02 {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(4000);
	WebElement bannerCloceButton= driver.findElement(By.className("close"));
	bannerCloceButton.click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();

}
}
