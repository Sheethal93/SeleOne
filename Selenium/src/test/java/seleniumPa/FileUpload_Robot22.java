package seleniumPa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Robot22 {

	public static void main(String[] args) throws AWTException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))	;	
		WebElement choosefileCTA=driver.findElement(By.id("uploadfile_0"));
		choosefileCTA.click();
		
		
		StringSelection filePath= new StringSelection("/Users/nidhinnarayan/Desktop/Screenshot 2025-02-22 at 10.08.37 AM.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.delay(2);
		rob.keyPress(KeyEvent.VK_V);
		rob.delay(2);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.delay(2);
		rob.keyRelease(KeyEvent.VK_V);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.delay(2);
		rob.keyRelease(KeyEvent.VK_ENTER);
		rob.delay(2);
		System.out.println("File upload succesfull");

	}

}
