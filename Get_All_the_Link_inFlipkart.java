package Sample_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_the_Link_inFlipkart 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> Link1 =	driver.findElements(By.tagName("a"));
	 int count =	Link1.size();
	 System.out.println(count);
	 
	 for(int i=0;i<count;i++) 
	 {
		 WebElement S1 = Link1.get(i);
		 String Links = S1.getAttribute("href");
		 System.out.println(Links);
		 
	 }

	}

}
