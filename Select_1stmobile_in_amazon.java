package Sample_Programs;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Select_1stmobile_in_amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
         driver.manage().window().maximize();
         WebElement Search_Tf = driver.findElement(By.xpath("//input[@name ='q']"));
         Search_Tf.sendKeys("mobiles");
         Search_Tf.sendKeys(Keys.ENTER);  
        WebElement firstshoe =  driver.findElement(By.className("_4WELSP"));
        firstshoe.click();
        Thread.sleep(2000);  
        Set<String> S1 =    driver.getWindowHandles();
        System.out.println(S1);
        Thread.sleep(2000);
        driver.close(); 
        Iterator<String> Parent_IDs =  S1.iterator();
        String Parent_ID = Parent_IDs.next();
         String Child_ID = Parent_IDs.next();  
         System.out.println(Parent_ID);
         System.out.println(Child_ID); 
   
         driver.manage().window().minimize();
	}
}
