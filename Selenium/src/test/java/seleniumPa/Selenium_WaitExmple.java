package seleniumPa;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_WaitExmple {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();

		// implicit wait is normally given after getting url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); >> Another way of implicit wait

		// Explicit wait class is instanciated
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		// first button located
		WebElement clickMe1CTA = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));

		// wait for 10 sec until click be button is identified
		wait.until(ExpectedConditions.elementToBeClickable(clickMe1CTA));
		
		/*//any element> to wait until the presencce or visiblity of  that element
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[text()='Click me!'])[1]")));
		
		wait.until(ExpectedConditions.visibilityOf(clickMe1CTA));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Click me!'])[1]")));
		*/
		
		//Click 
		clickMe1CTA.click();
		
		//wait until alert is present
		wait.until(ExpectedConditions.alertIsPresent());
		
		//accept alert command
		driver.switchTo().alert().accept();
		
		
		//second button
		WebElement clickMe2CTA=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		
		//fluent wait
		FluentWait<WebDriver> wait1 = new FluentWait<>(driver) //creating fluent wait object/instance
                .withTimeout(Duration.ofSeconds(10))  // Max wait time
                .pollingEvery(Duration.ofSeconds(1))  // Check for element every 1 second (any seconds can be used instead of 1	 )
                .ignoring(NoSuchElementException.class);  // Ignore this exception as it may show exception if element not found in each polling freq
		
		wait1.until(ExpectedConditions.elementToBeClickable(clickMe2CTA));
		clickMe2CTA.click();
		
	}

}
