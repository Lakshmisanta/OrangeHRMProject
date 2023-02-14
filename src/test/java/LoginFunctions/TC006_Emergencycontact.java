package LoginFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC006_Emergencycontact extends LoginPage {
	
	
@Test

public void emergency_contact() throws Exception {
	 WebElement element;
	 
	 loginfunction();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		element=driver.findElement(By.linkText("PIM"));
		element.click();
		Thread.sleep(5000);
		
		WebElement element1=driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']//a[text()='Employee List']"));
		
		Actions obj=new Actions(driver);
		
		obj.click(element1).build().perform();
		
		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space']//following::i)[1]")).click();
		Thread.sleep(2000);
		
		element=driver.findElement(By.linkText("Emergency Contacts"));
		element.click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--text']//following::i)[1]")).click();
	    Thread.sleep(5000);
	 
	    driver.findElement(By.xpath("(//div[@class='oxd-grid-3 orangehrm-full-width-grid']//following::input)[1]")).sendKeys("Praveen");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='oxd-grid-3 orangehrm-full-width-grid']//following::input)[2]")).sendKeys("spouse");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='oxd-grid-3 orangehrm-full-width-grid']//following::input)[3]")).sendKeys("04146-221309");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//div[@class='oxd-grid-3 orangehrm-full-width-grid']//following::input)[4]")).sendKeys("8547859633");
	    Thread.sleep(2000);   
	    
	    driver.findElement(By.xpath("(//div[@class='oxd-grid-3 orangehrm-full-width-grid']//following::input)[5]")).sendKeys("9654712358");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//div[contains(@class,'oxd-form-actions')]//following::button)[2]")).click();
	    Thread.sleep(2000);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	
	

}
