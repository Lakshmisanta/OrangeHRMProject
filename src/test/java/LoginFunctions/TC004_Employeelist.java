package LoginFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC004_Employeelist extends LoginPage{
    WebElement element;
	@Test
	public void employeelist() throws Exception {
		
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
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::input)[4]")).sendKeys("lakshmi");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::input)[6]")).sendKeys("24561");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::input)[7]")).sendKeys("546213");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::input)[8]")).sendKeys("2026-07-13");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::input)[9]")).sendKeys("842547");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::input)[11]")).sendKeys("1996-10-13");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::input)[13]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='oxd-form-actions']//following::button)[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space']//following::i)[1]")).click();
		Thread.sleep(5000);
		
	}
	
	
	
	
	
	
	
	
}
