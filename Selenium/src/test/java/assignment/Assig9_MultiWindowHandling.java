package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig9_MultiWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		// get main window handle
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		
		
		WebElement openNewWindowbutton=driver.findElement(By.id("newWindowBtn"));
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeAsyncScript("argument(0).scrollIntoView();", openNewWindowbutton);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		 js.executeScript("arguments[0].scrollIntoView();", openNewWindowbutton);

		openNewWindowbutton.click();
		//driver.manage().window().maximize();
		
		//get all window handles
		Set<String> allWindowHandles=driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				
				driver.manage().window().maximize();
				
				WebElement firstNameTextbox=driver.findElement(By.id("firstName"));
				firstNameTextbox.sendKeys("sheethal");
				
				WebElement lastNameTextbox=driver.findElement(By.id("lastName"));
				lastNameTextbox.sendKeys("Vikram");
				
				WebElement femaleRadiobutton=driver.findElement(By.id("femalerb"));
				femaleRadiobutton.click();
				
				WebElement englishchbx=driver.findElement(By.id("englishchbx"));
				englishchbx.click();
				
				WebElement hindichbx=driver.findElement(By.id("hindichbx"));
				hindichbx.click();
			
				WebElement emailTextbox=driver.findElement(By.id("email"));
				emailTextbox.sendKeys("svm@gmail.com");
				
				
				WebElement passwordTextbox=driver.findElement(By.id("password"));
				passwordTextbox.click();
				
				WebElement registerButn=driver.findElement(By.id("registerbtn"));
				registerButn.click();
				
				WebElement registratinSuccessfulmsg=driver.findElement(By.id("msg"));
				String text=registratinSuccessfulmsg.getText();
				System.out.println(text);
				
				break;
				
				
			}
			
			
		}
		//switch to main window
		Thread.sleep(1000);
		driver.switchTo().window(parentWindowHandle);
		System.out.println("Parent window title:" +driver.getTitle());
		WebElement headingWindowsPracticeHandles=driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
		System.out.println("Parent window heading:" +headingWindowsPracticeHandles.getText());
		
		
		driver.quit();

	}

}


/*
 * https://www.hyrtutorials.com/p/window-handles-practice.html
 *  Go to the URL. apply scrolling to find Open New Window button and click on it.
 *   maximize the opened window And do registration. get the text of "Registration is Successful" msg in to console 
 *   and verify the msg is displaying or not. after that, switch back to main window. get the title of the main window. 
 * and get the text of heading "Window Handles Practice" on the main window. Close all windows
 */
