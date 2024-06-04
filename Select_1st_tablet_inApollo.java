package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Select_1st_tablet_inApollo 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		WebElement  Search_tx= 	driver.findElement(By.xpath("//input[@placeholder ='Search for... General or Pharma products']"));
		Search_tx.sendKeys("Pediasure Tablets");
		Search_tx.sendKeys(Keys.ENTER);
		
		
		
		
		

	}

}
