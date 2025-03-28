package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Assig1Q1 {

	WebDriver driver;

	@Test(priority = 1)
	public void verifyThe_url_ofThePAge() {
		System.out.println(driver.getCurrentUrl());
	}

	@Test(priority = 2)
	public void verifyThe_title_ofThePage() {
		System.out.println(driver.getTitle());
	}

	@Test(priority = 3)
	public void verifyThe_CountOfRadioButtons_displayedOnThePage() {
		List<WebElement> all_radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(all_radioButton.size());
	}

	@Test(priority = 4)
	public void verifyThe_CountOfButtons_displayedOnPage() {
		List<WebElement> allButtons = driver.findElements(By.cssSelector("p>input"));
		System.out.println(allButtons.size());
	}

	@Test(priority = 5, enabled = false)
	public void verify_YesRadioButtonIsDeselected_byDefault() {
		WebElement yesRadioButton = driver.findElement(By.id("yes"));
		boolean actualResult = yesRadioButton.isSelected();
		Assert.assertFalse(actualResult);
		System.out.println("Yes Radio button is not selected by default");
	}

	@Test(priority = 6)
	public void verify_NoRadioButtonIsSelectedOrNot_afterClickingOnIt() {
		WebElement noRadioButton = driver.findElement(By.id("no"));
		noRadioButton.click();
		boolean actualResult = noRadioButton.isSelected();
		// Assert.assertFalse(actualResult);
		// System.out.println("No Radio button Not selected by default");

		Assert.assertTrue(actualResult);
		System.out.println("No Radio button  selected after click");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
