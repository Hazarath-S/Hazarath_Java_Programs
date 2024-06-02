package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_of_TagAndClassName {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/search-medicines/Cerave");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("div.MedicineAutoSearch_handleInputSection__AeCuu"));
		search.sendKeys("My Code");
		search.click();
	}

}
