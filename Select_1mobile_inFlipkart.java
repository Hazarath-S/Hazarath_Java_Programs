package Sample_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_1mobile_inFlipkart
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobile+5g&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_5_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_5_na_na_na&as-pos=2&as-type=RECENT&suggestionId=mobile+5g%7CMobiles&requestId=bd88cde4-0429-4165-ab5c-e2225f0339a8&as-searchtext=mobile%205g");
		driver.manage().window().maximize();
		 WebElement Phones = driver.findElement(By.xpath("(//div[@class ='_4WELSP'])[1]"));
		 Phones.click();
	}

}
