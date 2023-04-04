package myPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramePractice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	WebElement parentFrame = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
	driver.switchTo().frame(parentFrame);
    WebElement childFrame = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
    driver.switchTo().frame(childFrame);
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Selenium");
    driver.manage().window().minimize();
    driver.quit();
}
}
