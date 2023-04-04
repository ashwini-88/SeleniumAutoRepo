package basics;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshDoodlesPage {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	URL mainURL=new URL("https://www.google.com/");
	URL doodlesPage=new URL(mainURL,"doodles");
	driver.navigate().to(doodlesPage);
	Thread.sleep(5000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollTo(0,3000)");
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
