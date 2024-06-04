package Sample_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naurki {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=16201&err=1");
		driver.manage().window().maximize();
		
		 WebElement google = driver.findElement(By.xpath("//span[.='Google']"));
		 google.click();
		 
		 Set<String> Id =	 driver.getWindowHandles();
		 System.out.println(Id);
		 Iterator<String> Parent_IDs =	 Id.iterator();
		 String Parent_ID1 =  Parent_IDs.next();
		 String Child_ID1 =   Parent_IDs.next();
		 
		 driver.switchTo().window(Child_ID1);
		 driver.close();
	}

}
