package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi7TablesQ1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@border='2']"));
		
		
	//	WebElement hotel=driver.findElement(By.xpath("//table[@border='2']/tbody/tr[3]/td[2]"));
		
		
		List<WebElement>allrows=driver.findElements(By.xpath("//table[@border='2']/tbody/tr"));
		for (WebElement hotel1 : allrows) {	
			System.out.println(hotel1.getText());
			
		}
		System.out.println(allrows.size());
		
	//List<WebElement> allcolums=driver.findElements(By.xpath("//table[@border='2']/tbody/tr/td"));
	List<WebElement> allcolums=allrows.get(0).findElements(By.xpath("//table[@border='2']/tbody/tr/td"));	
	System.out.println(allcolums.size());
	
	
	WebElement table2=driver.findElement(By.xpath("((//table[@width='270' and @border='0' and @cellspacing='0' ])[1] "));	
//	WebElement newyTorkoChicago =driver.findElement(By.xpath("/(//table[@width='270' and @border='0' and @cellspacing='0' ])[1] /tbody/tr[4]/td[1]"));
	
	
	}

}
