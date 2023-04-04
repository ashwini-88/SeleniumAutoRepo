package myPractice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleScreenShot {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	File tempFile = loginButton.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(tempFile, new File("./errorshots/facebookloginbutton"+LocalDateTime.now().toString().replace(':', '-')+".png"));
driver.manage().window().minimize();
driver.quit();
}
}

