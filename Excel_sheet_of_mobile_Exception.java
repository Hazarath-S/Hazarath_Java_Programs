package Sample_Programs;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel_sheet_of_mobile_Exception {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F1 = new FileInputStream("E:\\Users\\Hazarath\\eclipse-workspace\\Selenium_Programs\\TestData\\shaik.xlsx");
          Workbook W1 = WorkbookFactory.create(F1);
         Sheet S1 =   W1.getSheet("login");
        Row R1 =   S1.getRow(6);
      Cell C1 =   R1.getCell(1);
      String Password =  C1.getStringCellValue();
      System.out.println(Password);
	}

}
