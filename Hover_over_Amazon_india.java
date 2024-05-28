package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_over_Amazon_india {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement Signin =	driver.findElement(By.xpath("(//span[@id ='nav-link-accountList-nav-line-1'])"));	
		Actions A1 = new Actions(driver);
		A1.moveToElement(Signin).perform();
		
		WebElement Sign =	driver.findElement(By.xpath("//span[@class ='nav-action-inner']"));
		Sign.click();
		
		WebElement mail =	driver.findElement(By.xpath("//input[@id ='ap_email']"));
		mail.sendKeys("Testing@gmail.com");
		
		WebElement Continue =	driver.findElement(By.xpath("//input[@id ='continue']"));
		Continue.click();
		
		WebElement password =	driver.findElement(By.xpath("//input[@autocomplete ='current-password']"));
		password.sendKeys("984268741268");
		
		WebElement sign = 	driver.findElement(By.xpath("//input[@class ='a-button-input']"));
		sign.click();
		
		Thread.sleep(5000);
		driver.manage().window().minimize();
	}
}
