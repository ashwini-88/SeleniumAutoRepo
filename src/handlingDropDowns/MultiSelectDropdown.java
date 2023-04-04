package handlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://testpages.herokuapp.com/basic_html_form.html");
	WebElement multiSelectDropDown = driver.findElement(By.name("multipleselect[]"));
	Select select = new Select(multiSelectDropDown);
	if(select.isMultiple()) {
		System.out.println("Boolean True-MultiSelect ");
		//select 2nd option
		select.selectByIndex(1);
		//select 3rd option
		select.selectByIndex(2);
		//de-selet 4the option 
		select.deselectByIndex(3);
		//deselect all selected option from the multi-select dropdown
		//select.deselectAll();
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		System.out.println("All selecte Options ="+ allSelectedOptions.size());
		for(WebElement selectedOptions:allSelectedOptions)
		{
			System.out.println(selectedOptions.getText());
		}
	}
	else
	{
		System.out.println("Boolean False - SingleSelect");
	}
	driver.manage().window().minimize();
		driver.quit();
}
}
