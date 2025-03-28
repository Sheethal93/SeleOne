package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigFindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		
		WebElement inputFormCTA=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputFormCTA.click();
		
		
		List<WebElement> allbuttons=driver.findElements(By.xpath("//button[@class='btn btn-primary']"));
		System.out.println(allbuttons.size());  // count of buttons
		
		// text of all the buttons
		for (WebElement buttons : allbuttons) {
			String text=buttons.getText();
			System.out.println(text);
			
		}
		
		//count of hyper link
		List<WebElement> allhyperlink=driver.findElements(By.tagName("a"));
		System.out.println(allhyperlink.size());
		
		WebElement radioBtnDemo=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		radioBtnDemo.click();
		
		List<WebElement>allradioBtns=driver.findElements(By.tagName("input"));
		System.out.println(allradioBtns.size());
		
		for (WebElement radioB : allradioBtns) {
			//boolean rad=radioB.isSelected();
			//System.out.println(rad);
		
			radioB.click();
			boolean rad=radioB.isSelected();
			System.out.println(rad);
			
		
		}
		//driver.close();
		
	}

}

/*url : https://selenium.qabible.in/index.php 
click on Input form. 
then verify the count of buttons such as Show Message, Get Total in input form page. 
verify the count of hyperlinks present on the input form page.
 click on Radio Buttons Demo. 
 Then verify all radio buttons are clickable or not.*/ 	


