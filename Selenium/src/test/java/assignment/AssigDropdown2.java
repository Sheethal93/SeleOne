package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssigDropdown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement firstNameInputfield=driver.findElement(By.xpath("//input[@maxlength='60' and @name='firstName']"));
		firstNameInputfield.sendKeys("Alpha");
		WebElement lastNameInputfield=driver.findElement(By.name("lastName"));
		lastNameInputfield.sendKeys("Beta");
		WebElement phoneInputfield=driver.findElement(By.xpath("//input[@ maxlength='20' and @name='phone']"));
		phoneInputfield.sendKeys("5624252890");
		
		WebElement emailInputfield=driver.findElement(By.id("userName"));
		emailInputfield.sendKeys("svm@gmail.com");
		
		WebElement addressInputfield=driver.findElement(By.name("address1"));
		addressInputfield.sendKeys("Flat no 112,ABC street");
		WebElement cityInputfield=driver.findElement(By.xpath("//input[@name='city' and @maxlength='60']"));
		cityInputfield.sendKeys("Trivandrum");
		WebElement stateInputfield=driver.findElement(By.xpath("//input[@name='state' and @maxlength='40']"));
		stateInputfield.sendKeys("Kerala");
		WebElement postalCodeInputfield=driver.findElement(By.name("postalCode"));
		postalCodeInputfield.sendKeys("Kerala");
		
		WebElement countryDropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countryDropdown);
		select.isMultiple();
		select.selectByValue("INDIA");
		
		WebElement usernameInputfield=driver.findElement(By.id("email"));
		usernameInputfield.sendKeys("svm@gmail.com");
		
		WebElement passwordInputfield=driver.findElement(By.name("password"));
		passwordInputfield.sendKeys("admin");
		WebElement confpasswordInputfield=driver.findElement(By.name("confirmPassword"));
		confpasswordInputfield.sendKeys("admin");
		
		WebElement submitButton=driver.findElement(By.name("submit"));
		submitButton.click();
		
		WebElement text=driver.findElement(By.xpath("(//font[@face='Arial, Helvetica, sans-serif'])[3]"));
		String t=text.getText();
		System.out.println(t);
		
		WebElement signinLink=driver.findElement(By.xpath("//a[@ href='login.php']"));
		signinLink.click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();		
		}
}
/*Q2 ) URL : https://demo.guru99.com/test/newtours/register.php
Do registration by entering all details.  After that, 
verify that the message “Thank you for registering.
 You may now” is showing or not. 
(Note : - print the message text “Thank you for registering. 
		You may now” in console, the check if it’s displayed or not. 
		Page should come like below screenshot)
Then verify the Sign-in link is clickable or not
(Note :- click on Sign-in --- print the url of the page. Page should come like below screenshot)*/
