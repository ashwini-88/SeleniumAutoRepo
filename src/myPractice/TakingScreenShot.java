package myPractice;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakingScreenShot {
	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
driver.get("https://www.facebook.com/");
TakesScreenshot ts = (TakesScreenshot)driver;
WebElement emailIdTextField = driver.findElement(By.id("email"));
  
File tempShot1 = emailIdTextField.getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(tempShot1, new File("./errorShot/EmailTF"+LocalDateTime.now().toString().replace(':', '-')+".png"));

  File tempShot2 = ts.getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(tempShot2, new File("./errorShot/FacebookPage"+LocalDateTime.now().toString().replace(':', '-')+".png"));
}
}