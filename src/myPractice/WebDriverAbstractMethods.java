package myPractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverAbstractMethods {
public static void main(String[] args) throws Throwable {
	//set the driver Excecutable path
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//instatiate the Browser specific class
    WebDriver driver=new ChromeDriver();
    //Pre-condition
    driver.manage().window().maximize();
    //pass the main URL of the application 
    driver.get("https://www.facebook.com/");
    //getTitle Method
    String facebookTitle = driver.getTitle();
    System.out.println("Title : "+facebookTitle);
    //getCurrentUrl method
    String facebookCurrentUrl = driver.getCurrentUrl();
    System.out.println("CurrentUrl : "+facebookCurrentUrl);
    //getPageSource method
    String facebookPageSource = driver.getPageSource();
    if(facebookPageSource.contains("Email address or phone number"))
    {
    	System.out.println("Pass:PageSource");
    }
    else {System.out.println("Fail:PageSource");}
    
    //System.out.println("PageSource : "+facebookPageSource);
    //pass the subUrl
    driver.get("https://www.facebook.com/login/");
    //get the window id's 
    Set<String> windowIds = driver.getWindowHandles();
    for(String wid : windowIds)
    {
    	if(driver.switchTo().window(wid).getCurrentUrl().equals("https://www.facebook.com/"))
    	{
    		
    	System.out.println("main Url");	
    	
    	}
    	else if(driver.switchTo().window(wid).getCurrentUrl().equals("https://www.facebook.com/login/"))
    	{
    		System.out.println("SubUrl");
    	}
    	
    }
    driver.manage().window().minimize();
    Thread.sleep(3000);
    driver.quit();
    //driver.close();
}
}
