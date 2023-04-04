package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {

	public static void main(String[] args) throws Throwable {
		//set the driver Executable path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Instantiate the browser specific class 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		String pageSource=driver.getPageSource();
		if(pageSource.contains("Facebook helps you connect and share with the people in your life."))
		{
			System.out.println("Booolean True");
		}
		else
		{
			System.out.println("Booolean false");
		}
		driver.quit();
	}

}
