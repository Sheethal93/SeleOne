package seleniumPa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickMe1CTA=driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		
		
		WebElement clickMe2CTA=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		
		
		WebElement clickForPromptboxCTA=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		
		//Simple Alert- with some info and one button
		
		/*clickMe1CTA.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();*/
		
	//	Thread.sleep(1000); >> execution stops for 1ms, it is not reccomended in framework since its stops the execution  and takes time .
		clickMe2CTA.click();	
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		
		clickForPromptboxCTA.click();	
		String text1=driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().sendKeys("text");
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();

}}
