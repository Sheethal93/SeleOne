package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig3Q1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement yesradiobutton=driver.findElement(By.id("yes"));
		boolean yes=yesradiobutton.isSelected();
		System.out.println(" button selected:" +yes);
		
		WebElement noradiobutton=driver.findElement(By.id("no"));
		noradiobutton.click();
		boolean no=noradiobutton.isSelected();
		System.out.println("button selected:"+ no);
		driver.close();
		
	}

}
