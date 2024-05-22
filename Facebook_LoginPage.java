package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook_LoginPage 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=AffVkHoCowi2Hlv-TcZJ2GfoUlO37_wSZPW1Gpo7psHwftNJHQyi7Ge_xOf3CC10dmvz6Crv84EbjuReVLiKgwSG8W_F9AooFvHks7vVlAmXMA&smuh=30223&lh=Ac_6zi2MxUzs8ZneJcE");
	    WebElement Email =	driver.findElement(By.id("email"));
	 Email.sendKeys("GroTechMinds@gmail.com");
	    WebElement Password = driver.findElement(By.id("pass"));
	 Password.sendKeys("Testing@Gmail.com");
	    WebElement Login=   driver.findElement(By.name("login"));
	 Login.click();		

	}
}
