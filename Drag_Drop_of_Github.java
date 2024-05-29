package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_of_Github {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		 WebElement Drop = driver.findElement(By.xpath("(//div[@class = 'w3-container'])[2]"));
         WebElement Drag  = driver.findElement(By.id("div2"));
         
         Actions A2 = new Actions(driver);
         A2.dragAndDrop(Drop, Drag).perform();
	}

}
