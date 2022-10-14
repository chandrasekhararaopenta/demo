package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SkillsPage;

public class TC01_Add_Skills {
	
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
	  
	  SkillsPage S1=new SkillsPage();
	  S1.SkillsPage(driver);
	  S1.AddSkills("Java121", "Java121 descr");
	  
	  HomePage h1=new HomePage();
	  h1.HomePage(driver);
	  h1.Logout();
	  
	  
	  
  }
  
  
  @AfterTest
  public void SkillsTest3() {
  		  
	  driver.quit();
  }
  	
  
  
  
}
