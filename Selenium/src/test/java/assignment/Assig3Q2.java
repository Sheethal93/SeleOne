package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig3Q2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qalegend.com/restaurant/");
		
		WebElement usernametextbox=driver.findElement(By.name("username"));
		usernametextbox.sendKeys("admin");
		
		WebElement passwordtextbox=driver.findElement(By.name("password"));
		passwordtextbox.sendKeys("password");
		
		WebElement loginCTA=driver.findElement(By.name("submit"));
	
		loginCTA.click();
		
		WebElement chooseAStoreHeading= driver.findElement(By.xpath(" //h1[text()=' Choose a store ']"));
		String heading=chooseAStoreHeading.getText();
		System.out.println(heading);
		
		WebElement hamburgerMenuCTA=driver.findElement(By.xpath("//span[@class='icon-bar']"));
		hamburgerMenuCTA.click();
		
		WebElement productCTA=driver.findElement(By.xpath("//span[text()='Product' and @class='menu-text' ]"));
		String text1=productCTA.getText();
		System.out.println(text1);
		productCTA.click();
		
		
		WebElement addProductCTA=driver.findElement(By.xpath("(//button[text()='Add Product'])[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView;", addProductCTA);
		
		addProductCTA.click();
		
		WebElement codetextbox=driver.findElement(By.xpath("//input[@id='ProductCode']"));
		codetextbox.click();
		codetextbox.sendKeys("12345");
		
		WebElement nametextbox=driver.findElement(By.id("ProductName"));
		nametextbox.sendKeys("Speaker");
		
		WebElement purchasePricetextbox=driver.findElement(By.id("PurchasePrice"));
		purchasePricetextbox.sendKeys("3000");
		
		WebElement pricetextbox=driver.findElement(By.id("Price"));
		pricetextbox.sendKeys("4000");
		
		WebElement submitCTA=driver.findElement(By.xpath("(//button[@type='submit' and text()='Submit'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", submitCTA); 
		String submittext=submitCTA.getText();
		System.out.println(submittext);
		submitCTA.click();
		WebElement submitCTAStockpopup=driver.findElement(By.xpath("//button[@type='button' and @onclick='updatestock()']"));
		submitCTAStockpopup.click();
		
		WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("Biriyani");
		
		driver.navigate().back();
		driver.close();
		
		
		
		
	}

}
