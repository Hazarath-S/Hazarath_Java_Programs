package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BankMaster_CareerPage 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bm-landing-page-ivory.vercel.app/careers/20035566");
	    WebElement FirstName = driver.findElement(By.id("firstName"));
	 FirstName.sendKeys("Testing Engineer");
	    WebElement Lastname = driver.findElement(By.id("lastName"));
	 Lastname.sendKeys("Tosca Test Engineer");
	    WebElement Email = driver.findElement(By.id("email"));
	 Email.sendKeys("Test@gmail.com");
	    WebElement Contact =  driver.findElement(By.id("contact"));
	 Contact.sendKeys("9878426874");
	     WebElement Grat = driver.findElement(By.id("graduationYear"));
	 Grat.sendKeys("20212");
	     WebElement Exp = driver.findElement(By.id("experience"));
	  Exp.sendKeys("10.254");
	     WebElement ExeCTC =   driver.findElement(By.id("expectedCTC"));
	  ExeCTC.sendKeys("3025210");
	     WebElement CTC=  driver.findElement(By.id("currentCTC"));
	  CTC.sendKeys("68741268");
	     WebElement CL =  driver.findElement(By.id("currentLocation"));
	  CL.sendKeys("Hyderabad");
	    WebElement HDYF =  driver.findElement(By.id("howDidYouFind"));
	  HDYF.sendKeys("Dummy");
	     WebElement Current =  driver.findElement(By.id("currentEmployer"));
	  Current.sendKeys("Nothing");
	     WebElement NP =  driver.findElement(By.id("noticePeriod"));
	  NP.sendKeys("1500");
	  WebElement Submit =  driver.findElement(By.partialLinkText("Application"));
	  Thread.sleep(2000);
	  Submit.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  driver.manage().window().minimize();
	}
} 

