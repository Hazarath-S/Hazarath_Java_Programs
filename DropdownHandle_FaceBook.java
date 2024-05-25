package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle_FaceBook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	WebElement day =	driver.findElement(By.id("day"));
	// handle the Dropdown Button Using the SelectByVisibleText
	Select S1 = new Select(day);
	S1.selectByVisibleText("8");
	Thread.sleep(2000);
	
	WebElement month =driver.findElement(By.id("month"));
	//Handle the Dropdown using the SelectByIndex
	Select S2 = new Select(month);
	S2.selectByIndex(4);
	Thread.sleep(2000);
	
	WebElement year =	driver.findElement(By.id("year"));
// Handle the Dropdown Using the SelectByValue.
	Select S3 = new Select(year);
	S3.selectByValue("2003");
	Thread.sleep(5000);
	driver.manage().window().minimize();
	}

}
