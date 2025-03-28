package seleniumPa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com");//BROWSER COMMANDS
		driver.manage().window().maximize();  //code to max window- managing window by maximizing
	//	driver.manage().window().minimize();
		
		
		String title=driver.getTitle(); // to verify title //BROWSER COMMANDS
		System.out.println(title);
		
		String url=driver.getCurrentUrl();  // to get the url of current page //BROWSER COMMANDS
		System.out.println(url);
		
		
		
		
		driver.close();  //BROWSER COMMANDS //we can also use quit command -closes entire browser window which opened while execution  (Close command- only closes current window which is executing)
		//driver.quit(); //BROWSER COMMANDS
	}

}
