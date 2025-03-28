package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
		
		driver.get("http://erp.qabible.in/login");
		driver.manage().window().maximize();
		driver.getTitle();
		
		WebElement usernameTextBox=driver.findElement(By.name("user_name"));
		usernameTextBox.sendKeys("admin");
		
		WebElement passwordTextBox=driver.findElement(By.id("6"));
		passwordTextBox.sendKeys("123456");
		
		WebElement signInCTA=driver.findElement(By.className("btn btn-primary  btn-flat"));
		signInCTA.click();
		//passwordTextBox.findElement(By.)
		
		driver.navigate().refresh();
		driver.navigate().to("");
		
	//	driver.getTitle();args
		
		
	}

}
