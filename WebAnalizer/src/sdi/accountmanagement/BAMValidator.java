package sdi.accountmanagement;

	
	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;
	import static org.testng.Assert.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;


@SuppressWarnings("unused")
public class BAMValidator {
	
	public BAMValidator(){
		super();
	}

	
	
	 @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://erpm.intel.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	 
	 @Test
	 public void ValidateBussinesAccount(){
		//Go to ERPM
		 driver.get(baseUrl + "/EOT");
	    //After redirect on Sign In use SSO service 
		 driver.findElement(By.id("autoSiginLink")).click();
		//Wait for eRPM page to load
		 (new  WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>(){
			 public Boolean apply(WebDriver d){
				 return d.getCurrentUrl().contains("https://erpm.intel.com/EOT"); }});
		 //Find and click "BusinessAccount" link
		  driver.findElement(By.id("BusinessAccount")).click();	
		 //Find and click "SearchBusinessAccountMenu"
		  driver.findElement(By.id("searchBusinessAccountMenu")).click();
		    new Select(driver.findElement(By.id("ddlSearchCriteria1"))).selectByVisibleText("Account No.");
		  
	 }
	 
	 

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }


	
	
	
	
	
	
	
	
	
	
	

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }


	  
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  
}

