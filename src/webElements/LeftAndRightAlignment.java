package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAndRightAlignment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement usernameContainer = driver.findElement(By.id("email"));
	Rectangle userRect = usernameContainer.getRect();
	int usernameStartX = userRect.getX();
	int usernameEndX=usernameStartX + userRect.getWidth();
	
    WebElement passwordContainer = driver.findElement(By.id("passContainer"));
    int passwordStartX = passwordContainer.getRect().getX();
   int passwordEndX = passwordStartX + passwordContainer.getRect().getWidth();
   //Left Alignment
   if(usernameStartX==passwordStartX)
   {
	   System.out.println("usernameStartX ="+usernameStartX);
	   System.out.println("passwordStartX="+passwordStartX);
	   System.out.println("Pass: The left alignment is found correct and it is verified");
   }
   else {
	   System.out.println("usernameStartX ="+usernameStartX);
	   System.out.println("passwordStartX="+passwordStartX);
	   System.out.println("Fail: The left alignment is incorrect and it is verified");
	   }
   //Right Alignment
   if(usernameEndX==passwordEndX) {
	   System.out.println("usernameEndX ="+usernameEndX);
	   System.out.println("passwordEndX ="+passwordEndX);
	   System.out.println("Pass: The right alignment is found correct and it is verified");
}
   else {
	   System.out.println("usernameEndX ="+usernameEndX);
	   System.out.println("passwordEndX="+passwordEndX);
	   System.out.println("Fail: The right alignment is incorrect and it is verified");
	   }
   driver.manage().window().minimize();
   driver.quit();
}   
}