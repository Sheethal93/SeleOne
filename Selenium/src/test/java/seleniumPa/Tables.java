package seleniumPa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
					
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		table.getText();
		
		//table[@id='dtBasicExample']/thead/tr - get all headings
		//table[@id='dtBasicExample']/thead/tr/th[6] -to select heading in 6th column
		//table[@id='dtBasicExample']/tbody/tr   --to select all rows
		//table[@id='dtBasicExample']/tbody/tr[3]  --to select 2nd row
		//table[@id='dtBasicExample']/tbody/tr[3]/td[6]--to select 3rd row 6th column value
		
		
		//Yo take row count and column count
		List<WebElement> allrows=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr"));
		System.out.println(allrows.size());
		//List<WebElement> colums=driver.findElements(By.xpath("//table[@id='dtBasicExample']/thead/tr/th"));
		List<WebElement> colums=allrows.get(0).findElements(By.tagName("td"));
		System.out.println(colums.size());
		
		
		
		//To print all header values
		List<WebElement> headings=driver.findElements(By.xpath("//table[@id='dtBasicExample']/thead/tr"));
		for (WebElement heading : headings) {
			System.out.println(heading.getText());
		}
		
		
		
		//To take a particular value
		WebElement salary=driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[1]/th[6]"));
		System.out.println(salary.getText());
		System.out.println("....................");
		
		for (WebElement rows : allrows) {
			List<WebElement>colu=rows.findElements(By.tagName("td"));
			for (WebElement c : colu) {
				System.out.print(c.getText()+ "  |  ");
				
			}
			System.out.println();
			
		}
		driver.quit();
	}

}
