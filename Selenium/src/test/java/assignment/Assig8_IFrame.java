package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig8_IFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(1);  >> not working with Index 
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame' and @src='frames-windows/defult1.html']"));
		System.out.println("tagname of frame :" +frame.getTagName());
		driver.switchTo().frame(frame);	
		
		
		WebElement newBrowserTabCTA=driver.findElement(By.xpath("//a[text()='New Browser Tab']"));
		System.out.println(newBrowserTabCTA.getText());
		System.out.println(	newBrowserTabCTA.getAttribute("href"));
		System.out.println("tagmene of NewBrowserTab :" +newBrowserTabCTA.getTagName());
		
		newBrowserTabCTA.click();
		driver.switchTo().defaultContent();
		
		//driver.quit();
		

	}

}
/*Q1) URL : https://way2automation.com/way2auto_jquery/frames-and-windows.php#load_box
Print the text, value of “href” attribute, and tagname of element “New Browser Tab”. Then click on it. */
