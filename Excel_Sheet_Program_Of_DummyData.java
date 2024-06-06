package Sample_Programs;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel_Sheet_Program_Of_DummyData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F1 = new FileInputStream("C:\\Users\\Hazarath\\eclipse-workspace\\Selenium_Programs\\TestData\\DummyData.xlsx");
		 Workbook W1 = WorkbookFactory.create(F1);
		 Sheet S1 =  W1.getSheet("login");
		 Row R1 =  S1.getRow(17);
		 Cell C1 =  R1.getCell(1);
		 String LoginValue =  C1.getStringCellValue();
		 System.out.println(LoginValue);
	}

}
