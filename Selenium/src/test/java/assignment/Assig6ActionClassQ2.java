package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assig6ActionClassQ2 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement enterValueAtextbox=driver.findElement(By.id("value-a"));
		Actions actions=new Actions(driver);
		
		//1. hover the mouse on "Enter value A " textbox. then click on it.
		actions.moveToElement(enterValueAtextbox).click().build().perform();
		
		//2.type : 10, 
		actions.sendKeys("10").build().perform();
		
		//3.press Tab key, then type 25 on "Enter value B " textbox.
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("25").build().perform();
		
		//4. press Tab key, and press Enter key to click on Get Total button.
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		//5. print the text "Total A + B : 35" in the console.
		WebElement resultText=driver.findElement(By.id("message-two"));
		String result=resultText.getText();
		System.out.println(result);
		
	}

}

/*
  Q2) url : https://selenium.qabible.in/simple-form-demo.php
1. hover the mouse on "Enter value A " textbox. then click on it.
2. type : 10
3. press Tab key, then type 25 on "Enter value B " textbox.
4. press Tab key, and press Enter key to click on Get Total button.
5. print the text "Total A + B : 35" in the console.

 */
