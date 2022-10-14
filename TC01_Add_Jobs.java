package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

import Pages.HomePage;
import Pages.JobsPage;
import Pages.LoginPage;


public class TC01_Add_Jobs {
	
	WebDriver driver;
	
	 @BeforeTest
	public void OpenBrowser() throws Exception {
		 
		 driver=TestBrowser.OpenChromeBrowser();
			  
	}
	
	 
	
  @Test
  public void JobsTest() throws Exception {
	  
	  
	  LoginPage l1=new LoginPage();
	  l1.LoginPage(driver);
	  l1.OpenOrangeHRM("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  l1.Login("Admin", "admin123");
	  
	  JobsPage j1=new JobsPage();
	  j1.JobsPage(driver);
	  j1.AddJobs("Sales2", "Sales2 descr", "Sales2 Note");
	  
	  
	  HomePage h1=new HomePage();
	  h1.HomePage(driver);
	  h1.Logout();
	  
	  
	  
  }
  
  
  @AfterTest
  public void SkillsTest3() {
  		  
	  driver.quit();
  }
  	
  
  
  
}
