package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssigDropdown1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement couseNameDropdown=driver.findElement(By.id("course"));
		Select select=new Select(couseNameDropdown);
		Boolean b=select.isMultiple();
		System.out.println("Is CouseNameDropdown a multi select dropdown :" + b);
		
		WebElement ideNamedropdwn=driver.findElement(By.id("ide"));
		Select select2=new Select(ideNamedropdwn);
		Boolean b2=select2.isMultiple();
		System.out.println("Is IDENamedropdwn a multi select dropdown :" + b2);
		
		
		System.out.println(".....................");
		
		
		//Print all options from "Course Name" dropdown.
		List<WebElement> alloptions=select.getOptions();
		for (WebElement options : alloptions) {
			System.out.println(options.getText());}
		
		
		System.out.println(".....................");
			
		//then select "Python"	
		select.selectByIndex(3);
		
		List<WebElement> allselectedOptions=select.getAllSelectedOptions();
		for (WebElement selected : allselectedOptions) {
			
			System.out.println("Selected option from Coursename dropdn :" + selected.getText());
			
		}
		
		//select Eclipse, Visual Studio, NetBeans from  "IDE Name" dropdown.
		
		select2.selectByVisibleText("Eclipse");
		select2.selectByIndex(2);
		select2.selectByValue("nb");
		
		System.out.println(".....................");
		
		//print 1st selected option
		WebElement firstoption=select2.getFirstSelectedOption();
		System.out.println("1st selected option IDE:" + firstoption.getText());
		
		System.out.println(".....................");
		
		//print all selected options from "IDE Name" dropdown.
		
		List<WebElement> allSeleOptionsIDE=select2.getAllSelectedOptions();
		for (WebElement optionsIDE : allSeleOptionsIDE) {
			System.out.println( optionsIDE.getText());
			
		}
		
		driver.close();
	}

}


/*Q1 ) URL :  https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html
Goto the URL. Then do the steps
1. verify which one is multi select dropdown.
2. Print all options from "Course Name" dropdown. 
and the select "Python", then print it in the console.
3. select Eclipse, Visual Studio, NetBeans from  "IDE Name" dropdown.
 and print 1st selected option and 
 all selected options from "IDE Name" dropdown.*/
