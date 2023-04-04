package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chromedriver.driver","chromedriver.exe");
 WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.dassault-aviation.com/en/");
Thread.sleep(5000);
driver.navigate().to("https://www.dassault-aviation.com/en/group/");
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
driver.manage().window().minimize();
driver.quit();
}
}
