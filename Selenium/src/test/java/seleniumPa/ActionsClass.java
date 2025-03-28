package seleniumPa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		
		
		WebElement messagetextbox=driver.findElement(By.id("single-input-field"));
		
		//  KEYBOARTD ACTIONS
		
		Actions actions=new Actions(driver);
		/*
		actions.click(messagetextbox).build().perform();  // build used to combine and perform used to execute command
		actions.sendKeys("Test").perform();
		actions.keyDown(Keys.TAB).perform();
		actions.keyUp(Keys.TAB).perform();
		actions.sendKeys(Keys.ENTER).perform();	//actions.sendKeys(element, Keys.ENTER).perform();
		*/
		
		actions.click(messagetextbox).build().perform();
		actions.sendKeys("Test").keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys(Keys.END).build().perform();
		
		// MOUSE ACTIONS
		
		WebElement datePickersTab=driver.findElement(By.xpath("//a[@class='nav-link' and @href='index.php' ]"));
		//actions.moveToElement(datePickersTab).click().build().perform();
		actions.moveToElement(datePickersTab).contextClick().build().perform();
		
		
	}

}
