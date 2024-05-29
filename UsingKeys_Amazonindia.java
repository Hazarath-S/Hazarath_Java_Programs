package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingKeys_Amazonindia {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=8511775507579503574&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062131&hvtargid=kwd-10544572015&hydadcr=5621_2359492&gad_source=1");
		driver.manage().window().maximize();
	WebElement Fresh =	driver.findElement(By.linkText("Fresh"));
		Fresh.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
	}
}
