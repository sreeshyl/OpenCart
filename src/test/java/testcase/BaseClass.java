package testcase;



	import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
  
	public class BaseClass {
	

		public WebDriver driver;
        public Logger logger;
        public Properties p;
		@BeforeClass
		@Parameters({"os","browser"})
		public void setup(String os,String br) throws IOException {
			
			//loading config.properties
			
			FileReader file=new FileReader(".//src//test//resources//config.properties");
			p=new Properties();
			p.load(file);
			
			
			logger= LogManager.getLogger(this.getClass());
			
			
			//ChromeOptions options=new ChromeOptions();
			//options.addArguments("--disable-notifications");
			switch(br.toLowerCase()) 
			{
			case "chrome":driver=new ChromeDriver();break;
			
			case "edge":driver=new EdgeDriver();break;
			default:System.out.println("invalied browser");return;
			}
			
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//driver.get(p.getProperty("appUrl1"));//Reading the URL from properties file.
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			
		}
		
	
		@AfterClass
		public void tearDown() {
			driver.quit();
		}

		public String randomString() {
		String generatedString=	RandomStringUtils.randomAlphabetic(5);
		return generatedString;
		
		}
		 public String randomnumber() {
			 String generatedNumber=RandomStringUtils.randomNumeric(5);
			 return generatedNumber;
		 }
		 
		 public String randomAlphanumeric(){
			 String generatedString=	RandomStringUtils.randomAlphabetic(3);
			 String generatedNumber=RandomStringUtils.randomNumeric(2);
			 return (generatedString+generatedNumber);
		 }
	
	}
