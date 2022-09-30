package cloudtesla.crm.GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cloudtesla.crm.GenericLibrary.ExcelFileUtility;
import cloudtesla.crm.GenericLibrary.PropertyFileUtility;
import cloudtesla.crm.GenericLibrary.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//creating object of webdriver utility methods
	public PropertyFileUtility plib=new PropertyFileUtility();
	public ExcelFileUtility elib=new ExcelFileUtility();
	public WebDriverUtility wlib=new WebDriverUtility();
	public WebDriver driver=null;
	public static WebDriver sdriver;
	@BeforeClass
	public void launchBrowser() throws Throwable {
		//read data from property file
	    String BROWSER = plib.readDataFromPropertyFile("browser");
		String URL = plib.readDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("invalid browser");
		}
		sdriver=driver;
		wlib.maximizeWindow(driver);
		wlib.waitForPageLoad(driver);
		driver.get(URL);
		Reporter.log("launching browser successful=====",true);
		}
	@BeforeClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("====== close browser successfull",true);
	}
	 
}
