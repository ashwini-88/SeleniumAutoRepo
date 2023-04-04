package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailLogin {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/");
	driver.findElement(By.id("identifierId")).sendKeys("ashwini");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	
}
}
