package screenShot;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoldenChariot_Hw1 {
public static void main(String[] args) throws Throwable {
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.goldenchariot.org/");
     TakesScreenshot ts = (TakesScreenshot)driver;
     File tempFile = ts.getScreenshotAs(OutputType.FILE);
     String timeStamp=LocalDateTime.now().toString().replace(':', '-');
    File destFile = new File("./errorShots/GoldenChariot"+timeStamp+".png");
    String TempFileAddress=tempFile.getAbsolutePath();
    System.out.println(TempFileAddress);
    FileUtils.copyFile(tempFile, destFile);
    driver.manage().window().minimize();
    driver.quit();
    
    }
}
