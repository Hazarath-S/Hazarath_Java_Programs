package Sample_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Regrestration_Form_Grotechminds 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
	 WebElement F_Name =	driver.findElement(By.id("firstName"));
	 F_Name.sendKeys("Testing Engineer");
	 
	 WebElement L_Name =  driver.findElement(By.id("lastName"));
	 L_Name.sendKeys("Automation Testing");
	 
	 
	 WebElement Email =  driver.findElement(By.name("email"));
	 Email.sendKeys("Automationtesting@gmail.com");
	 
	 WebElement phone = driver.findElement(By.name("phone"));
	 phone.sendKeys("9842684268");
	 
	 WebElement gen = driver.findElement(By.id("gender"));
	 Select S1 = new Select(gen);
	 S1.selectByValue("male");
	 
	 WebElement State = driver.findElement(By.name("state"));
	 Select S2 = new Select(State);
	 S2.selectByVisibleText("Telangana");
	 
	 WebElement aadhar =  driver.findElement(By.id("aadhaar"));
	 aadhar.sendKeys("987426849125");
	 
	 WebElement panCard = driver.findElement(By.id("pan"));
	 panCard.sendKeys("HAGFD5452T");
	 
	 WebElement Checkbox = driver.findElement(By.id("terms"));
	 Checkbox.click();
	 
	 WebElement Submit =  driver.findElement(By.name("Submit"));
	 Submit.click();
	}

}
