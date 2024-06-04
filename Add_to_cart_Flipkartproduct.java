package Sample_Programs;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Add_to_cart_Flipkartproduct 
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		  WebElement Search_TX = driver.findElement(By.name("q"));
		  Search_TX.sendKeys("shoes");
		  Search_TX.sendKeys(Keys.ENTER);
		  
		   WebElement shoe =driver.findElement(By.xpath("(//div[@class ='gqcSqV YGE0gZ'])[1]"));
		   shoe.click();
		   
		   Set<String> S1 =  driver.getWindowHandles();
		   Iterator<String> PIDs =  S1.iterator();
		   String Parent_ID =  PIDs.next();
		   String Child_Id = PIDs.next();
		   System.out.println(Child_Id);
		   System.out.println(Parent_ID);
		   
		   driver.switchTo().window(Child_Id);
		      
		  WebElement Addtocart =  driver.findElement(By.xpath("(//li[@class ='col col-6-12'])[1]"));
		  Addtocart.click();
		  
		 WebElement Placeorder =  driver.findElement(By.className("QqFHMw zA2EfJ _7Pd1Fp"));
		 Placeorder.click();
	 }

}
