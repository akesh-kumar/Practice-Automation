package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.Actitime_Homepage;
import pom.Actitime_loginPage;

public class BaseTest implements Autoconstant
{
	public WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
	System.setProperty(chrome_key, chrome_value);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();

	}
	@BeforeMethod
	public void loginTo() throws IOException
	{
		Actitime_loginPage page1=new Actitime_loginPage(driver);
		page1.loginMethod();
	 	
	}
	@AfterMethod
	public void logoutFrom() throws InterruptedException
	{
		 Actitime_Homepage page2=new  Actitime_Homepage(driver);
	page2.logoutMethod();
	}
	@AfterClass
	public void close()
	{
	driver.quit();	
	}

}
