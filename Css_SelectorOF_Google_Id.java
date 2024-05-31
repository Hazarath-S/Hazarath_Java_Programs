package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Css_SelectorOF_Google_Id 
{

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		WebElement CSS_ID = driver.findElement(By.cssSelector("#APjFqb"));
		CSS_ID.sendKeys("Industian");
		Thread.sleep(2000);
		CSS_ID.sendKeys(Keys.ENTER);
	}

}
