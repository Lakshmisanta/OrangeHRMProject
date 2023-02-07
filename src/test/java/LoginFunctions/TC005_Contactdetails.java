package LoginFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC005_Contactdetails extends LoginPage {
	
	  WebElement element;
	  
	  
	@Test
	public void contactdetails() throws Exception {
		
	
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
	
	element=driver.findElement(By.linkText("Contact Details"));
	element.click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[1]")).sendKeys("41 A");
	
	Thread.sleep(2000);
	
   driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[2]")).sendKeys("kknagar");
	
	Thread.sleep(2000);
	
  driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[3]")).sendKeys("villupuram");
	
	Thread.sleep(2000);
  driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[4]")).sendKeys("Tamil Nadu");
	
	Thread.sleep(2000);
	
  driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[5]")).sendKeys("60123");
	
	Thread.sleep(2000);
	
  driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[6]")).sendKeys("12456214");
	
	Thread.sleep(2000);
	
  driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[7]")).sendKeys("754896584");
	
	Thread.sleep(2000);
	
  driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[8]")).sendKeys("9214568974");
	
	Thread.sleep(2000);
	
 // driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[9]")).sendKeys("sanlakshmi137@gmail.com");
	
	//Thread.sleep(2000);
	
	
  driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[10]")).sendKeys("umail2mech@gmail.com");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@class='oxd-form-actions']//following::button)[1]")).click();
	
	Thread.sleep(5000);
	 /*driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[12]")).sendKeys("92144758974");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='oxd-form-actions']//following::button)[2]")).click();	
		Thread.sleep(2000);*/
	}
	
	

}
