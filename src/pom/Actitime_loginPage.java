package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Autoconstant;
import generic.ExcelLibrary;

public class Actitime_loginPage implements Autoconstant
{
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	

	@FindBy(id="loginButton")
	private WebElement loginButton;
	

	@FindBy(xpath="//a[contains(text(),'password?']")
	private WebElement forgotyourpasswordLink;
	

	@FindBy(xpath="//a[.='actiTIME Inc']")
	private WebElement actitimeincLink;
	
	public Actitime_loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextField.sendKeys(ExcelLibrary.excelFileDataFetch(sheet_path, sheet_name, 0, 0));
		passwordTextfield.sendKeys(ExcelLibrary.excelFileDataFetch(sheet_path, sheet_name, 0, 1));
		keepmeloggedinCheckbox.click();
		loginButton.click();
		}
	
 
	
	public void forgotyourpasswordMethod()
	{
		System.out.println(forgotyourpasswordLink.getText());
		forgotyourpasswordLink.click();
	}
	public void actitimeincMethod()
	{
		System.out.println(actitimeincLink.getText());
		actitimeincLink.click();
}

}
