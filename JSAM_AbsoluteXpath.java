package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JSAM_AbsoluteXpath 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Hazarath/Downloads/learningHTML1.html");
	 WebElement  US =driver.findElement(By.xpath("(/html/body/input)[1]"));
	 Thread.sleep(2000);
	 US.sendKeys("TestEnginerr");
	 WebElement Hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
	 Thread.sleep(2000);
	 Hint.sendKeys("My Profession");
	 WebElement Pass = driver.findElement(By.xpath("(/html/body/input)[3]"));
	 Thread.sleep(2000);
	 Pass.sendKeys("Test@123");
	 Thread.sleep(2000);
	driver.manage().window().maximize();
}
}
