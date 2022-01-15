package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Generic_read_excel;
import POM.Facebook;



public class Facebook_login extends Base_Test
{
	@Test
	public void loginE()
	{
		String un = Generic_read_excel.getData("Sheet1", 0, 0);
		String pwd = Generic_read_excel.getData("Sheet1", 0, 0);
		Facebook f=new Facebook(driver);
		f.setUsername(un);
		f.setPassword(pwd);
		f.button1();
		//Assert.fail();
	}
}
