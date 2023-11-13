package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatNewWorklocation 
{
	public WebDriver driver;
	@FindBy(id = "ext-gen6")
	private WebElement createtypesofWork;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement activeAndArchived;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement activeOnly;
	
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement archivedOnly;
	
	@FindBy(xpath = "(//input[@type='radio'])[4]")
	private WebElement billableAndNonbillable ;
	
	@FindBy(xpath = "(//input[@type='radio'])[5]")
	private WebElement billableOnly;
	
	@FindBy(xpath = "(//input[@type='radio'])[6]")
	private WebElement nonbillableOnly;
	
	@FindBy(xpath = "//input[@value='Show Types of Work']")
	private WebElement showTypesOfWork;
	
	@FindBy(xpath= "//div[@class='supportQuestionButton']")
	private WebElement supportQuestLink;
	
	@FindBy(xpath = "(//td[@class='listtblcell billingTypeCell'])[12]")
	private WebElement enteredWork;
	
	@FindBy(xpath = "(//td[@class='listtblcell lastInRow'])[12]")
	private WebElement deleteWork;
	
	public CreatNewWorklocation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void createTypesofworkMethod()
	{
		createtypesofWork.click();
	}
	public void activeAndArchivedMethod()
	{
		activeAndArchived.click();
	}
	
	public void activeOnlyMethod()
	{
		activeOnly.click();
	}
	
	public void archivedOnlyMethod()
	{
		archivedOnly.click();
	}
	
	public void billableAndNonbillableMethod()
	{
		billableAndNonbillable.click();
	}
	
	public void billableOnlyMethod()
	{
		billableOnly.click();
	}
	
	public void nonbillableOnlyMethod()
	{

		nonbillableOnly.click();
	}
	
public void showTypesOfworkMethod()
{
	showTypesOfWork.click();
}
	
public void supportQuestMethod()
{
	supportQuestLink.click();
}

public void createdWorkLink()
{

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", enteredWork);
	

}
public void deleteWorkMethod() throws InterruptedException
{
	deleteWork.click();
	Thread.sleep(5000);
	Alert alt=driver.switchTo().alert();
	alt.accept();
	
}


}


