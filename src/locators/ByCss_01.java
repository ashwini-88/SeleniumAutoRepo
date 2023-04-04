package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCss_01 {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("https://www.naukri.com/");
	//find the login Button
  //WebElement byIdLogin = driver.findElement(By.id("login_Layer"));
  //byIdLogin.click();
  //WebElement byClassLogin = driver.findElement(By.className("nI-gNb-lg-rg__login"));
  //byClassLogin.click();
  //WebElement byLinkLogin = driver.findElement(By.linkText("Login"));
  //byLinkLogin.click();
 // driver.findElement(By.cssSelector("a[title='Jobseeker Login']")).click();
  //driver.findElement(By.cssSelector("a[href='https://login.naukri.com/nLogin/Login.php']")).click();
  //driver.findElement(By.cssSelector("a[id='login_Layer']")).click();
  //driver.findElement(By.cssSelector("a[data-ga-track='Main Navigation Login|Login Icon']")).click();
	driver.findElement(By.cssSelector("a[class='nI-gNb-lg-rg__login']")).click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
