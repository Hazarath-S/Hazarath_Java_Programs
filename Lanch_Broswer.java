package Sample_Programs;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lanch_Broswer 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	    String Title= driver.getTitle();
	    System.out.println(Title);		
	}
}
