package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {

	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemailAddress;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath=("//input[@value='Login']"))
	WebElement btnlogin;

	
	public void setEmailadress(String email) {
		
		txtemailAddress.sendKeys(email);
	}
	public void setPassword(String psw) {
	txtPassword.sendKeys(psw);
    }
	public void cliklogin2() {
		btnlogin.click();
	}
	
	
	
}
