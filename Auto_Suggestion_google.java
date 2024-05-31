package Sample_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_google {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.manage().window().maximize();
		
	WebElement Search_Tf =	driver.findElement(By.name("q"));
	    
	if (Search_Tf.isDisplayed() && Search_Tf.isEnabled())
	{
		Search_Tf.sendKeys("Karnakata");
		Thread.sleep(2000);
	}
	List<WebElement>Auto_Suggestion = driver.findElements(By.id("//div[@class ='OBMEnb']/ul/li"));
	  int  Count =  Auto_Suggestion.size();
	  System.out.println(Count);
	  Auto_Suggestion.get(4).click();
	}
}
