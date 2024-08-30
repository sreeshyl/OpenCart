package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath=("//h2[normalize-space()='My Account']"))
	WebElement msgHedding;
	
	@FindBy(xpath=("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]"))
	WebElement logout;
	
	
	public boolean isAccountPageExists() {
		try {
	return	(msgHedding.isDisplayed());
	
	}catch(Exception e) {
		return false;
			}
     }
	
	public void logOut() {
		logout.click();
	}
}
