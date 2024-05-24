package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginpage_RealtiveXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	   WebElement email =	driver.findElement(By.xpath("//input[@name ='email']"));
	   Thread.sleep(2000);
	email.sendKeys("Testing@gmail.com");
	   WebElement Pass = driver.findElement(By.xpath("//input[@id ='ap_password']"));
	   Thread.sleep(2000);
	Pass.sendKeys("Testing@123");
	   WebElement Submit = driver.findElement(By.xpath("//input[@type ='submit']"));
	Submit.click();
	   Thread.sleep(5000);
	driver.manage().window().minimize();

	}

}
