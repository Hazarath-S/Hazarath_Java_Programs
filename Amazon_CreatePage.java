package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_CreatePage 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=3600&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&language=en_IN&pageId=amzn_psr_desktop_in&ignoreAuthState=1&fromAuthPrompt=1&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&prevRID=CP1Z1NXZPSYYEVHSZETH&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        WebElement Cust_Name = driver.findElement(By.id("ap_customer_name"));
     Cust_Name.sendKeys("Automation Testing");
        WebElement Email =   driver.findElement(By.id("ap_email"));
     Email.sendKeys("Testing@gmail.com");
        WebElement Pasword =    driver.findElement(By.name("password"));
     Pasword.sendKeys("987412687412587");
        WebElement Pass_check =    driver.findElement(By.id("ap_password_check"));
     Pass_check.sendKeys("98236842");
        WebElement Cont =  driver.findElement(By.id("continue"));
        Cont.click();     
	}
}
