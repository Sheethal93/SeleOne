package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assig1Q2 {

	WebDriver driver;
	

	@Test(priority = 1)
	public void verifyThe_exactAppOpens_whileHittingTheUrl() {
		WebElement login = driver.findElement(By.xpath("//h1[text()='Login']"));
		
		//AssetEquals-To check if actual and expected results are equal
		String expectedResult="Login";
		String actualResult=login.getText();
		
		//Assert.assertEquals(actualResult, expectedResult);  //hard assert
		
		SoftAssert softAssert=new SoftAssert();  //soft assert
		softAssert.assertEquals(actualResult, expectedResult);
		softAssert.assertAll();
		System.out.println("Heading of the login page :" +login.getText());

	}

	@Test(priority = 2)
	public void verify_LogoIsDisplayedOrNot_inLoginPage() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='logo']"));
		boolean actualResult = logo.isDisplayed();
		//boolean expectedResult=true;
		//Hard assert
		//Assert.assertEquals(actualResult, expectedResult);
		Assert.assertTrue(actualResult);
		
		System.out.println("Logo displayed:" +actualResult);

	}

	@Test(priority = 3)
	public void verify_successfulLogin() {
		WebElement username_inputField = driver.findElement(By.name("username"));
		username_inputField.sendKeys("admin");
		WebElement password_inputField = driver.findElement(By.name("password"));
		password_inputField.sendKeys("password");
		WebElement login_button = driver.findElement(By.name("submit"));
		login_button.click();
		WebElement chooseAstoreHeading = driver.findElement(By.xpath("//h1[text()=' Choose a store ']"));
		
		String actualResult=driver.getTitle();
		String expectedResult="POS - point of sale";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Title of  of Choose a Store page:" +driver.getTitle());

	}

	@Test(priority = 4)
	public void verifyUnsuccessfulLoginByUsing_InvalidUsernameAndValidPassword() {
		WebElement username_inputField = driver.findElement(By.name("username"));
		username_inputField.sendKeys("admin**");
		
		WebElement password_inputField = driver.findElement(By.name("password"));
		password_inputField.sendKeys("password");
		
		WebElement login_button = driver.findElement(By.name("submit"));
		login_button.click();
		
		//System.out.println("Title of Login Page:"+driver.getTitle());
		String actualResult=driver.getTitle();
		String expectedResultOfSuccessfulLogin="POS - point of sale";
		//String expectedResultOfSuccessfulLogin="POS Login";
		Assert.assertNotEquals(actualResult, expectedResultOfSuccessfulLogin);
		System.out.println("Title of Page:"+driver.getTitle());
		
		
	}

	@Test(priority = 5)
	public void verifyUnsuccessfulLoginByUsing_validUsernameAndInValidPassword() {
		WebElement username_inputField = driver.findElement(By.name("username"));
		username_inputField.sendKeys("admin");
		WebElement password_inputField = driver.findElement(By.name("password"));
		password_inputField.sendKeys("password**");
		WebElement login_button = driver.findElement(By.name("submit"));
		login_button.click();
		
		String actualResult=driver.getTitle();
		String expectedResult="POS Login";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Title of  page:" +driver.getTitle());
	
	}

	@Test(priority = 6)
	public void verifyUnsuccessfulLoginByUsing_validUsernameAndValidPassword() {
		WebElement username_inputField = driver.findElement(By.name("username"));
		username_inputField.sendKeys("admin**");
		WebElement password_inputField = driver.findElement(By.name("password"));
		password_inputField.sendKeys("password**");
		WebElement login_button = driver.findElement(By.name("submit"));
		login_button.click();
		
		String actualResult=driver.getTitle();
		String expectedResult="POS Login";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Title of  page:" +driver.getTitle());
		
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://qalegend.com/restaurant/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
