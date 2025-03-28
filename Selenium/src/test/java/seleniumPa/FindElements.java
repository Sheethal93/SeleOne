package seleniumPa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/index.php");
		
		List<WebElement>alltabs=driver.findElements(By.cssSelector(".nav-link"));
		System.out.println(alltabs.size());
		
		for (WebElement tabs : alltabs) {
			String text=tabs.getText();
			System.out.println(text);
			}
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement>alltextbox=driver.findElements(By.cssSelector("input"));
		 
		for (WebElement textbox : alltextbox) {
			textbox.sendKeys("hi");
			
		}
		
		
		
		
		

	}

}
