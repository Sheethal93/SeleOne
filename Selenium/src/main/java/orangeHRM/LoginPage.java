package orangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://shee39991-trials715.orangehrmlive.com/");  //page load
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit weight
		
		String titleLoginPage=driver.getTitle();
		System.out.println("Title of the Login page is:" +titleLoginPage);  //title 
		
		
		WebElement usernameTextbox=driver.findElement(By.id("txtUsername"));  
		usernameTextbox.sendKeys("Admin");
		
		WebElement passwordTextbox=driver.findElement(By.id("txtPassword"));
		passwordTextbox.sendKeys("JZda@04yEB");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		//Explicit wait instantiated
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));  
		
		
		//******RECRUITMENT ATS PAGE******
		
		WebElement recruitmentATSTab=driver.findElement(By.id("left_menu_item_15"));
		recruitmentATSTab.click();
		
		WebElement addCandidateButton=driver.findElement(By.xpath("//button[@type='button' and @tooltip='Add Candidate']"));
		wait.until(ExpectedConditions.elementToBeClickable(addCandidateButton));
		
		addCandidateButton.click();
		
		//navigates to Add candidate modal
		String addCandiTitle=driver.getTitle();
		System.out.println( "Title of Add candidate modal is:" + addCandiTitle);
		
		WebElement firstNameInputField=driver.findElement(By.id("addCandidateForm_firstName"));
		firstNameInputField.sendKeys("Ishaani");
		
		WebElement middleNameInputField=driver.findElement(By.id("addCandidateForm_middleName"));
		middleNameInputField.sendKeys("S");
		
		WebElement lastNameInputField=driver.findElement(By.id("addCandidateForm_lastName"));
		lastNameInputField.sendKeys("Karthik");
		
		
		//vacancyDropdown
		/*WebElement vacancyDropdown=driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active' and @tabindex='0'])[1]"));
		Select select=new Select(vacancyDropdown);
		select.selectByIndex(3);  //could not find the values in html    */
		
		/*WebElement dateOfApplicationField=driver.findElement(By.id("addCandidateForm_appliedDate"));
		Select select1=new Select(dateOfApplicationField);
		select1.selectByIndex(5);*/
		
		WebElement facebookField=driver.findElement(By.id("addCandidateForm_facebook"));
		facebookField.sendKeys("fbtest");
		
		//file upload
		WebElement selectResumeupload=driver.findElement(By.cssSelector(".oxd-file-div oxd-file-div--active"));
		selectResumeupload.click();
		selectResumeupload.sendKeys("/Users/nidhinnarayan/Downloads 8d86b0e6-2e6e-4ee9-988f-3962b7dccd35.doc");
		
		
		WebElement email_InputField=driver.findElement(By.id("addCandidateForm_email"));
		email_InputField.sendKeys("abc@svm123.com");
		
		
		// candidate_sourceDropdown
		/* WebElement candidate_sourceDropdown=driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
		Select select3=new Select(candidate_sourceDropdown);
		select3.selectByIndex(2); */
		
		WebElement save_Button=driver.findElement(By.xpath("//button[@type='submit']"));
		save_Button.click();
		
		
		
		
		
		
		
		
		
		
		
		//HR ADMINISTRATION PAGE
		
		/*WebElement hrAdminButton=driver.findElement(By.xpath("//li[@id='left_menu_item_10']"));
		hrAdminButton.click();
		
		String titleHRadminpage= driver.getTitle();
		System.out.println("Title of HR Admin page is :" +titleHRadminpage);
		
		
		
		WebElement addUserbutton=driver.findElement(By.xpath("//div[@data-tooltip='Add User']"));
		//Using the action class to mimic mouse hover
		Actions action=new Actions(driver);
		action.moveToElement(addUserbutton).perform();
		System.out.println("Tooltip text :" +addUserbutton.getText());
		
		addUserbutton.click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated("//h5[@class='modal-title']"));
		
	//	WebElement addUserModalTitle=driver.findElement(By.xpath("//h5[@class='modal-title']"));  
		System.out.println("Title of the AddUser moadal is " +driver.getTitle());
		
		WebElement employeeNameInputField=driver.findElement(By.id("selectedEmployee_value"));
		employeeNameInputField.sendKeys("Ishaani");
		
		
		
		
		
		
		
		
		
		WebElementfirstNameInputField=driver.findElement(By.id("addCandidateForm_firstName")); */
		
		
		

	}

}
