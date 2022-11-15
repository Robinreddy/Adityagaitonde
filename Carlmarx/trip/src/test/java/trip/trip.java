package trip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class trip {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream  wo = new FileInputStream("D://Book1.xlsx");
		
		XSSFWorkbook work = new XSSFWorkbook(wo);
	int sheets =	work.getNumberOfSheets();
		for(int i =0;i<sheets;i++) {
			if(work.getSheetName(i).equalsIgnoreCase("Sheet1")){
				XSSFSheet w = work.getSheetAt(i);
			}
			
		}
		
		
	

	}

}
