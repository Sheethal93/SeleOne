package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assertion_Ex {
	WebDriver driver;
	
	
	@Test(priority=1)
	  public void verify_ExactPageOpensWhileHiuttingTheURL() {
		 
		String expectedURL="https://selenium.qabible.in/index.php";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		  
	  }
	
  @Test(priority=5)
  public void verifyIfTheMessageEnteringTextboxIsEmptyInInputFormPage_byDefault() {
	 
	  WebElement inputFormTab=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab.click();
	  WebElement singleInputTextbox=driver.findElement(By.className("form-control"));
	  String actual_Result=singleInputTextbox.getAttribute("value");
	 Assert.assertTrue(actual_Result.isEmpty());
	 // Assert.assertTrue(actual_Result.isEmpty() ||actual_Result==null);
	 // Assert.assertNull(actual_Result); //not work in this case since they have mentioned it as empty
	  
  }
  
  
  @Test(priority=6)
  public void verifyIfTheInputFormIsEmptyInInputFormPage_afterEnteringMessage() {
	  WebElement inputFormTab=driver.findElement(By.xpath("//a[@class='nav-link' and @href='simple-form-demo.php']"));
	  inputFormTab.click();
	  WebElement singleInputTextbox=driver.findElement(By.className("form-control"));
	  singleInputTextbox.sendKeys("Test message");
	  String actual_Result=singleInputTextbox.getAttribute("value");
	  System.out.println("Actual text is " +actual_Result);
	//  Assert.assertFalse(actual_Result.isEmpty());
	 // Assert.assertEquals(actual_Result, "Test message");
	  Assert.assertNotNull(actual_Result);
	  
  }
  
  @Test(priority=4)
  public void verifyAllTabsArePresentOnTheHomePage(){
	  List<WebElement> allTabs=driver.findElements(By.xpath("//div[@id='collapsibleNavbar']/child::ul/child::li"));
	  for (WebElement tab : allTabs) {
		  System.out.println(tab.getText() + "," +tab.isDisplayed());
		  Assert.assertTrue(tab.isDisplayed());
		
	}
	 
		
		
  }
  
  @Test(priority=3)
  public void verifyTheCountOfAllTabsPresentOnTheHomePage(){
	  List<WebElement> allTabs=driver.findElements(By.xpath("//div[@id='collapsibleNavbar']/child::ul/child::li"));
	 int tabCount= allTabs.size();
	// Assert.assertEquals(tabCount, 9, "count Mismatch"); display only for failed condition
	 Assert.assertEquals(tabCount, 8);
  }
  
   @Test(priority=2)
  public void VerifyIfTheLogoIsDisplayedOrNotInHomePage() {
	   WebElement logoimage=driver.findElement(By.xpath("(//img[@src='images/logo.png' and @ alt='logo'])[1]"));
	   
	  boolean actualResult= logoimage.isDisplayed();
	  Assert.assertTrue(actualResult);
	   
  }
  
  @Test(priority=7)
  public void verifyTheCountOfCheckboxesInCheckboxDemoPage() {
	  WebElement inputFormTab=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab.click();
	  WebElement checkbox_DemoButton=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
	  checkbox_DemoButton.click();
	  
	  List<WebElement> allCheckboxes=driver.findElements(By.xpath("//div[@class='form-check']"));
	 int actualCountOfCheckbox= allCheckboxes.size();
	  Assert.assertEquals(actualCountOfCheckbox,5);
	  
	  
  }
  
  
  
  @Test(priority=9)
  public void  verifyTheCheckboxCheckBoxOneIsCheckedOrNotAfterClickingOnIt(){
	  WebElement inputFormTab1=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab1.click();
	  WebElement checkbox_DemoButton1=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
	  checkbox_DemoButton1.click();
	  
	  WebElement check_box_one=driver.findElement(By.id("check-box-one"));
	  check_box_one.click();
	  
	  boolean actualResult=check_box_one.isSelected();
	  Assert.assertTrue(actualResult);
		
	}
  
  
  
  @Test(priority=10)
  public void  verifyTheCountOfRadioButtonsInRadioButtonsDemoPage(){
	  WebElement inputFormTab1=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab1.click();
	  WebElement radio_buttonDemoPage=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	  radio_buttonDemoPage.click();
	  
	  List<WebElement>allRadioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
	  
	 int actual_count= allRadioButtons.size();
	 int expected_count=7;
	 
	 Assert.assertEquals(actual_count, expected_count);
	  
		
	}
  
  
  @Test(priority=11)
  public void  verify_all_radio_buttons_are_selected_or_not_by_default(){
	  WebElement inputFormTab1=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab1.click();
	  WebElement radio_buttonDemoPage=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	  radio_buttonDemoPage.click();
	  
	  List<WebElement>allRadioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
	  for (WebElement radioButton: allRadioButtons) {
		  boolean actualResult=radioButton.isSelected();
		  Assert.assertFalse(actualResult);  }
	 	
	}
  
  
  @Test(priority=12)
  public void  verify_the_radio_button_Female_is_selected_or_not_while_clicking_on_it(){
	  WebElement inputFormTab1=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab1.click();
	  WebElement radio_buttonDemoPage=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	  radio_buttonDemoPage.click();
	  
	  WebElement femaleRadioButtons=driver.findElement(By.id("inlineRadio2"));
	  femaleRadioButtons.click();
	  boolean actual=femaleRadioButtons.isSelected();
	 Assert.assertTrue(actual);
	 	
	}
  
  
  @Test(priority=13)
  public void  verifyToSelectOptionRedFromTheSelectColorDropdownInSelectInputPage(){
	  WebElement inputFormTab1=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab1.click();
	  
	 	
	}
  
  @Test(priority=15)
  public void  verify_to_select_Red_Green_from_2ndSelect_Color_dropdown(){
	  WebElement inputFormTab1=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab1.click();
	  WebElement selectInputCTA=driver.findElement(By.xpath("//a[text()='Select Input']"));
	  selectInputCTA.click();
	  
	  WebElement colour=driver.findElement(By.id("multi-select-field"));
	  
	  Select select=new Select(colour);
	  select.selectByIndex(0);
	  select.selectByIndex(2);
	  List<WebElement> allSelectedOptions=select.getAllSelectedOptions(); //get all sle
	  
	  List<String> actualSelectedOptiondText=new ArrayList<String>();   //array list
	  
	  for (String option : allSelectedOptions) {
		  actualSelectedOptiondText.add(option.getText())
	}
			  
	  
	  
	  
	 	
	}
  
  
  
  @Test(priority=8)
  public void verifyAllCheckboxesAreUncheckedByDefault() {
	  WebElement inputFormTab=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  inputFormTab.click();
	  WebElement checkbox_DemoButton=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
	  checkbox_DemoButton.click();
	  
	  List<WebElement> allCheckboxes=driver.findElements(By.xpath("//div[@class='form-check']"));
	  for (WebElement checkbox : allCheckboxes) {
		boolean actualResult=checkbox.isSelected();
		Assert.assertFalse(actualResult);
			}	  		  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
  }

  @AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
