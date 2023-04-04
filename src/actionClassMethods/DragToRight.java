package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragToRight {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    Actions actions = new Actions(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/draggable/");
	
	driver.switchTo().frame(0);
		//NoSuchElementException - Element Is present inside the frame - <iframe>  if we not switch the driver control
	
	WebElement draggalble = driver.findElement(By.id("draggable"));
	actions.clickAndHold(draggalble).moveByOffset(80, 0).release(draggalble).perform();
}
}
