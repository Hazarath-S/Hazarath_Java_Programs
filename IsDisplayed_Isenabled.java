package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsDisplayed_Isenabled
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		 WebElement Search_tf =driver.findElement(By.name("q"));
		
		if( Search_tf.isDisplayed() && Search_tf.isEnabled())
				{
			        Search_tf.sendKeys("India");
		         }
	}
}
