	package assignment;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Assig8_Alerts {
	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
			driver.manage().window().maximize();
			
			WebElement showALertboxCTA=driver.findElement(By.id("alertexamples"));
			WebElement showConfirmboxCTA=driver.findElement(By.id("confirmexample"));
			WebElement showPromptboxCTA=driver.findElement(By.id("promptexample"));
			
			showALertboxCTA.click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
			showConfirmboxCTA.click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
			
			showPromptboxCTA.click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().sendKeys("Test Alert");
			driver.switchTo().alert().accept();
				
		}
	
	}


/*Q1 ) URL : https://testpages.herokuapp.com/styled/alerts/alert-test.html
Click on 3  buttons on the page. Print text of each alerts in to console.
 Type your name on prompt alert,And then handle the alerts.*/
