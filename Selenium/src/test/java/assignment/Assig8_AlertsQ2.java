package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assig8_AlertsQ2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		// implicit wait is normally given after getting url
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Explicit wait class is instanciated
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement clickMeCTA1=driver.findElement(By.id("alertButton"));
		clickMeCTA1.click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
		WebElement clickMeCTA2=driver.findElement(By.id("timerAlertButton"));
		//clickMeCTA2.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", clickMeCTA2); 
		 wait.until(ExpectedConditions.alertIsPresent());

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
		WebElement clickMeCTA3=driver.findElement(By.id("confirmButton"));
		js.executeScript("arguments[0].click();", clickMeCTA3); 
		clickMeCTA3.click();
		wait.until(ExpectedConditions.alertIsPresent());  
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
		WebElement clickMeCTA4=driver.findElement(By.id("promtButton"));
		js.executeScript("arguments[0].click();", clickMeCTA4); 
		clickMeCTA4.click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Sheethal");
		driver.switchTo().alert().accept();
		
		driver.quit();
	}

}
/*
 * Q2 ) URL : https://demoqa.com/alerts
Click on all Click Me buttons on the page (4 buttons). 
Print text of each alerts in to console. Type your name on prompt alert, And then handle the alerts.

 
*/