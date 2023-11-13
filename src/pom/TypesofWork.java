package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesofWork 
{
	@FindBy(xpath ="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settings;
	
	@FindBy(id="popup_menu_item_2")
	private WebElement typesofwork;

	@FindBy(id="ext-gen7")
	private WebElement creattypesofwork;
	public TypesofWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
