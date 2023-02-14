package LoginFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteDetails {

	public static WebDriver driver;
	@BeforeMethod
	public void beforemethod() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	}

@AfterMethod
	
	public void afterclosure() {
	
	driver.close();
	
}

@Test

public void delete_details() throws Exception {
	
	WebElement element=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	element.sendKeys("Admin");
	Thread.sleep(2000);
	element=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	element.sendKeys("admin123");
	Thread.sleep(2000);
	element=driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button')]"));
	element.click();
	Thread.sleep(2000);
	
	element=driver.findElement(By.linkText("PIM"));
	element.click();
	Thread.sleep(5000);
	
	element=driver.findElement(By.linkText("Employee List"));
	element.click();
	Thread.sleep(5000);
	
	element=driver.findElement(By.xpath("(//*[@class='oxd-icon-button oxd-table-cell-action-space']//preceding::button)[6]"));
	element.click();
	Thread.sleep(5000);
	element=driver.findElement(By.xpath("//*[text()=' Yes, Delete ']"));
			element.click();
			Thread.sleep(5000);

	
	
}










}
