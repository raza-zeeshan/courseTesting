package PageObjects;


import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 
 
public class BasePage 
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
	
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
		// TODO Auto-generated constructor stub
	
	
	public String randomString()
	{
		String str = RandomStringUtils.randomAlphabetic(10);
		return str;
	}
	public String randomNumber()
	{
		String str = RandomStringUtils.randomNumeric(10);
		return str;
	}
	
}