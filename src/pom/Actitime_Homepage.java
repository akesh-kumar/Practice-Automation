package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Homepage 
{

	@FindBy(xpath ="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settings;
	
	@FindBy(id="popup_menu_item_2")
	private WebElement typesOfWork;
	
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public Actitime_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void settingMethod()
	{
		settings.click();
	}


	
    public void logoutMethod() 
    {
    	logoutLink.click();
    }

}
