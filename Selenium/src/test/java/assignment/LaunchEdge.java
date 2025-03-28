package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement searchTextBox=driver.findElement(By.id("APjFqb"));
		searchTextBox.sendKeys("Apple fruit");
		searchTextBox.sendKeys(Keys.ENTER);
		
		//WebElement googleSearchCTA=driver.findElement(By.className("gNO89b"));
		//googleSearchCTA.click();
		
		driver.getTitle();
		driver.getCurrentUrl();
		driver.navigate().back();
		driver.quit();
		
		
		
		
		
		
	}

}
