package sdi.webanalitic;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

@SuppressWarnings("unused")
	public class WebAnalitic {
			  @Test
			  public void f() {
				  
			  }
			  @BeforeMethod
			  public void beforeMethod() {
				  driver= new FirefoxDriver();
				  do_handler = new DocumentObjectHandler(driver);
				  log_handler = new LogHandler();
				  link_validator= new LinkValidator(do_handler, log_handler);
				  
			  }
			
			  @AfterMethod
			  public void afterMethod() {
			  }
			
	
	
	  	WebDriver driver = null;
	  	DocumentObjectHandler do_handler= null;
	  	LinkValidator link_validator= null;
	  	LogHandler log_handler = null;
	  	LanguageDetector lang_detector= null;
	  }
