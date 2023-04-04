package basics;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAndSetSizeAndPosition {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Scroll the webpage
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		WebElement newWindowButton=driver.findElement(By.id("windowButton"));
		newWindowButton.click();
		Thread.sleep(5000);
		Set<String> allwindowsID=driver.getWindowHandles();
		for(String wid:allwindowsID) {
			String url=driver.switchTo().window(wid).getCurrentUrl();
			if(url.equals("https://demoqa.com/browser-windows"))
			{
				driver.manage().window().maximize();
			}
			else if(url.equals("https://demoqa.com/sample"))
			{
				Dimension windowSize=driver.switchTo().window(wid).manage().window().getSize();
				int windowHeight=windowSize.getHeight();
			    System.out.println("ChildWindowHeight"+windowHeight+"pixcels");
				int windowWidth=windowSize.getWidth();
				System.out.println("ChildWindowWidth"+windowWidth+"pixcels");
				Thread.sleep(5000);
				Point windowPosition=driver.switchTo().window(wid).manage().window().getPosition();
				int startX=windowPosition.getX();
				System.out.println("ChildWindowStartX"+startX+"pixcels");
				int startY=windowPosition.getY();
				System.out.println("ChildWindowStartY"+startY+"pixcels");
				Dimension targetWindowSize=new Dimension(200,250);
				driver.switchTo().window(wid).manage().window().setSize(targetWindowSize);
				Point targetWindowPosition=new Point(200,300);
				driver.switchTo().window(wid).manage().window().setPosition(targetWindowPosition);
		}
	}
		Thread.sleep(5000);
		driver.quit();
	}}
