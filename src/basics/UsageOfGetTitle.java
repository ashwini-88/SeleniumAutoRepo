package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/doodles");
		driver.manage().window().maximize();
		String expectedDoodleHomePageTitle="Google Doodles";
		System.out.println("Expected Doodle Home Page Title="+expectedDoodleHomePageTitle);
		String actualDoodleHomePageTitle=driver.getTitle();
		System.out.println("Actual Doodle Home Page Title="+actualDoodleHomePageTitle);
		if(expectedDoodleHomePageTitle.equals(actualDoodleHomePageTitle))
		{
			System.out.println("Pass:The title of the Google Doodle Home Page is Correct and Verified");
		}
		else
			System.out.println("Fail:The title of the Google Doodle Home Page is incorrect and Verified");
Thread.sleep(5000);
driver.quit();
}
}
