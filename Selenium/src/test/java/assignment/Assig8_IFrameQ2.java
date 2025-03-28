package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assig8_IFrameQ2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();

		// Switch to frame with the CouseName element
		driver.switchTo().frame("frm1");

		WebElement courseNameDropdown = driver.findElement(By.xpath("(//select[@id='course'])[1]"));
		// WebElement courseNameDropdown=driver.findElement(By.id("course"));

		// to scroll till coursename
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", courseNameDropdown);

		// select coursename dropdown and select python
		Select select1 = new Select(courseNameDropdown);
		select1.selectByVisibleText("Python");
		WebElement selectedfirst = select1.getFirstSelectedOption();
		System.out.println(selectedfirst.getText());

		// to swichback from frame1 to main
		driver.switchTo().defaultContent();

		// switch to frame 2 where firstname element is available
		driver.switchTo().frame("frm2");
		WebElement firstNametextbox = driver.findElement(By.id("firstName"));
		js.executeScript("arguments[0].scrollIntoView();", firstNametextbox); // to scroll till first name
		firstNametextbox.sendKeys("Sheethal");
		System.out.println(firstNametextbox.getAttribute("value"));
		driver.switchTo().defaultContent(); // to switch back from frame 2 to main

		driver.quit();

	}

}
/*
 * Q2) URL : https://www.hyrtutorials.com/p/frames-practice.html Scroll down and
 * select any course from the drop down “Course Name:” and print selected couse
 * name in to the console. Scroll down and enter your first name on First Name
 * textbox. And print the entered name in to the console. (Note : use “value”
 * attribute to get the entered value from a textbox)
 */
