package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop_GrotechMinds 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		 WebElement Drag = driver.findElement(By.xpath("(//div[@id ='container'])[7]"));
		 WebElement Drop =	driver.findElement(By.xpath("//div[@id ='div2']"));
		Actions A1 = new Actions(driver);
		A1.dragAndDrop(Drag, Drop).perform();
		
	//	driver.manage().window().minimize();

	}
}
