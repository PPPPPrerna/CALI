package SpiceTest.SpiceJet;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import objects.FirstPage;

public class ClassTest {
	
	WebDriver driver;
	
	FirstPage f1 ;

	
	@Test
	public void cool() {
		
		SpTest sp = new SpTest();
		driver=sp.change();
		
		f1=sp.chn();
		f1.checkbox().click();
		
		f1.search().click();
		
		System.out.println("Prerna");
		System.out.print("development");
		
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		f1.alert();

		
	}
}
