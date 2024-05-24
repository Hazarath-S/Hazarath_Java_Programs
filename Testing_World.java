package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testing_World {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thetestingworld.com/testings/index.php");
	    WebElement username = driver.findElement(By.name("fld_username"));
  username.sendKeys("TestNG");
	    WebElement Email = driver.findElement(By.name("fld_email"));
  Email.sendKeys("Testing@gmail.com");
        WebElement Pasword =  driver.findElement(By.name("fld_password"));
  Pasword.sendKeys("Password@123");
        WebElement Con_Pass =  driver.findElement(By.name("fld_cpassword"));
  Con_Pass.sendKeys("Password@123");
        WebElement Date = driver.findElement(By.id("datepicker"));
  Date.sendKeys("04/08/20522");
        WebElement Phone = driver.findElement(By.name("phone"));
   Phone.sendKeys("9841236984");
        WebElement Address = driver.findElement(By.name("address"));
   Address.sendKeys("Hyderabad");
         WebElement Home =  driver.findElement(By.name("add_type"));
   Home.click();
         WebElement Gender =  driver.findElement(By.name("sex"));
   Gender.isSelected();
         WebElement Zip = driver.findElement(By.name("zip"));
   Zip.sendKeys("984268");
         WebElement Terms = driver.findElement(By.name("terms"));
         Thread.sleep(2000);
         Terms.click();
         Thread.sleep(5000);
         driver.manage().window().minimize();
   
   
        
        
        
	    
	
	}

}
