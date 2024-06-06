package Sample_Programs;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Excelsheet_of_AnotherWay_solution 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F1 = new FileInputStream("C:\\Users\\Hazarath\\eclipse-workspace\\Selenium_Programs\\TestData\\DummyData.xlsx");
	      Workbook W1 =	WorkbookFactory.create(F1);
	    String UserName =    W1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	      System.out.println(UserName);
	      
	    String password =   W1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	    System.out.println(password);
	    
	     String UserName_1 = W1.getSheet("login").getRow(17).getCell(1).getStringCellValue();
	     System.out.println(" Manoj User Name is :"+UserName_1);
	     
	     String Password_1 =  W1.getSheet("login").getRow(18).getCell(2).getStringCellValue();
	     System.out.println( "Password is :"+Password_1);
	     
	      String UserName3  = W1.getSheet("login").getRow(12).getCell(3).getStringCellValue();
	     System.out.println("The Manish Maid id is :"+UserName3);
	     
	    String Password_3 =  W1.getSheet("login").getRow(12).getCell(6).getStringCellValue();
	     System.out.println(Password_3);
	     
	      String UserName_4 =W1.getSheet("login").getRow(22).getCell(3).getStringCellValue();
	     System.out.println(UserName_4);
	     
	    String Password_4 =   W1.getSheet("login").getRow(22).getCell(5).getStringCellValue();
	     System.out.println(Password_4);     
	}
}
