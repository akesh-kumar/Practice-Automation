package test;



import org.testng.annotations.Test;

import generic.BaseTest;

import pom.Actitime_Homepage;
import pom.New_Leave;
import pom.Types_Leave;




public class ActiLogPage extends BaseTest
{

	@Test
	public void setting()
	{
		pom.Actitime_Homepage set=new Actitime_Homepage(driver);
		set.settingMethod();
		Types_Leave click2=new Types_Leave(driver);
		  click2. typesofleave();
		  
		  Types_Leave click3=new Types_Leave(driver);
		         click3.creatleavetype();
		         New_Leave click4=new New_Leave(driver);
		        		 click4.createNewLeaveMethod();
		        		 System.out.println("created");
	}

}
