package testcase;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.loginPage;

public class TC002_loginTest extends BaseClass {

	@Test
	public void verify_login() {
		
	logger.info("***Starting TC002_loginTest***");	
	
	try {
	//HomePage
	logger.info("click  login Account...");
	HomePage hp=new HomePage(driver);
	hp.clikMyaccount();
	hp.clikLogin1();
	
	//loginpage
	loginPage lp=new loginPage(driver);
	lp.setEmailadress(p.getProperty("email"));
	lp.setPassword(p.getProperty("password"));
	lp.cliklogin2();
	
	//myAccount
	MyAccountPage mac=new MyAccountPage(driver);
	 
		boolean targetPage=mac.isAccountPageExists();
		Assert.assertTrue(targetPage);
		logger.info("***Finishing TC002_loginTest***");
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	}
	
}
