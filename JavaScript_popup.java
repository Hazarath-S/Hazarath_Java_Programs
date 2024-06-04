package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_popup 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		
		driver.switchTo().alert().accept();
		
	 WebElement Click =	driver.findElement(By.className("btnjs"));
	 Click.click();
	}

}
