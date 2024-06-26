
package testCase;

import java.io.IOException;
import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.FirstCoursePage;
import PageObjects.HomePage;
import PageObjects.SecondCoursePage;
import PageObjects.CoursePage;
import testbase.BaseClass;
//import utilities.ExcelUtils;

public class TC_001_CourseTest  extends BaseClass
{
	
	List<String> course1;
	List<String> course2;
	HomePage hp;
	BaseClass bc;
	
	@Test(priority =1, groups= {"sanity"})
	public void validate_home_page()
	{
		logger.info("***** Starting TC_001_WebDevelopmentTest *****");
		hp = new HomePage(driver);
		
		logger.info("***** Opening Coursera Home Page *****");
		logger.info("***** Verifying Coursera Home Page *****");
		
		Assert.assertEquals(hp.home_page(), true);
		logger.info("***** Coursera Home Page Verified *****");
	}
	
	@Test(priority=2, groups= {"sanity","regression"})
	public void validate_course_search() throws IOException
	{
		hp = new HomePage(driver);
		CoursePage wd = new CoursePage(driver);
		bc=new BaseClass();
		try 
		{	logger.info("***** Searching Web Development Courses *****");
			hp.search_web_development_courses();		} 
		catch (IOException e1) 
		{	e1.printStackTrace();		}
		
		try 
		{	Thread.sleep(3000);		}
		catch (InterruptedException e) 
		{	e.printStackTrace();	}
		logger.info("***** Verifying Course Search *****");
		
		String expSearchResult = "results for \"Web Development Courses\"";
		String actSearchResult = wd.no_of_courses();
		Assert.assertEquals(actSearchResult.contains(expSearchResult),true );
		logger.info("***** Course Search Verified *****");
		bc.takeScreenshot("SearchScreenshot");
		// logger + sc
	}
	
	@Test(priority=3, groups= {"regression"})
	public void validate_language()
	{
		HomePage hp = new HomePage(driver);
		CoursePage wd = new CoursePage(driver);
		logger.info("***** Scrolling Down *****");
		
		hp.scroll_down();
		
		Assert.assertEquals(wd.select_english().contains("English"),true);
		logger.info("***** Language Selection Is Done *****");
		// logger + sc
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4, groups= {"regression"})
	public void validate_level()
	{
		HomePage hp = new HomePage(driver);
		CoursePage wd = new CoursePage(driver);
		logger.info("***** Scrolling Down *****");
		hp.scroll_down();
		Assert.assertEquals(wd.select_beginner().contains("Beginner"),true );
		logger.info("***** Level Selection Is Done *****");
		// logger + sc
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{			
			e.printStackTrace();
		}
		hp.scroll_up();
	}
	
	@Test(priority=5, groups= {"regression"})
	public void validate_course1() throws IOException
	{	
		HomePage hp = new HomePage(driver);
		CoursePage wd = new CoursePage(driver);
		FirstCoursePage fc = new FirstCoursePage(driver);
		logger.info("***** Scrolling Up *****");
		hp.scroll_up();
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		logger.info("***** Getting First Course Details *****");
		course1 = fc.course1_details();
		wd.click_course1();
		wd.switch_driver_to_course();
		bc.takeScreenshot("course1");
		hp.scroll_down();
		String duration1 = fc.course1_duration();
		logger.info("***** Printing First Course Details *****");
		System.out.println(course1.get(0));
		System.out.println(course1.get(1));
		System.out.println(duration1);
		course1.add(duration1);
		fc.switch_to_default();
		Assert.assertEquals(wd.course1_startswith().isDisplayed(), true);
		logger.info("***** Writing First Course Details *****");
		WriteExcelData(course1, 0);
		// logger + sc
	}
	
	@Test(priority=6, groups= {"regression"})
	public void validate_course2() throws IOException, InterruptedException
	{
		HomePage hp = new HomePage(driver);
		CoursePage wd = new CoursePage(driver);
		SecondCoursePage sc = new SecondCoursePage(driver);
		hp.scroll_up();
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		logger.info("***** Getting Second Course Details *****");
		course2 = sc.course2_details();
		wd.click_course2();
		wd.switch_driver_to_course();
		bc.takeScreenshot("course2");
		hp.scroll_down();
		String duration2 = sc.course2_duration();
		
		logger.info("***** Printing First Course Details *****");
		System.out.println(course2.get(0));
		System.out.println(course2.get(1));
		System.out.println(duration2);
		course2.add(duration2);
		Thread.sleep(3000);
		sc.switch_to_default();
	
		Assert.assertEquals(wd.course2_startswith().isDisplayed(), true);
		
		logger.info("***** Writing First Course Details *****");
		WriteExcelData(course2, 1);
		logger.info("***** TC_001_WebDevelopmentTest *****");
		// logger + sc
	}
	


	
	
}