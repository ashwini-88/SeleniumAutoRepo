package screenShot;

import java.io.File;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenShot {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton=driver.findElement(By.name("login"));
    //File tempFile = loginButton.getScreenshotAs(OutputType.FILE);
    //FileUtils.copyFile(tempFile, new File("./errorshots/facebookloginbutton"+LocalDateTime.now().toString().replace(':', '-')+".png"));
	File tempFile = loginButton.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(tempFile, new File("./ErrorShots/FacecookLoginButton"+LocalDateTime.now().toString().replace(':', '-')+".png"));
    driver.manage().window().minimize();
    driver.quit();
}
}
