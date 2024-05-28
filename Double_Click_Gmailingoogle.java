package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Gmailingoogle 
{
	public static void main(String[] args) 
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	WebElement Gmail =	driver.findElement(By.xpath("//a[@data-pid ='23']"));
		Actions A1 = new Actions(driver);
		A1.doubleClick(Gmail).perform();
		
	}

}
