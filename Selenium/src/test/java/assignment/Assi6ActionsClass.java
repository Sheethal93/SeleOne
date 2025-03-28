package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assi6ActionsClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		WebElement dragbox=driver.findElement(By.id("draggable"));
		 
		    //do drag and drop
		WebElement dropbox=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(dragbox, dropbox).build().perform();
		
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		//drag 5000 under each Amount
		
		WebElement amount1droppable=driver.findElement(By.id("amt7"));
		
		WebElement fiveKdraggable=driver.findElement(By.id("fourth"));
		Actions actions2=new Actions(driver);
		actions2.dragAndDrop(fiveKdraggable, amount1droppable).build().perform();
		
		WebElement amount2droppable=driver.findElement(By.id("amt8"));
		actions2.dragAndDrop(fiveKdraggable, amount2droppable).build().perform();
		
		//drag Bank under Account
		WebElement bankDraggable=driver.findElement(By.id("credit2"));
		WebElement account1Droppable=driver.findElement(By.id("bank"));
		actions2.dragAndDrop(bankDraggable, account1Droppable).build().perform();
		
		//drag Sales under Account
		WebElement account2Droppable=driver.findElement(By.id("loan"));
		WebElement salesDraggable=driver.findElement(By.id("credit1"));
		actions2.dragAndDrop(salesDraggable, account2Droppable).build().perform();
		
		//hover the mouse on Perfect! button, then click on it
		WebElement perfectText=driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
		actions2.moveToElement(perfectText).click().build().perform();
	}

}
/*Q1 ) go to the url : https://jqueryui.com/resources/demos/droppable/default.html
do drag and drop.
navigate to the url : https://demo.guru99.com/test/drag_drop.html. 
do drag and drop. drag 5000 under each Amount, Bank under Account, Sales under Account.
hover the mouse on Perfect! button, then click on it. 
*/