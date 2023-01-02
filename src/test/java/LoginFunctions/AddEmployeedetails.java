package LoginFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddEmployeedetails {

	
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

public void add_employee() throws Exception {
	
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
	
	element=driver.findElement(By.linkText("Add Employee"));
	element.click();
	Thread.sleep(5000);
	
	element =driver.findElement(By.xpath("//input[@Placeholder='First Name']"));
	element.sendKeys("Santhana");
	Thread.sleep(2000);
	
	
	element =driver.findElement(By.xpath("//input[@Placeholder='Middle Name']"));
	element.sendKeys("Lakshmi");
	Thread.sleep(2000);
	
	
	element =driver.findElement(By.xpath("//input[@Placeholder='Last Name']"));
	element.sendKeys("P");
	Thread.sleep(2000);

   // element=driver.findElement(By.xpath("//div[contains(@class,'oxd-input-group oxd-input-field')]//input[@class='oxd-input oxd-input--active']"));
     //element.sendKeys("13071996");
     //Thread.sleep(2000);

	element=driver.findElement(By.xpath("//button[@type='submit']"));
	element.click();
	Thread.sleep(2000);


    element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
    element.sendKeys("0256");
    Thread.sleep(2000);


    element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
    element.sendKeys("23148569");
    Thread.sleep(2000);

    element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
    element.sendKeys("2025-07-22");
    Thread.sleep(2000);

 
    element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input"));
    element.sendKeys("7458692135");
    Thread.sleep(2000);
    
    WebElement element2=driver.findElement(By.xpath("(//*[text()='-- Select --']//following::div)[1]"));
    element.click();
    
    Actions act = new Actions(driver);
	
	act.sendKeys(element2 , "I").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ENTER, Keys.RETURN).build().perform();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  
    WebElement marriedStatus = driver.findElement(By.xpath("(//*[text()='Marital Status']//following::i)[1]"));
	Actions ac = new Actions(driver);
	ac.sendKeys(marriedStatus , "M").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ENTER).build().perform();


    element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input"));
    element.sendKeys("1996-07-13");
    

    element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span"));
    element.click();
    Thread.sleep(2000);


    element=driver.findElement(By.xpath("//p[text()=' * Required'] //following::button[1]"));
    element.click();
    Thread.sleep(2000);


    WebElement BloodType = driver.findElement(By.xpath("(//*[starts-with(text(),'Blood Type')]//following::div)[1]"));
	Actions group = new Actions(driver);
	group.sendKeys(BloodType , "A+").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
driver.findElement(By.xpath("(//div[@class='oxd-form-actions']//following::button)[2]")).click();



}
	
}
