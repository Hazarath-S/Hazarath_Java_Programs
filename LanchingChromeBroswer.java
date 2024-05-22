package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LanchingChromeBroswer 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
	}
}
