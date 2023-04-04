package basics;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
	public static void main(String[] args) {
		//Set the driver executable path 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class 
		WebDriver driver = new ChromeDriver();
		Dimension setBrowserSize = new Dimension(600, 700);
		driver.manage().window().setSize(setBrowserSize);
		//Precondition - to Maximize the browser window
		//by that we can get the best view of the webpage
		driver.manage().window().maximize();
		
		
		//pass the main URL of the application
		driver.get("https://belurmath.org/");
		//OS controlling options
		//browser controlling options will not be visible
		//we will get best view content or the webpage with it's fullest capacity of my screen.
		driver.manage().window().fullscreen();
		//Post condition - Selenium no disturbance when it dealing with windows
		//driver.manage().window().minimize();
		//driver.close();
		driver.quit();
	}
}
