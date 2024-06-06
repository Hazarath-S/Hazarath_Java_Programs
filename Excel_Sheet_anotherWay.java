package Sample_Programs;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel_Sheet_anotherWay 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream F1 = new FileInputStream("C:\\Users\\Hazarath\\eclipse-workspace\\Selenium_Programs\\TestData\\shaik.xlsx");
	 Workbook W1 = WorkbookFactory.create(F1);
	 String value =  W1.getSheet("login").getRow(2).getCell(0).getStringCellValue();	
	System.out.println(value);
	
	 String password = W1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	System.out.println(password);
	
	 String AnotherUser_Name = W1.getSheet("Login").getRow(2).getCell(0).getStringCellValue();
	 System.out.println(AnotherUser_Name);
	 
	 
}
}
