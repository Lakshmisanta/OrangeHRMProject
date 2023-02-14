package LoginFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC007_Dependency extends LoginPage {

@Test

public void dependencydetails() throws Exception {
	
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
		
		element=driver.findElement(By.linkText("Dependents"));
		element.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(@class,'oxd-button oxd-button')]//following::i)[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::input)[1]")).sendKeys("P.Lakshya");
		Thread.sleep(2000);
		
		WebElement element2=driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::div)[11]"));
		//element2.click();
	     obj.sendKeys(element2 , "C").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ENTER, Keys.RETURN).build().perform();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	   
		
		//driver.findElement(By.xpath("(//div[contains(@class,'oxd-grid-3 orangehrm')]//following::div)[11]")).click();
		//Thread.sleep(2000);
		
	   driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2020-02-01");
	   Thread.sleep(2000);
		
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(2000);
	   
	  
	   
	   
	   
	   
	   
	   
		
		
		
		
		
}
	
	
	
	
}
