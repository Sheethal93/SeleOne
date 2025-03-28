package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FirstProgram {
	
	WebDriver driver;
	
  @Test(priority = 1)
  public void verifyTheExactPageIsOpensWhileHittingTheURL() {
	  System.out.println(driver.getCurrentUrl());
  }
  
  @Test(priority = 0,enabled = false)
  public void verifyTheLogoIsDisplayedOrNot() {
	  WebElement logo=driver.findElement(By.xpath("(//img[@src='images/logo.png'])[1]"));
	 boolean actualResult= logo.isDisplayed();
	 System.out.println(actualResult);
	 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");  //page load
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
	  

}}



