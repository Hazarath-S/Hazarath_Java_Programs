package Sample_Programs;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_Cart_amazonProduct 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=11821326805851829562&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10544572015&hydadcr=5621_2359492&gad_source=1");
		driver.manage().window().maximize();
		
	   WebElement Search_Tf =	driver.findElement(By.id("twotabsearchtextbox"));
	   Search_Tf.sendKeys("Shoes");
	   Search_Tf.sendKeys(Keys.ENTER);
	   
	    WebElement shoe = driver.findElement(By.xpath("(//span[@class ='a-declarative'])[1]"));
	    shoe.click();
	    
	    Set<String> S1 =   driver.getWindowHandles();	
	    System.out.println(S1);
	    Iterator<String> Parent_ID = S1.iterator();
	    String P_ID =  Parent_ID.next();
	    String C_ID = Parent_ID.next();
	    System.out.println(P_ID);
	    System.out.println(C_ID);
	    
	    Thread.sleep(2000);
	    driver.switchTo().window(C_ID);
	   // driver.close();
	    
	    WebElement Wishlist = driver.findElement(By.id("wishListMainButton"));
	    Wishlist.click();
	    
	  WebElement mail =   driver.findElement(By.id("ap_email"));
	  mail.sendKeys("9550075286");
	  
	   WebElement Continue =driver.findElement(By.id("continue"));
	   Continue.click();
	   
	 WebElement password =   driver.findElement(By.cssSelector("[id='ap_password']"));
	 password.sendKeys("Hazarath@123");
	 
	 WebElement signin =  driver.findElement(By.id("signInSubmit"));
	 signin.click();
	 
	 WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
	 addtocart.click();
	 
	  WebElement buynow =driver.findElement(By.name("proceedToRetailCheckout"));
	  buynow.click();
	  
	  Thread.sleep(2000);
	  driver.manage().window().minimize();
	  
	}

}
