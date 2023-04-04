package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickNotSubmitMethodOnActiTIME {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys("manager");
		Thread.sleep(2000);
		WebElement checkBoxForKeepMeLogin= driver.findElement(By.id("keepLoggedInCheckBox"));
		checkBoxForKeepMeLogin.click();
		Thread.sleep(2000);
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		//We should use click rather than submit because it is not enclose in form tag and attribute type="submit" is not there
		loginOption.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	
	}
	}
