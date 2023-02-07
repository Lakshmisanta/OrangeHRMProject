package LoginFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC002_Validatedropdown extends LoginPage {
	
	
	@Test
	public void validate_dropdown() throws Exception
	{
		loginfunction();
		
		WebElement admin=driver.findElement(By.linkText("Admin"));
	    
		Actions obj=new Actions(driver);
		
		
		obj.click(admin).build().perform();
		
		Thread.sleep(3000);

	WebElement Usermange=driver.findElement(By.xpath("(//nav[@class='oxd-topbar-body-nav'])//following::li[1]//span[text()='User Management ']"));
	obj.click(Usermange).build().perform();
	Thread.sleep(3000);
		
	driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//input[@class='oxd-input oxd-input--active']")).sendKeys("Santa");
	
	Thread.sleep(3000);
	WebElement dropdown=driver.findElement(By.xpath("(//div[text()='-- Select --']//following::i)[1]"));
	
	obj.click(dropdown).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Usrname is checked");
	
	Thread.sleep(3000);
WebElement statusdropdown=driver.findElement(By.xpath("(//div[text()='-- Select --']//following::i)[2]"));
	
	obj.click(statusdropdown).build().perform();
	Thread.sleep(3000);
	
	}
	
	
	
	
	
	
	

}
