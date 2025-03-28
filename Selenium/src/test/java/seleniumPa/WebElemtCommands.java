package seleniumPa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemtCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement messageTextBox=driver.findElement(By.id("single-input-field"));
		messageTextBox.sendKeys("Hi");
		
		WebElement showmessageCTA=driver.findElement(By.xpath("//button[text()='Show Message']"));
				showmessageCTA.click();	
		WebElement yourmessageText=driver.findElement(By.id("message-one"));
		String text=yourmessageText.getText();
		System.out.println(text);
		WebElement enterValueATextBox=driver.findElement(By.id("value-a"));
		enterValueATextBox.sendKeys("20");
		WebElement enterValueBTextBox=driver.findElement(By.id("value-b"));
		enterValueBTextBox.sendKeys("30");
		WebElement getTotalCTA=driver.findElement(By.id("button-two"));
		getTotalCTA.click();
				
	}

}
