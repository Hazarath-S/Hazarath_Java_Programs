package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Of_TagName_andID 
{

	public static void main(String[] args) 
	{

ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
 WebElement tag =driver.findElement(By.className("textarea#APjFqb"));
 tag.sendKeys("Dress");
 tag.click();
	}
}
