package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Leave
{
		@FindBy(id="leaveTypeLightBox_nameField")
		private WebElement leaveName;
		
		@FindBy(id="processLeaveTimeCheckbox_createPopup")
		private WebElement LeaveTime;
		
		@FindBy(xpath = "(//input[@type='radio'])[3]")
		private WebElement asPTO;
		
		@FindBy(xpath = "(//input[@type='radio'])[4]")
		private WebElement asSickDays;
		
		@FindBy(id="leaveTypeLightBox_commitBtn")
		private WebElement newLeave;
		
		@FindBy(id="leaveTypeLightBox_cancelBtn")
		private WebElement leaveCancel;
		
		public New_Leave(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
		public void createNewLeaveMethod()
		{
			leaveName.sendKeys("Busysomework1");
			newLeave.click();
		}
		
}



