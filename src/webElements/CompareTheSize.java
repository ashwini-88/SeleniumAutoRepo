package webElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareTheSize {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	Thread.sleep(2000);
	WebElement emailTextField = driver.findElement(By.cssSelector("input[placeholder='Email or phone']"));
	Dimension emailSize = emailTextField.getSize();
	System.out.println("emailSize = " + emailSize);
	int emailHeight = emailSize.getHeight();
	System.out.println("emailHeight = " + emailHeight);
	int emailWidth = emailSize.getWidth();
	System.out.println("emailWidth = "+ emailWidth);
	Thread.sleep(2000);
	WebElement passwordTextField = driver.findElement(By.name("pass"));
	Dimension passwordSize = passwordTextField.getSize();
	int passwordHeight = passwordSize.getHeight();
	System.out.println("passwordHeight = "+ passwordHeight);
	int passwordWidth = passwordSize.getWidth();
	System.out.println("passwordWidth = " + passwordWidth);
	if (emailSize.equals(passwordSize)) {
		if (emailHeight==passwordHeight) {
			if (emailWidth==passwordWidth) {
				System.out.println("Pass: The Dimension of Email and Password textfielsd is found correct upon Verifivcation w.r.t height and width.");
			}else {
				System.out.println("Fail: The Dimension Of email and password textfield is found incorrect upon verification w.r.t height and width.");
			}
		}
	}
	driver.manage().window().minimize();
driver.quit();
}
}