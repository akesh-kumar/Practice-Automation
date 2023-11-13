package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;



public class CreatNewWork 
{
	@FindBy(id="name")
	private WebElement workName;
	
	@FindBy(name="active")
	private WebElement dropdownList;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement billiable;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement nonbilliable;
	
	@FindBy(id="billingRate_input")
	private WebElement billingRate;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createWork;
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement cancelWork;
	
	@FindBy(id= "name")
	private WebElement editworkName;
	
	@FindBy(xpath = "//input[@value='   Save Changes   ']")
	private WebElement savechangesWork;
	
	
	
	public CreatNewWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewWorkMethod() throws InterruptedException
	{
		workName.sendKeys("qspiders");
		Thread.sleep(3000);
		Select s1=new Select(dropdownList);
		s1.selectByVisibleText("archived");
		billingRate.sendKeys("30");
		Thread.sleep(3000);
		createWork.click();
	}
	
	public void editworkMethod() throws InterruptedException
	{
		Thread.sleep(4000);
		editworkName.sendKeys("-jspider");
		savechangesWork.click();
	}


}


