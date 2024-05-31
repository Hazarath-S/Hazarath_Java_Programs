package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Help_ClassName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		 WebElement CS_1 =driver.findElement(By.className(".Pke_EE"));
		 CS_1.sendKeys("Watches");
		 Thread.sleep(2000);
		 CS_1.sendKeys(Keys.ENTER);
		 driver.manage().window().minimize();
	}

}
