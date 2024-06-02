package Sample_Programs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Get_All_the_Links_Amazon 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=4658906792371551667&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10544572015&hydadcr=5621_2359492&gad_source=1");
		List<WebElement> GetLinks = driver.findElements(By.tagName("a"));
		 int count = GetLinks.size();
		 System.out.println(count);
		 
		 for(int i=0;i<count;i++)
		 {
			 WebElement S1 = GetLinks.get(i);
	String href  = S1.getAttribute("href");
	System.out.println(href);
			 
		 }

	}

}
