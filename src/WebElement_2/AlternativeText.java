package WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternativeText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement flipkartLogo = driver.findElement(By.className("_2xm1JU"));
		String alternativeText = flipkartLogo.getAttribute("alt");
		System.out.println("alternativeText = "+alternativeText);
		if(alternativeText.equals("Flipkart"))
		{
			System.out.println("Pass: The Alternative text is found correct and it is verified");
		}
		else
		{
			System.out.println("Fail: The Alternative text is found incorrect and it is verified");
         }
		driver.manage().window().minimize();
		driver.quit();
}
}