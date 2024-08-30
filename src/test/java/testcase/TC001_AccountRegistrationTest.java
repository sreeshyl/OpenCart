package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRejistrationPage;
import pageObjects.HomePage;
public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	public void verify_account_registration() throws InterruptedException {
		
		logger.info("****Starting TC001_AccountRegistrationTest****");
		try {
		HomePage hp=new HomePage(driver);
		//Thread.sleep(3000);
		logger.info("Clicking on my account");
		hp.clikMyaccount();
		logger.info("Clicked on Register link");
		//Thread.sleep(3000);
		hp.clikRegister();
		logger.info("Providing customer info");
		
		AccountRejistrationPage Accreg=new AccountRejistrationPage(driver);
		Accreg.setFirstname(randomString().toUpperCase());
		Accreg.setLastname(randomString());
		Accreg.setEmail(randomString()+"@gmail.com");
		Accreg.setTelephone(randomnumber());
		String psw=randomAlphanumeric();
		
        Accreg.setPassword(psw);
		Accreg.setConfirmPassword(psw);
        Accreg.setAgree();
        Accreg.setContinue();
        logger.info("Validating expected message...");
      
        String confmsg=Accreg.getConformationmsg();
        if(confmsg.equals("Your Account Has Been Created!")) {
        Assert.assertTrue(true);
        }
        else {
        	
        	
        			logger.error("Test failed");
        			logger.debug("Debug logs..");
        	       Assert.assertTrue(false);
        }}
       // Assert.assertEquals(confmsg,"Your Account Has Been Created!!");
		
	catch (Exception e){
			
			Assert. fail();
	}
		logger.info("Test finished");
	
		
	 
	}
}
	 

