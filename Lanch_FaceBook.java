package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lanch_FaceBook 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement  FirstName = driver.findElement(By.name("firstname"));	
	FirstName.sendKeys("Testing");
	    WebElement Surname =  driver.findElement(By.name("lastname"));
    Surname.sendKeys("Automation");
        WebElement Mobi = driver.findElement(By.name("reg_email__"));
    Mobi.sendKeys("9877423698523695");
        WebElement Password = driver.findElement(By.id("password_step_input"));
    Password.sendKeys("Testing@123");
        WebElement Sub =  driver.findElement(By.name("websubmit"));
     Sub.sendKeys(Keys.ENTER);
	}
}
