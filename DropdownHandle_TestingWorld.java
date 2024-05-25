package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle_TestingWorld 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.thetestingworld.com/testings/");
		driver.manage().window().maximize();
		
	WebElement e2 =	driver.findElement(By.id("Choose Gender"));
	// Handle Dropdown Using the selectByVisibleText	
     Select S1 = new Select(e2);
     S1.selectByVisibleText("Male");
   //  Thread.sleep(2000);
     
     WebElement Country =   driver.findElement(By.id("countryId"));
  // Handle Dropdown Using the selectByValue
     Select S2 = new Select(Country);
     S2.selectByValue("101");
    // Thread.sleep(2000);
     
     WebElement State =  driver.findElement(By.id("stateId"));
  // Handle Dropdown Using the selectByIndex
     Select S3 = new Select(State);
     S3.selectByIndex(36);
   //  Thread.sleep(2000);
     
     WebElement City =   driver.findElement(By.id("cityId"));
     // Handle Dropdown Using the selectByIndex
     Select S4 = new Select(City);
     S4.selectByVisibleText("Nellore");
  //   Thread.sleep(5000);
     driver.manage().window().maximize();
	}

}
