package seleniumPa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
		driver.manage().window().maximize();
		
		//get mainn window handle
		
		String mainWindowHandle=driver.getWindowHandle();
		System.out.println(mainWindowHandle);
		
		
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame' and @src='frames-windows/defult1.html']"));
		driver.switchTo().frame(frame);
		WebElement newBrowserTabCTA=driver.findElement(By.xpath("//a[text()='New Browser Tab']"));
		newBrowserTabCTA.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		//get all window handles
		
		Set<String> allWindowHandle=driver.getWindowHandles();
		System.out.println(allWindowHandle);
		
		for (String windowHand : allWindowHandle) {
				if (!windowHand.equals(mainWindowHandle)) {
					driver.switchTo().window(windowHand);
					
					System.out.println("Title of child window" +driver.getTitle());
					System.out.println("url of child window" +driver.getCurrentUrl());
					break;
					
				}
			
		}
		//switch back to main/parent window
		Thread.sleep(2000);
		driver.switchTo().window(mainWindowHandle);
		System.out.println("Title of mainWindow" +driver.getTitle());
	}

}
