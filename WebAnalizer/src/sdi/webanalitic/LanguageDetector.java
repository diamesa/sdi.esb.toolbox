package sdi.webanalitic;
	
	import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.ArrayList;
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.WebDriverWait;
	

@SuppressWarnings("unused")
	public class LanguageDetector {
	
		public LanguageDetector() {
			// TODO Auto-generated constructor stub
		}
	
		public void build_english_reference(WebElement container){
			List<String> english_words= null;
			
			List<WebElement> text_elements = do_handler.get_all_text_elements(container);
		}
		public String[] word_extractor(String sentence){
			String[]  words= sentence.split(" ");
			for (String string : words) {
				
			}
			return words;
		}

		private List<String> english_reference = null;
		private List<String> language_reference= null;
		private DocumentObjectHandler do_handler = null;
		private List<WebElement> target = null;
		private LogHandler log_handler = null; 
		
		
		public List<WebElement> getTarget() {
			return target;
		}
		public void setTarget(List<WebElement> target) {
			this.target = target;
		}
		public  boolean set_link_reference(List<WebElement> reference){
			return false;
		}
		public List<String> get_eng_reference(){
			return english_reference;
		}			
		public void set_do_handler(DocumentObjectHandler doh){
						do_handler = doh;	
		}
		public DocumentObjectHandler get_do_handler(){
			return do_handler;
		}
		public LogHandler getLog_handler() {
			return log_handler;
		}

		public void setLog_handler(LogHandler log_handler) {
			this.log_handler = log_handler;
		}

	}
