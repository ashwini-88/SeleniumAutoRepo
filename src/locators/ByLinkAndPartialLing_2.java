package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkAndPartialLing_2 {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://afmc.nic.in/");
    WebElement optionDepartment = driver.findElement(By.linkText("Departments"));
    optionDepartment.click();
    Thread.sleep(4000);
    driver.navigate().back();
    WebElement optionCovidBulletin = driver.findElement(By.linkText("COVID BULLETIN"));
    optionCovidBulletin.click();
    Thread.sleep(4000);
    driver.navigate().back();
    Thread.sleep(4000);
    JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,2200)");
    Thread.sleep(4000);
    //WebElement ItCellCompleteTagText = driver.findElement(By.linkText("IT CELL, Armed Forces Medical College Pune"));
    //ItCellCompleteTagText.click();
    //Partial Link Text As the Locator STRATOGY
    WebElement ItCellPartialTagText = driver.findElement(By.partialLinkText("IT CELL"));
    ItCellPartialTagText.click();
    Thread.sleep(4000);
    driver.manage().window().minimize();
    driver.quit();
}
}
