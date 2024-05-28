package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_over_Grotechminds 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
	WebElement demo1 =	driver.findElement(By.xpath("//div[@data-id ='1857001']"));
		Actions A1 = new Actions(driver);
		A1.moveToElement(demo1).perform();
		
		WebElement Pra1 =	driver.findElement(By.xpath("//div[@class ='popup4']"));
		Thread.sleep(2000);
		Pra1.click();
		
		WebElement Demo7 = driver.findElement(By.xpath("//div[@data-id ='052e213']"));
		Actions A2 = new Actions(driver);
		A2.moveToElement(Demo7);
		
		
		WebElement Pra3 =	driver.findElement(By.xpath("//div[@class ='popup9']"));
		Thread.sleep(2000);
		Pra1.click();
		
		driver.manage().window().minimize();
	}

}
