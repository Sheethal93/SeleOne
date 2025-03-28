package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig3Q3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/");
		
		WebElement logo=driver.findElement(By.xpath("(//img[@src='images/logo.png' and @alt='logo'])[1]"));
		Dimension d=logo.getSize();
		System.out.println(d);
		Point p=logo.getLocation();
		System.out.println(p);
		WebElement inputFormcta=driver.findElement(By.xpath("//a[@href='simple-form-demo.php' and @class='nav-link']"));
		inputFormcta.click();
		
		WebElement radioButtonDemoCta=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		radioButtonDemoCta.click();
		
		WebElement femaleRadiobutton=driver.findElement(By.id("inlineRadio2"));
		femaleRadiobutton.click();
		
	
		WebElement showSelectedValuebutton=driver.findElement(By.id("button-one"));
		showSelectedValuebutton.click();
		
		WebElement messagetext=driver.findElement(By.id("message-one"));
		String message=messagetext.getText();
		System.out.println(message);
		
		WebElement femaleRadioCTA=driver.findElement(By.id("inlineRadio21"));
		femaleRadioCTA.click();
		
		
		WebElement patientsAgeGroupRadiobutton=driver.findElement(By.id("inlineRadio24"));
		patientsAgeGroupRadiobutton.click();
		
		
		WebElement getResultCta=driver.findElement(By.id("button-two"));
		getResultCta.click();
		
		
		WebElement messagegetResult=driver.findElement(By.id("message-two"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView;", messagegetResult);
		String message2=messagegetResult.getText();
		System.out.println(message2);
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.close();
		
	
		
	}

}
