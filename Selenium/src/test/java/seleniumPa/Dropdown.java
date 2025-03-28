package seleniumPa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement dropdownSingle=driver.findElement(By.id("single-input-field"));
		Select select=new Select(dropdownSingle);
		Boolean b=select.isMultiple();
		System.out.println(b);
		
		
		select.selectByIndex(1);
		//select.selectByValue("Yellow");
	//	select.selectByVisibleText("Green");
		//selectByContainsVisibleText("R"); //Available in latest version
		
		WebElement firstOption= select.getFirstSelectedOption();
		System.out.println(firstOption);
		String text=firstOption.getText();	
		System.out.println(text);
		
		List<WebElement>allOptions=select.getOptions();
		for (WebElement options : allOptions) {
			System.out.println(options.getText());
			
		}
		
		
		
		WebElement dropdownMulti= driver.findElement(By.id("multi-select-field"));
		Select select1=new Select(dropdownMulti);
		Boolean b1=select1.isMultiple();
		System.out.println(b1);
		select1.selectByVisibleText("Green");
		select1.selectByValue("Yellow");
		
		
		 //deselect will only work in multi select dropdown
		 //select1.deselectAll(); >> to deselect allthe selected options
		 //select1.deselectByValue("Yellow");
		
	//	select1.get
		
		List<WebElement>allOptionMulti=select1.getOptions();
		for (WebElement optionM : allOptionMulti) {
			System.out.println(optionM.getText());
			
		}
		
	
	}
	

}
