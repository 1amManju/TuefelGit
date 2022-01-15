package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_Page;

public class Facebook extends Base_Page
{
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[.='Log In']")
	private WebElement login;
	
	public Facebook(WebDriver driver)
	{
		super(driver);
	}
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void button1()
	{
		login.click();
	}
	

}
