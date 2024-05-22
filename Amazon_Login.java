package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?ie=UTF8&openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&ie=UTF8&ignoreAuthState=1&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&fromAuthPrompt=1");
		WebElement email = driver.findElement(By.id("ap_email"));
	email.sendKeys("Testing@gmail.com");
	    Thread.sleep(2000);
	    WebElement Password =      driver.findElement(By.id("ap_password"));
	Password.sendKeys("Testing@gmail.com");
	     WebElement Sign =	driver.findElement(By.id("signInSubmit"));
	     Thread.sleep(5000);
	Sign.click();
	     driver.manage().window().minimize();
	}
}
