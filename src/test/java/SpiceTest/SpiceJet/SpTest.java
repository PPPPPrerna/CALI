package SpiceTest.SpiceJet;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objects.FirstPage;

public class SpTest {
	
	WebDriver driver;
 Logger log = LogManager.getLogger(SpTest.class.getName());
 
 FirstPage f1;
	
	@BeforeTest
	public void inilialize() throws IOException {
		
		Base b = new Base();
		
		driver=b.test();
		 f1 = new FirstPage(driver);
	}
	
	@Parameters({"URL"})
	@Test
	public void cases(String name) {
		
		
		
		driver.get(name);
		
		
		
		f1.departure().click();
		log.info("good");
		
		f1.state().click();
		
		f1.state2().click();
		
		//f1.date().click();
		
		f1.currency();
		
		
			}
	
	
	//public void second() {
		
	//f1.checkbox().click();
	
	//f1.search().click();
	
	//f1.alert();

		
		

	//}
	@Test
	
	public FirstPage chn() {
		
		return f1;
	}
	
	@Test
	
	public  WebDriver change() {
		
		
		return driver;
		
	}
	
	}
