package Sample_Programs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_the_Links
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		 int count = Links.size();
		 System.out.println(count);
		 
	for (int i =0;i<count;i++) 
	{
		WebElement W1 =Links.get(i);
		String link = W1.getAttribute("href");
		System.out.println(link);
		
	}
	}
}
