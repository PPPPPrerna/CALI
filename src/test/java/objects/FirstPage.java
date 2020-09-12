package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FirstPage {
	
	WebDriver driver;

	
	public FirstPage(WebDriver driver){
	
		this.driver=driver;
		
	}
	
	public WebElement departure() {
		
		return driver.findElement(By.xpath("//span[@class='red-arrow-btn']"));
	}
	
	public WebElement state() {
		
		return driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']"));
		
	}
	
	public WebElement  state2() {
		
	return	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']"));
		
	}
	
	public WebElement date() {
		return driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[3]"));
	}
	
	public void currency() {
		
		
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")));
		
		s1.selectByIndex(3);
		
		
		
		
	}
	
	public WebElement checkbox() {
		return driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
	}
	
	public WebElement search() {
		
		return driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']"));
	}
	
	public void alert() {
		
		driver.switchTo().alert().accept();
	}
	
	
}
