package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FileUpload_Popup_Grotechminds
{
	public static void main(String[] args) throws InterruptedException 
	{	
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://grotechminds.com/registration/");
	 driver.manage().window().maximize();
	 WebElement F_Name = driver.findElement(By.id("fname"));
	 F_Name.sendKeys("Hazarath Shaik");
	 
	 WebElement L_Name =  driver.findElement(By.name("lname"));
	 L_Name.sendKeys("Testing Engineer");
	 
	 WebElement Email =  driver.findElement(By.xpath("//input[@class ='email form-control ']"));
	 Email.sendKeys("Testing@gmail.com");
	 
	 WebElement Password=  driver.findElement(By.id("password"));
	 Password.sendKeys("Testing@123");
	 
	 WebElement Gender =  driver.findElement(By.id("male"));
	 Gender.click();
	 
	  WebElement Skills = driver.findElement(By.id("Skills"));
	  Select S1 = new Select(Skills);
	  S1.selectByVisibleText("Technical Skills");
	  
	 WebElement Country =   driver.findElement(By.id("Country"));
	 Select S2 = new Select(Country);
	 S2.selectByValue("India");
	 
	 WebElement P_Address =  driver.findElement(By.xpath("//textarea[@id ='Present-Address']"));
	 P_Address.sendKeys("Yellareddy Guda, Near Ammerpet Hyderabad");
	 
	 WebElement Permenant_Address = driver.findElement(By.xpath("//textarea[@id ='Permanent-Address']"));
	 Permenant_Address.sendKeys("Andhra Pradesh, Nellore District, Sangam Mandal");
	 
	 WebElement PinC =  driver.findElement(By.name("Pincode"));
	 PinC.sendKeys("524306");
	 
	 WebElement relgion = driver.findElement(By.id("Relegion"));
	 Select S3 = new Select(relgion);
	 S3.selectByIndex(6);
	 
	 WebElement file =  driver.findElement(By.id("file"));
	 file.sendKeys("C:\\Users\\Hazarath\\Downloads\\Badge.pdf");
	 
	  WebElement relocate = driver.findElement(By.id("relocate"));
	  relocate.click();
	  
	 WebElement submit = driver.findElement(By.name("Submit"));
	 submit.click();
	 
	 	  Thread.sleep(2000);
	 	  driver.manage().window().minimize();
	 	//  driver.switchTo().alert().accept();
	}
}
