package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRejistrationPage extends BasePage {

	public AccountRejistrationPage (WebDriver driver){
		super(driver);
		
	}
	
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
			       
	WebElement txtFirstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconfirmPSW;
	@FindBy(xpath="//input[@name='agree']")
	WebElement btnAgree;
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	WebElement btnContinue;
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	WebElement confMSG;
	
	
	public void setFirstname(String fname) {
		txtFirstname.sendKeys(fname);
		
	}
	public void setLastname(String lname) {
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setTelephone(String telephone) {
		txtTelephone.sendKeys(telephone);
	}
	
	
    public void setPassword(String pwd)	{
    	txtPassword.sendKeys(pwd);
    }
    
    public void setConfirmPassword(String cnfPWD)
    {
    	txtconfirmPSW.sendKeys(cnfPWD);
    }
	public void setAgree() {
		//btnAgree.click();
		 WebDriverWait mywait2=new WebDriverWait(driver,Duration.ofSeconds(5));
			mywait2.until(ExpectedConditions.elementToBeClickable(btnAgree)).click();
	}
	public void setContinue() {
		//btnContinue.click();
		 WebDriverWait mywait3=new WebDriverWait(driver,Duration.ofSeconds(5));
			mywait3.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	}
	public String getConformationmsg() {
		try {
			return (confMSG.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
}
