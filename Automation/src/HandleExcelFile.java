import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandleExcelFile {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
		System.out.println(data);
		
		
	}
}
