package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSS_of_ANandAV 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=6362975843851774424&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10544572015&hydadcr=5621_2359492&gad_source=1");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(""));
	}
}
