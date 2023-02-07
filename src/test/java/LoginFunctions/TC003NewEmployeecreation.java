package LoginFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC003NewEmployeecreation extends LoginPage{
	WebElement element;
	@Test
	public void new_Employee() throws Exception {
		
		loginfunction();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		element=driver.findElement(By.linkText("PIM"));
		element.click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(5000);
	
		element =driver.findElement(By.xpath("//input[@Placeholder='First Name']"));
		element.sendKeys("Santhana Lakshmi");
		Thread.sleep(2000);
		
		
		element =driver.findElement(By.xpath("//input[@Placeholder='Middle Name']"));
		element.sendKeys("");
		Thread.sleep(2000);
		
		
		element =driver.findElement(By.xpath("//input[@Placeholder='Last Name']"));
		element.sendKeys("P");
		Thread.sleep(2000);
	
	    driver.findElement(By.xpath("//span[contains(@class,'oxd-switch-input oxd-switch')]")).click();
	
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[6]")).sendKeys("Lakshya0120");
	    Thread.sleep(5000);
	  driver.findElement(By.xpath("(//div[@class='oxd-radio-wrapper']//following::span)[1]")).click();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("(//div[contains(@class,'oxd-input-group oxd-input')]//following::input)[10]")).sendKeys("PraveenNightman@123");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("(//div[contains(@class,'oxd-input-group oxd-input')]//following::input)[11]")).sendKeys("PraveenNightman@123");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Thread.sleep(2000);
	
	}
















}
