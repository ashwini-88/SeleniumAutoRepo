package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com/login/identify");
    Thread.sleep(3000);
    WebElement emailTextField = driver.findElement(By.cssSelector("input[placeholder='Email or phone']"));

	int emailStartY = emailTextField.getRect().getY();
	System.out.println("emailStartY = " + emailStartY);
	WebElement passwordTextField = driver.findElement(By.name("pass"));
	int passwordStartY = passwordTextField.getRect().getY();
	System.out.println("passwordStartY = " + passwordStartY);
	if (emailStartY==passwordStartY) {
		System.out.println("Pass: The top alignment of email and password text field Is found correct upon verification.");
	}else {
		System.out.println("Fail: The Top Alignment Of Email and password text field is found incorrect upon verification.");
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}
    

