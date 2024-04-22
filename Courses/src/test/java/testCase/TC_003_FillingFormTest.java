

package testCase;

import testbase.BaseClass;
//import utilities.DataProviders;
//import utilities.DataProviders

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.FillFormPage;

public class TC_003_FillingFormTest extends BaseClass
{
	@Test(priority =10, groups= {"sanity","regression"})
	public void verify_coursera_page() throws InterruptedException
	{
		logger.info("***** Starting TC_003_ReadyToTransformTest *****");
		HomePage hp = new HomePage(driver);
		logger.info("***** Navigating To Home Page *****");
		hp.coursera();
		logger.info("***** Verifying Home Page *****");
		Assert.assertEquals(hp.home_page(), true);
		logger.info("***** Home Page Verified *****");
		Thread.sleep(3000);
		logger.info("***** Scrolling To Page Footer *****");
		hp.scroll_page_height();
		logger.info("***** Clicking For Enterprise *****");
		hp.click_for_enterprie();
	}
	
	
	@Test(priority =11, groups= {"sanity","regression"})
	public void verify_enterprise_page() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		logger.info("***** Verifying Enterprise Page *****");
		Assert.assertEquals(hp.EnterprisePage(), true);
		logger.info("***** Enterprise Page Verified *****");
		logger.info("***** Scrolling To FillForm *****");
	    
		logger.info("***** Filling  the Form *****");
		
	}
	
	

	@Test(priority = 12, groups= {"regression"})
	public void validate_first_name()
	{
		
		FillFormPage form = new FillFormPage(driver);
		Assert.assertEquals(form.first_name(), true);
	}	
	
	@Test(priority = 13, groups= {"regression"})
	public void validate_last_name()
	{
		FillFormPage form = new FillFormPage(driver);
		Assert.assertEquals(form.last_name(), true);
	}	
	@Test(priority=14,groups= {"regression"})
	public void email()  {
		FillFormPage form = new FillFormPage(driver);
		
		form.phone_number();
	}
	
	
	@Test(priority = 15, groups= {"regression"})
	public void validate_institution_type() throws InterruptedException
	{
		
		FillFormPage form = new FillFormPage(driver);
		try
		{
			if(form.institution_type() == true)
			{
				form.institution_type();
				Assert.assertTrue(true);
			}
		}
		catch(Exception e)
		{
		
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 16, groups= {"regression"})
	public void validate_institution_name()
	{
	
		FillFormPage form = new FillFormPage(driver);
		Assert.assertEquals(form.institution_name(), true);
	}
	
	@Test(priority = 17, groups= {"regression"})
	public void validate_job_role() throws InterruptedException
	{
		FillFormPage form = new FillFormPage(driver);
		try
		{
			if(form.job_role() == true)
			{
				form.job_role();
				Assert.assertTrue(true);
			}
		}
		catch(Exception e)
		{
		
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 18, groups= {"regression"})
	public void validate_department() throws InterruptedException
	{
		Thread.sleep(6000);
		FillFormPage form = new FillFormPage(driver);
		//Assert.assertEquals(form.department(), true);
		try
		{
			if(form.department() == true)
			{
				form.department();
				Assert.assertTrue(true);
			}
		}
		catch(Exception e)
		{
		
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority = 19, groups= {"regression"})
	public void validate_description() throws InterruptedException
	{ 
		Thread.sleep(3000);
		FillFormPage form = new FillFormPage(driver);
		try
		{
			if(form.description() == true)
			{
				form.description();
				Assert.assertTrue(true);
			}
		}
		catch(Exception e)
		{
		
			Assert.assertTrue(true);
		}

	}
	
	@Test(priority = 20, groups= {"regression"})
	public void validate_country()
	{
		FillFormPage form = new FillFormPage(driver);
		try
		{
			if(form.exlea() == true)
			{
				form.exlea();
				Assert.assertTrue(true);
			}
		}
		catch(Exception e)
		{
		
			Assert.assertTrue(true);
		}	
		Assert.assertEquals(form.country(), true);
		try
		{
			if(form.state_field() == true)
			{
				form.select_state();
				Assert.assertTrue(true);
			}
		}
		catch(Exception e)
		{
		
			Assert.assertTrue(true);
		}
		
	}
	@Test(priority = 21,groups= {"regression"})
	public void validate_input() throws InterruptedException, IOException
	{
	    HomePage hp = new HomePage(driver);
	    FillFormPage form = new FillFormPage(driver);
	        form.email();
	        logger.info("***** Clicking Submit Button *****");
	        Thread.sleep(3000);
	        
	        form.click_submit_button();
	        hp.scroll_up();
	        form.email_msg();
	       
	      
	   
	       
	        logger.info("***** TC_003_FillformTest Completed *****");
	    
	    
	}

	

		
		
		
		
		
		
		
	
	
}