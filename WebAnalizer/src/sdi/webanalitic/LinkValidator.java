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
	public class LinkValidator {
		
			public LinkValidator(DocumentObjectHandler doh, LogHandler log) {
				// TODO Auto-generated constructor stub
				super();
				set_do_handler(doh);
				setLog_handler(log);
			}
			
			public LinkValidator(DocumentObjectHandler doh, LogHandler log, List<WebElement> target) {
				// TODO Auto-generated constructor stub
				super();
				set_do_handler(doh);
				setLog_handler(log);
				setTarget(target);
			}
			
		
			
			public void build_reference(WebElement parent){
				List<WebElement> reference = null;
				reference= do_handler.extract_all_links(parent);
				set_link_reference(reference);				
			}
			
			public void cross_analysis(){
				List<WebElement> not_expected_links;
				List<WebElement> expected_links= new ArrayList<WebElement>();
				
				List<WebElement> subjects = new ArrayList<WebElement>(getTarget());
				List<WebElement> references = new ArrayList<WebElement>(get_link_reference());
				for (WebElement subject : subjects) {
						for (WebElement reference : references) {
								if (subject.getAttribute("href").equals(reference.getAttribute("href"))) {
									if (subject.getTagName().equals(subject.getTagName())) {
										if (subject.getAttribute("class").equals(reference.getAttribute("class"))) {
												WebElement element= subject;
														expected_links.add(element);
														subjects.remove(subject);														
										}										
									}
								}							
						}					
				}
				not_expected_links= new ArrayList<WebElement>(subjects);
				//write to log content of not_expected_ links and expected_links
			}
			
			public static boolean isLinkBroken(URL url) throws Exception			 
				{ 
					//url = new URL("http://yahoo.com");
			 
					boolean response = true;		 
					HttpURLConnection connection = (HttpURLConnection) url.openConnection();		 
					try		 
						{	 connection.connect();				 
							 if(connection.getResponseCode() != 200 ){response = false;}
							 connection.disconnect();
						}		 
					catch(Exception exp)		 
						{System.err.println( exp.getMessage());}  		
					return response;
			 
				}
			
			public void validate_links() throws Exception{
				List<WebElement> broken_links;
				List<WebElement> working_links= new ArrayList<WebElement>();
				
				List<WebElement> subjects = new ArrayList<WebElement>(getTarget());
				for (WebElement subject : subjects) {
					String url = subject.getAttribute("href");
					URL link_target= new URL(url);
					if (!isLinkBroken(link_target)) {
						WebElement link = subject;
						working_links.add(link);
						subjects.remove(subject);
					}
				}
				broken_links= new ArrayList<WebElement>(subjects);
				//Write the content of both list to log
			} 
			
			private List<WebElement> link_reference = null;
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
			public List<WebElement> get_link_reference(){
				return link_reference;
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
