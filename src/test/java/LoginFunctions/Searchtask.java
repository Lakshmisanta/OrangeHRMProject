package LoginFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Searchtask extends LoginPage{
	 //WebDriver driver;
@Test
public void search_items() throws Exception {	
	
	loginfunction();
	Thread.sleep(3000);
	
	//WebElement element=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	
	//List <WebElement> options=driver.findElements(By.xpath("//ul[@class='oxd-main-menu']"));
	
	
	List <WebElement> options=driver.findElements(By.xpath("//li[@class='oxd-main-menu-item-wrapper']"));
    System.out.println(options.size());
    int count=options.size();
    for(int i=1; i<=count;i++) {
    	
    	WebElement uni_element=driver.findElement(By.xpath("//ul[@class='oxd-main-menu']"));
    	uni_element.getText();
    	
    	if(uni_element.equals(options)) {
    		
    		String gvn_text=uni_element.toString();
    		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Search']"));
    		element.sendKeys(gvn_text);
    		System.out.println(driver.getTitle());
    	    
    		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='oxd-layout-container']")).isDisplayed());
    		
    		WebElement admin=driver.findElement(By.linkText("Admin"));
    	    
    		Actions obj=new Actions(driver);
    		
    		
    		obj.click(uni_element).build().perform();
    		
    		Thread.sleep(3000);
    	}
    	
    }
	
	//element.sendKeys("admin");
	
	Thread.sleep(3000);
    
	/*System.out.println(driver.getTitle());
    
	Assert.assertTrue(driver.findElement(By.xpath("//div[@class='oxd-layout-container']")).isDisplayed());
	
	WebElement admin=driver.findElement(By.linkText("Admin"));
    
	Actions obj=new Actions(driver);
	
	
	obj.click(admin).build().perform();
	
	Thread.sleep(3000);
	
	*/
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
