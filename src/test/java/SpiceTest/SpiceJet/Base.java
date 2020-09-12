package SpiceTest.SpiceJet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	Properties prop;

	WebDriver driver=null;
	public WebDriver test() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dr Pramod Pandey\\eclipse-workspace\\SpiceJet\\resources\\data.properties");
	
		prop = new Properties();
	prop.load(fis);
	
	String value=prop.getProperty("browser");
	
	if(value.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	}
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	return driver;
	
	
	
	
	}
	
}
