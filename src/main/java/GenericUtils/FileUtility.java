package GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	
	/**
	 * this method writes data to the sheet
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	public String writeExcelData(String text) throws IOException, EncryptedDocumentException, InvalidFormatException {
	 FileInputStream file = new FileInputStream (new File("C:\\Users\\ACER\\Desktop\\nam.xlsx"));
		Workbook wb1 = WorkbookFactory.create(file);
		
		org.apache.poi.ss.usermodel.Sheet sheet = wb1.getSheet("Sheet1");
		Row row=sheet.createRow(0);
			 row.createCell(0).setCellValue(text);
			
		
		FileOutputStream fis = new FileOutputStream(new File("C:\\Users\\ACER\\Desktop\\nam.xlsx"));
		wb1.write(fis);
		fis.flush();
		wb1.close();
		return text;
}
	
	
	
public String getExcelData(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream("C:\\\\Users\\\\ACER\\\\Desktop\\\\nam.xlsx");
	Workbook workbook= WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetname);
	Row row=sheet.getRow(rownum);
	 Cell cell=row.getCell(cellnum);
	 return cell.getStringCellValue();
		}
}

