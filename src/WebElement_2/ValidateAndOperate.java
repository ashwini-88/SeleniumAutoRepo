package WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateAndOperate {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	
	//Optimize the search criteria
	WebElement parentElement=driver.findElement(By.id("loginFormDiv"));
	String actualFormtag = parentElement.findElement(By.tagName("form")).getTagName();	
	System.out.println(actualFormtag);
	 //Validate the Pre-Condition before we Perform Action on the element;
	WebElement sigInButton= parentElement.findElement(By.xpath("//button"));
	if(actualFormtag.equals("form"))
			{
		System.out.println(actualFormtag);
		System.out.println("SignIn Button is in <form>");
	}
	if(sigInButton.getTagName().equals("button"))
	{
		System.out.println(sigInButton.getTagName());
		System.out.println("SignIn button is creatd by <button>");
	}
	if(sigInButton.getAttribute("type").equals("submit"))
	{
		System.out.println(sigInButton.getAttribute("type"));
	    System.out.println("SignIn Button has type='submit'attribute");
	    sigInButton.submit();
	    
	}
	
}
}
