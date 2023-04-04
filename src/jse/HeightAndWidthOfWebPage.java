package jse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class HeightAndWidthOfWebPage {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//new FluentWait<WebDriver>(driver)
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(5000);
	jse.executeScript("window.scrollTo(0,500)");
	Thread.sleep(5000);
	Object totalScrollHeightAtIsrael = jse.executeScript("return document.body.scrollHeight");
    System.out.println("totalScrollHeightAtIsrael = "+totalScrollHeightAtIsrael );
    System.out.println(jse.executeScript("return document.body.scrollWidth"));
    
}

}
