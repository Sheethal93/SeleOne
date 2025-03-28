package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig7TablesQ2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		
		WebElement usernameInputField=driver.findElement(By.xpath("//input[@name='username']"));
		driver.findElements(By.tagName("input")).clear();
		usernameInputField.sendKeys("admin");
		WebElement passwordInputField=driver.findElement(By.xpath("//input[@name='password']"));
		passwordInputField.sendKeys("admin");
		WebElement signinButton=driver.findElement(By.xpath("//button[@type='submit']"));
		signinButton.click();
		
		//To get all tiles
		List<WebElement>allTiles=driver.findElements(By.xpath("//div[@class='small-box bg-info']"));
		System.out.println(allTiles.size());
		/*for (WebElement tiles : allTiles) {
				
		}*/
	
		
		driver.quit();
	}

}
