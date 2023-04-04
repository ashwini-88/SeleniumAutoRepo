package WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldShouldBeEmpty {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demo.vtiger.com/vtigercrm/");
	    WebElement userNameTextField = driver.findElement(By.id("username"));
	    String actualTextUsername = userNameTextField.getAttribute("value");
	    System.out.println("actualTextUsername = "+actualTextUsername);
	    if(actualTextUsername.isEmpty())
	    {
	    	System.out.println("Boolean True");
	    	System.out.println("-ve testing");
            System.out.println("Pass: The text field is empty and it is verified");
	    }
	    else
	    {
	    	System.out.println("Boolean False");
    	System.out.println("-ve testing");
        System.out.println("Fail: The text field is not empty and it is verified");
	    }
	    driver.manage().window().minimize();
	    driver.quit();
	}
}
