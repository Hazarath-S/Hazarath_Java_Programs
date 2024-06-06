package Sample_Programs;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel_Sheet_Program
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 FileInputStream f1 = new FileInputStream("C:\\Users\\Hazarath\\eclipse-workspace\\Selenium_Programs\\TestData\\shaik.xlsx");
		 Workbook w1 = WorkbookFactory.create(f1);
		 Sheet S1 = w1.getSheet("login");
		Row R1 =  S1.getRow(10);
		 Cell C1 = R1.getCell(3);
		 String S2 =  C1.getStringCellValue();
		 System.out.println(S2);

	}

}
