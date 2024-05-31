package Sample_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atu_suggestionsof_Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ef=pd_sl_5j0bx521tf_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=11647136105620148030&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10544572015&hydadcr=5621_2359492&gad_source=1");
		driver.manage().window().maximize();
	    WebElement Search_Tf =	driver.findElement(By.id("twotabsearchtextbox"));
	    Search_Tf.sendKeys("Bating");
	    Thread.sleep(2000);
	    List<WebElement> Auto_Suggestion = driver.findElements(By.xpath("//div[@class ='two-pane-results-container']/div/div"));
	    int Count = Auto_Suggestion.size();
		System.out.println(Count-1);
		Auto_Suggestion.get(5).click();
	}
}
