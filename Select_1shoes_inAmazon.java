package Sample_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_1shoes_inAmazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=belts+for+men&crid=3QWVT8ODRWHR4&sprefix=belts%2Caps%2C230&ref=nb_sb_ss_ts-doa-p_1_5");
		driver.manage().window().maximize();
	    WebElement belts =	driver.findElement(By.xpath("(//a[@class ='a-link-normal s-no-outline'])[1]"));
	    belts.click();
	    
	    Set<String>  S1 =  driver.getWindowHandles();
	    System.out.println(S1);
	    driver.close();
	    
	    Iterator<String>  PC_ID =  S1.iterator();
        String Parent_ID =  PC_ID.next();
	    String Child_ID = PC_ID.next();
	    System.out.println(Parent_ID);
	    System.out.println(Child_ID);
	}
}
