package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lanching_Flipkart_Application 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.name("q")).sendKeys("Shoes Prices Low ");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
