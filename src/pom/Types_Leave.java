package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Types_Leave 
{

	@FindBy(xpath ="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settings;
	
	@FindBy(id="popup_menu_item_3")
	private WebElement leavetypes;
	
	@FindBy(id="popup_menu_item_2")
	private WebElement typesofwork;
	

	@FindBy(id="ext-gen7")
	private WebElement creatleaves;
	
	public Types_Leave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void settingMethod()
	{
		settings.click();
	}
	public void typesofwork()
	{
		 typesofwork.click();
	}
	public void  typesofleave()
	{
		leavetypes.click();
	}
	public void creatleavetype()
	{
		creatleaves.click();
	}
}
