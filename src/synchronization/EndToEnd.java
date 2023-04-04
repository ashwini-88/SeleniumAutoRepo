package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEnd {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/");
	
	String expectedLoginPageTitle = "actiTIME - Login";
	System.out.println("expectedLoginPageTitle = "+expectedLoginPageTitle);
	String actualLoginPageTitle = driver.getTitle();
	System.out.println("actualLoginPageTitle = "+actualLoginPageTitle);
	String expectedLoginPageUrl = "https://demo.actitime.com/login.do";
	System.out.println("expectedLoginPageUrl = "+expectedLoginPageUrl);
	String actualLoginPageUrl = driver.getCurrentUrl();
	System.out.println("actualLoginPageUrl = "+actualLoginPageUrl);
	if(actualLoginPageTitle.equals(expectedLoginPageTitle)|| actualLoginPageUrl.equals(expectedLoginPageUrl))
	{
		System.out.println("Pass: The login page has been displayed on the verification of its URL and its Title");
	WebElement userNameTextfield = driver.findElement(By.id("username"));
	userNameTextfield.clear();
	userNameTextfield.sendKeys("admin");
	WebElement passwordTextfield = driver.findElement(By.name("pwd"));
	passwordTextfield.clear();
	passwordTextfield.sendKeys("manager");
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	loginButton.click();
	String expectedHomePageTitle = "actiTIME -  Enter Time-Track";
	System.out.println("expectedHomePageTitle = " + expectedHomePageTitle);
	String expectedHomePageUrl = "https://demo.actitime.com/user/submit_tt.do";
	System.out.println("expectedHomePageUrl = "+expectedHomePageUrl);
	if(wait.until(ExpectedConditions.urlToBe(expectedHomePageUrl)))
	{String actualHomePageUrl = driver.getCurrentUrl();
	System.out.println("actualHomePageUrl = " + actualHomePageUrl);
	System.out.println("HomePage URL is Correct");
	//if(wait.until(ExpectedConditions.titleContains(expectedHomePageTitle)))
	{
		
	}
	}
	
	WebElement logoutOption = driver.findElement(By.id("logoutLink"));
	logoutOption.click();
	
	driver.manage().window().minimize();
	driver.quit();
}
}}
