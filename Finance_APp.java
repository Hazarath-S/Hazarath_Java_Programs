package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Finance_APp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
	     WebElement LoginButt  = driver.findElement(By.className("login_button"));
	     LoginButt.click();
	   
	     WebElement UN_name = driver.findElement(By.id("username"));
	     UN_name.sendKeys("Testing Engineer");
	  
	    WebElement UN_name1 = driver.findElement(By.name("password"));
	    UN_name1.sendKeys("Testing@123");
	  
	   WebElement Captaa =  driver.findElement(By.id("loginCaptchaValue"));
	   Captaa.sendKeys("9854213");
	
	    WebElement Login = driver.findElement(By.id("Button2"));
	    Login.click();
	 
	    Thread.sleep(2000);
	    driver.manage().window().minimize();
	}
}
