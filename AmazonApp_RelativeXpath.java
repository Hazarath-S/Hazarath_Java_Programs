package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApp_RelativeXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=shoes&crid=2XPI8EJZWX7XP&sprefix=shoes%2Caps%2C212&ref=nb_sb_ss_ts-doa-p_2_5");
	    WebElement Shoe = driver.findElement(By.xpath("//input[@value ='shoes']"));
	    Thread.sleep(2000);
	    Shoe.sendKeys(Keys.ENTER);
	    driver.manage().window().minimize();  
	}
}
