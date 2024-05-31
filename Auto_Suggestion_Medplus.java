package Sample_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Medplus {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
	WebElement Search_Tf =	driver.findElement(By.id("(//input[@type ='text'])[1]"));
	   Search_Tf.sendKeys("Tablets");
	   Thread.sleep(2000);
	
	   List<WebElement> Auto_Sugesstion = driver.findElements(By.xpath("//div[@id ='ProductSearch']/div/a"));
	  int count =  Auto_Sugesstion.size();
	  System.out.println(count);
	  Auto_Sugesstion.get(2).click();
	}

}
