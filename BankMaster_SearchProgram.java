package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankMaster_SearchProgram 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankmaster.in/");
	    String Title	= driver.getTitle();
	    System.out.println(Title);
		driver.findElement(By.name("fullName")).sendKeys("Test Engineer");
		driver.findElement(By.name("fullName")).click();
		

	}

}
