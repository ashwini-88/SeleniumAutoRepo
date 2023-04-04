package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws Throwable  {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
        Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='desktop-navContent']"));
		//Thread.sleep(4000);
		 driver.findElement(By.cssSelector("a[href='/men-tshirts']")).click();
		//tShirtLink.click();
		//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox' and @value='Roadster']")).click();
		
		//roadsterCheckBox.click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
