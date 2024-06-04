package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Login_FinanceApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		 WebElement Login =driver.findElement(By.id("login-dropdown")); 	 
		 Actions A1 = new Actions(driver);
		 A1.moveToElement(Login).perform();
		 
		 WebElement personal = driver.findElement(By.linkText("Personal"));
		 personal.click();
	}

}
