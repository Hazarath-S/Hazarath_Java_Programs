package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_RelativeXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hazarath/Downloads/learningHTML1.html");
	    WebElement Us =	driver.findElement(By.xpath("//input[@name ='username']"));
	    Thread.sleep(2000);
	Us.sendKeys("Test Engineer");
	    WebElement Hint = driver.findElement(By.xpath("//input[@id ='2']"));
	    Thread.sleep(2000);
	 Hint.sendKeys("My role");
	    WebElement Pass = driver.findElement(By.xpath("//input[@id ='3']"));
	    Thread.sleep(2000);
	  Pass.sendKeys("Testing@123");
	     WebElement firstN =	  driver.findElement(By.xpath("//input[@name ='fname']"));
	  Thread.sleep(2000);
	  firstN.sendKeys("Automation Testing");
	    WebElement Submit =   driver.findElement(By.xpath("//input[@value ='Submit']"));
	    Thread.sleep(2000);
	  Submit.click();
	  WebElement Ch =  driver.findElement(By.xpath("//input[@id ='123']"));
	  Thread.sleep(2000);
	  Ch.click();
	  WebElement Ch1 =  driver.findElement(By.xpath("//input[@name ='name2']"));
	  Thread.sleep(2000);
	  Ch1.click();
	  WebElement Ch2 =  driver.findElement(By.xpath("//input[@id ='321']"));
	  Thread.sleep(2000);
	  Ch2.click();
	  WebElement Gend =   driver.findElement(By.xpath("//input[@type ='radio']"));
	  Thread.sleep(2000);
	  Gend.click();
	  WebElement Link =   driver.findElement((By.partialLinkText("know")));
	  Thread.sleep(2000);
	  Link.click();
	  WebElement sign =   driver.findElement(By.xpath("//input[@value ='Sign up']"));
	  Thread.sleep(2000);
	  sign.click();
	  Thread.sleep(2000);
	  driver.manage().window().minimize();
	}
}
