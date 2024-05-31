package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsSelected_IsEnabled
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Hazarath/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
	 WebElement Radio_Bt =	driver.findElement(By.id("123"));

	    boolean b1 = Radio_Bt.isSelected();
	    if(b1==true)
	    {
	    	System.out.println("It is selected");
	    }
	    else 
	    {
	    	System.out.println("It is not selected");
	    	Radio_Bt.click();
	    	System.out.println("It now has been selected now");
	    }
	}
}
