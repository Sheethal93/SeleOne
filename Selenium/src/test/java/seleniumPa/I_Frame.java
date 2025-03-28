package seleniumPa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//Switch to frame to locate the element inside the frame 
		//1.>> using index
		//driver.switchTo().frame(4);
		//2.>> using id
		//driver.switchTo().frame("frame1");
		
		//3.using element creation
		WebElement iFrame=driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		
		//locate heading element
		WebElement thisIsSmapleTextHeading=driver.findElement(By.id("sampleHeading"));
		
		//switch back to main page
		driver.switchTo().defaultContent();
		
		

	}

}
