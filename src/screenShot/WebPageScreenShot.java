package screenShot;


import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenShot {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
    /*TakesScreenshot ts = (TakesScreenshot)driver;
    File tempFile = ts.getScreenshotAs(OutputType.FILE);
    String timeStamp = LocalDateTime.now().toString().replace(':', '-');
    File destFile = new File(("./errorshots/facebookloginpage"+timeStamp+".png");
    String tempFileAddress = tempFile.getAbsolutePath();
    System.out.println(tempFileAddress);
    FileUtils.copyFile(tempFile, destFile); */
   
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempFile = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(tempFile, new File("./ErrorShots/FacebookLoginPage"+LocalDateTime.now().toString().replace(':', '-')+".png"));
	
	
	
	
	Thread.sleep(20000);
    driver.manage().window().minimize();
    driver.quit();
}
}



