package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.NationalityPage;


public class TC01_Add_Nationality {
	
	WebDriver driver;
	
	 @BeforeTest
	public void OpenBrowser() throws Exception {
		 
		 driver=TestBrowser.OpenChromeBrowser();
			  
	}
	
	 
	
  @Test
  public void SkillsTest2() throws Exception {
	  
	  
	  LoginPage l1=new LoginPage();
	  l1.LoginPage(driver);
	  l1.OpenOrangeHRM("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  l1.Login("Admin", "admin123");
	  
	 NationalityPage N1=new NationalityPage();
	 N1.NationalityPage(driver);
	 N1.AddNationality("Indian144");
	  
	  HomePage h1=new HomePage();
	  h1.HomePage(driver);
	  h1.Logout();
	  
	  
	  
  }
  
  
  @AfterTest
  public void SkillsTest3() {
  		  
	  driver.quit();
  }
  	
  
  
  
}
