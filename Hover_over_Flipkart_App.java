package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_over_Flipkart_App
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	WebElement Fashion = driver.findElement(By.xpath("//div[@style ='top: 75.2px; left: 396.138px; height: 126px; width: 122px;']"));
		Actions A1 = new Actions(driver);
		A1.moveToElement(Fashion).perform();
		
		WebElement Mens = driver.findElement(By.xpath("//a[@class ='_3490ry'][2]"));
		Mens.click();
		
	}

}
