package seleniumPa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/select-input.php");
			driver.manage().window().maximize();
			
			
			/*Basic CSS Selectors (Selenium 4)

			1. Selecting by Tag Name

			WebElement element = driver.findElement(By.cssSelector("input"));
			âœ… Selects the first <input> tag in the DOM.

			2. Selecting by ID (#id)

			WebElement element = driver.findElement(By.cssSelector("#username"));
			âœ… Selects an element with id="username".

			3. Selecting by Class (.class)

			WebElement element = driver.findElement(By.cssSelector(".login-button"));
			âœ… Selects an element with class="login-button".

			4. Selecting by Attribute ([attribute=value])

			WebElement element=driver.findElement(By.cssSelector("input[type='password']"));
			âœ… Selects <input> elements where type="password".

			5. Selecting by Tag and Class (tag.class)

			WebElement element = driver.findElement(By.cssSelector("button.primary"));
			âœ… Selects <button class="primary">.

			6. Selecting a Direct Child (parent > child)

			WebElement element = driver.findElement(By.cssSelector("div > p"));
			âœ… Selects a <p> tag that is a direct child of a <div>.

			7. Selecting Any Descendant (ancestor descendant)

			WebElement element = driver.findElement(By.cssSelector("div p"));
			âœ… Selects any <p> inside a <div> (including nested ones).

			8. Selecting the First Child (:first-child)

			WebElement element = driver.findElement(By.cssSelector("ul li:first-child"));
			âœ… Selects the first <li> inside a <ul>.

			9. Selecting the Last Child (:last-child)

			WebElement element = driver.findElement(By.cssSelector("ul li:last-child"));
			âœ… Selects the last <li> inside a <ul>.

			10. Selecting the nth Child (:nth-child(n))

			WebElement element = driver.findElement(By.cssSelector("table tr:nth-child(2)"));
			âœ… Selects the second <tr> inside a <table>.

			11. Combining Multiple Attributes

			WebElement element = driver.findElement(By.cssSelector("input[type='text'][name='username']"));
			âœ… Selects <input> elements with both type="text" and name="username".

			12. Selecting Elements that Contain a Substring (^, $, *)

			WebElement element = driver.findElement(By.cssSelector("input[name^='user']"));
			âœ… Selects elements where name starts with "user" (e.g., username).


			WebElement element = driver.findElement(By.cssSelector("input[name$='name']"));
			âœ… Selects elements where name ends with "name" (e.g., lastname).

			WebElement element = driver.findElement(By.cssSelector("input[name*='ser']"));
			âœ… Selects elements where name contains "ser" (e.g., username).

			13. Selecting an Element Adjacent to Another (+)

			WebElement element = driver.findElement(By.cssSelector("label + input"));
			âœ… Selects the first <input> immediately after a <label>.

			14. Selecting Sibling Elements (~)

			WebElement element = driver.findElement(By.cssSelector("h2 ~ p"));
			âœ… Selects all <p> siblings that come after an <h2>.


			------------------------------------------------------------------------------------------------

			15. Selecting Multiple Elements (findElements)

			List<WebElement> elements = driver.findElements(By.cssSelector("div.card"));
			for (WebElement element : elements) {
			    System.out.println(element.getText());
			}
			âœ… Finds all elements with class="card", div is tagname.

			--------------------------------------------------------*/
			
			

	}

}
