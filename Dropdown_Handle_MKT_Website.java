package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handle_MKT_Website 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
	WebElement Drop =	driver.findElement(By.id("Choice1"));
	// Dropdown Handling Using the selectByValue
		Select S1 = new Select(Drop);
		S1.selectByValue("Demo2");
		
		WebElement Choice2 = driver.findElement(By.id("Choice2"));
		// Dropdown Handling Using the selectByIndex
		Select S2 = new Select(Choice2);
		S2.selectByIndex(12);
		
		WebElement Choice3 = driver.findElement(By.name("Choice3 "));
		// Dropdown Handling Using the selectByValue
		Select S3 = new Select(Choice3);
		S3.selectByValue("Power15");
		
		WebElement Choice4 =	driver.findElement(By.id("Choice4"));
		// Dropdown Handling Using the selectByVisibleText
		Select S4 = new Select(Choice4);
		S4.selectByVisibleText("Energy14");
		
		WebElement Choice9 =	driver.findElement(By.id("Choice9"));
		// Dropdown Handling Using the selectByIndex
		Select S5 = new Select(Choice9);
		S5.selectByIndex(10);
		
		WebElement Choice5 =	driver.findElement(By.id("Choice10"));
		// Dropdown Handling Using the selectByIndex
		Select S6 = new Select(Choice5);
		S6.selectByVisibleText("CoreJava12");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}

}
