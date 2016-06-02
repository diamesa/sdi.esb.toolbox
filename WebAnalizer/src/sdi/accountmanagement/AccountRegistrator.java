package sdi.accountmanagement;
	
	import java.util.regex.Pattern;
    import java.util.List;
    import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;
	import static org.testng.Assert.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	import sdi.webanalitic.*;
	
@SuppressWarnings("unused")
public class AccountRegistrator {

	public AccountRegistrator() {
		//Get WebDriver
			//Initialise driver by creating a blank instance of a FirefoxDriver
			driver = new FirefoxDriver();
			//Set default baseURL
		    baseUrl = "https://www.intel.com";
		    //Set 30 Secs as time out limit
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
	public AccountRegistrator(WebDriver dvr) {
		//Get WebDriver
			//Set driver pointing to handled driver object (Useful to work with other browser than FireFox  
			driver = dvr;
			//Set default baseURL
		    baseUrl = "https://www.intel.com";
		    //Set 30 Secs as time out limit
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
			
	//Open TargetSite	
	public void OpenTargetSite(String target){
		driver.get(target);
		
	}
	
	//Create a map of the form
	public void  BuildFormMap(String container){
		//Get Form element
							//dochandler.build_form_map(container)
		//Get all fields
		//Get all controls (Check boxes, Radios, Buttons...
	    //List Items by type
	}
	
	public void GenerateRandomData(){
		//Generate Random data for fields
	}
	
	//TextField Filler
	public void FillTxtField(String xpath, String data){}		
			
			//P
	
	//Class Members
	  private DocumentObjectHandler dochandler = null;
	  private List<List<WebElement>> form_map= null;
	  private WebElement form= null;
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
}
