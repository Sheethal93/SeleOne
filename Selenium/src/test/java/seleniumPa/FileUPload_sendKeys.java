package seleniumPa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUPload_sendKeys {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement choosefileCTA=driver.findElement(By.id("file-upload"));
		choosefileCTA.sendKeys("/Users/nidhinnarayan/Desktop/Screenshot 2025-02-22 at 10.08.37 AM.png");
		
		WebElement submitCTA=driver.findElement(By.id("file-submit"));
		submitCTA.click();
		
	
		

	}

}
