package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		 
		WebElement usernameTextbox=driver.findElement(By.xpath("//input[@name='username']"));
		usernameTextbox.clear();
		usernameTextbox.sendKeys("admin");
		
		WebElement passwordTextbox=driver.findElement(By.xpath("//input[@name='password']"));
		passwordTextbox.clear();
		passwordTextbox.sendKeys("admin");
		 
		WebElement rememberMeCheckbox=driver.findElement(By.xpath("//input[@id='remember' and @class='ace']"));
    	//rememberMeCheckbox.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", rememberMeCheckbox);
		
		WebElement signInButton=driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-dark btn-block']"));
		signInButton.click();
		
		WebElement admin=driver.findElement(By.xpath("//a[@class='d-block']"));
		String text=admin.getText();
		System.out.println(text);
		String tagname=admin.getTagName();
		System.out.println(tagname);
		String attribute1=admin.getAttribute("href");
		System.out.println(attribute1);
		
		WebElement adminCTA=driver.findElement(By.xpath("//a[@class='nav-link' and @data-toggle='dropdown']"));
		String text1=adminCTA.getText();
		System.out.println(text1);
		String tagname2=adminCTA.getTagName();
		System.out.println(tagname2);
		String attribute2=adminCTA.getAttribute("href");
		System.out.println(attribute2);
		
	}

}
