package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualMainText="Facebook helps you connect and share with the people in your life.";
		System.out.println("actualMainText = "+actualMainText);
		WebElement mainText = driver.findElement(By.className("_8eso"));
		String expectedMainText = mainText.getText();
		System.out.println("expectedMainText = "+expectedMainText);
		if(actualMainText.equals(expectedMainText))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.manage().window().minimize();
		driver.quit();
}
}