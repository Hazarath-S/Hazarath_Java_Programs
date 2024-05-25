package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownHandle_Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1 =	driver.findElement(By.id("searchDropdownBox"));
	// Handle Dropdown the using the SelectbyIndex//
		Select S1 = new Select(e1);
		S1.selectByIndex(10);
		
	WebElement  e2 = driver.findElement(By.id("searchDropdownBox"));
		Select S2 = new Select(e2);
		S2.selectByVisibleText("Audible Audiobooks");
		
		
		WebElement e3 =	driver.findElement(By.id("searchDropdownBox"));
		Select S3 = new Select(e3);
		S3.selectByValue("search-alias=watches");
		
	Thread.sleep(2000);
	driver.manage().window().maximize();
	}
}
