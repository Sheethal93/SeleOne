package seleniumPa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); 
		String title= driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//navigation commands
		
		driver.navigate().to("https://www.amazon.in/");
			
			//String url2="https://www.amazon.in/";
			//driver.navigate().to(url2);
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
		driver.quit();
		
	}

}
