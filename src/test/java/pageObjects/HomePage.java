package pageObjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{ 

	
	
		
		public HomePage(WebDriver driver) {
			super(driver);
		}
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	@FindBy(xpath="//a[contains(text(),'Login')]")

	WebElement linkLogin;
	
	public void clikMyaccount() {
		
		//lnkMyaccount.click();
	//	Actions act=new Actions(driver);
	//	act.moveToElement(lnkMyaccount).click().perform();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(lnkMyaccount)).click();
		
		//a[normalize-space()='Register']
		
	}
	
	public void clikRegister() {
	//	lnkRegister.submit();
		//Actions act=new Actions(driver);
		//act.moveToElement(lnkRegister).click().perform();
	
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
         WebDriverWait mywait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait1.until(ExpectedConditions.elementToBeClickable(lnkRegister)).click();
		//lnkRegister.sendKeys(Keys.RETURN);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", lnkRegister);
			
	}
	public void clikLogin1(){
		WebDriverWait mywait2=new WebDriverWait(driver,Duration.ofSeconds(5));
		mywait2.until(ExpectedConditions.elementToBeClickable(linkLogin)).click();
	}
	
	
	
	
	
}
