package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfSendKeys {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	//WebElement emailTextField = driver.findElement(By.id("email"));
	
	//Using Locator Stategy
	//emailTextField.sendKeys("a");
	//emailTextField.sendKeys(Keys.TAB);
	//emailTextField.sendKeys("123");
	
	//Using activeElement
	//driver.switchTo().activeElement().sendKeys("abcd");
	//driver.switchTo().activeElement().sendKeys(Keys.TAB);
	//driver.switchTo().activeElement().sendKeys("1234");

	//Using Actions Class
	//driver.switchTo().activeElement();
	Actions actions = new Actions(driver);
	//actions.sendKeys("ABCD").sendKeys(Keys.TAB).sendKeys("1234").perform();
			
	//actions.sendKeys(emailTextField,"ABCD").sendKeys(Keys.TAB).sendKeys("1234").perform();
	//actions.sendKeys(driver.switchTo().activeElement(), "1234").sendKeys(Keys.TAB).sendKeys("1234").perform();
    
	actions.sendKeys(driver.switchTo().activeElement(),"1234").sendKeys(Keys.TAB).sendKeys( "abcd").perform();
	
}
}
