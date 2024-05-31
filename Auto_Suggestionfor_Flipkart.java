package Sample_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Auto_Suggestionfor_Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 WebElement Search_Tf =driver.findElement(By.name("q"));
		 Search_Tf.sendKeys("shoes");
		 Thread.sleep(2000);
		 List<WebElement> Auto_Suggestion =	 driver.findElements(By.xpath("//ul[@class ='_1sFryS _2x2Mmc _3ofZy1']/li"));
		 int count = Auto_Suggestion.size();
		 System.out.println(count);
		 Auto_Suggestion.get(5).click();
	}
}
