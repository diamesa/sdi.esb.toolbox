package sdi.webanalitic;


	import java.util.ArrayList;
import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.WebDriverWait;


@SuppressWarnings("unused")

	public class DocumentObjectHandler {
	
			public DocumentObjectHandler(WebDriver dvr) {
						// TODO Auto-generated constructor stub
						super();
							if (dvr != null) { set_driver(dvr);}
					}
			
			public List<WebElement> extract_web_element(String target_element){
				List<WebElement> payload =null;
			    if (target_element != null ) { 	payload= driver.findElements(By.tagName(target_element));} 
			    else { payload= driver.findElements(By.tagName("a"));}
													
				return payload;
			}
		
			public List<WebElement> extract_all_links(WebElement container){
				
				List<WebElement> child_list = null;
				List<WebElement> links_list = new ArrayList<WebElement>();
				
				  child_list= 	get_all_child_elements(container);		 
				  for (WebElement element : child_list) {
					  if (element.getAttribute("href") != null) {links_list.add(element);}
				}
			 
				  return links_list;
				
			}
			
			public List<WebElement> get_all_text_elements(WebElement container){
				List<WebElement> text_elements= new ArrayList<WebElement>();
				List<WebElement> child_list= null;
					child_list= get_all_child_elements(container);
					for (WebElement child : child_list) {
							if(child.getText() != null){text_elements.add(child);}
					}
				return text_elements;
			}
			public List<WebElement> get_all_child_elements(WebElement parent){
				List<WebElement> child_list= null;
				child_list= parent.findElements(By.xpath(".//*"));				
				return child_list;
			}
			
			public List<List<WebElement>> build_form_map(WebElement container){
				List<List<WebElement>> payload = new ArrayList<List<WebElement>>();
				List<WebElement> form_nodes = container.findElements(By.tagName("form"));
				if(form_nodes.isEmpty() ){
						//no hay formulario
					}
				else if(form_nodes.size() > 1){
					for (WebElement form : form_nodes) {
						List<WebElement> form_map = get_all_child_elements(form);
						payload.add(form_map);
						}
				}
				else{
					WebElement form = form_nodes.get(0);
					List<WebElement> form_map = get_all_child_elements(form);
					payload.add(form_map);
				}
				payload.add(form_nodes);
				return payload;
			}
			
		private static WebDriver driver = null;
		
		public WebDriver get_driver(){return driver;}
		public void set_driver(WebDriver dvr){ driver = dvr;}
	}
