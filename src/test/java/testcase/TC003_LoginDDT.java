package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.loginPage;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_TC003_LoginDDT(String email,String pwd,String exp) {
		
		logger.info("****Starting TC003_LoginDDT****");
		try {
		//homePage
		HomePage hp=new HomePage(driver);
		hp.clikMyaccount();
		hp.clikLogin1();
		
		//loginpage
		loginPage lp=new loginPage(driver);
		lp.setEmailadress(email);
		lp.setPassword(pwd);
		lp.cliklogin2();
		
		//myAccount
		MyAccountPage mac=new MyAccountPage(driver);
		 
			boolean targetPage=mac.isAccountPageExists();
			 
			if(exp.equalsIgnoreCase("Valied")) {
			if(targetPage==true) {
				mac.logOut();
				Assert.assertTrue(true);	
			}
			else {
				Assert.assertTrue(false);
			}
	}
		if(exp.equalsIgnoreCase("Invalied")) {
			
			if(targetPage ==true) {
				mac.logOut();
				Assert.assertTrue(false);
			}
			
			else {
				Assert.assertTrue(true	);
				
			}
			
		}
	}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("****Finshing TC003_LoginDDT****");
		}
	}

