package Datadriven;
	
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel1 {

	static XSSFSheet sheet;
	static XSSFWorkbook workbook;
	
	//constructor for calling in external class
	
	public excel1(String excelpath,String sheetname) throws Exception {
		
		workbook =new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(sheetname);
	}
	
	//To get no of rows from excel
	public static void getrowcount() throws Exception {
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("The row count :" + rowcount);

	}
	//To get string cell data from excel
	public static void getcellvalue(int row,int column) throws Exception {

		String celldata = sheet.getRow(row).getCell(column).getStringCellValue();
		System.out.println("The cell data obtained is "+ celldata);

	}
	//To get numeric cell data from excel
		public static void getcellvaluenumber(int row,int column) throws Exception {

			String path = System.getProperty("user.dir"); 
			XSSFWorkbook workbook =new XSSFWorkbook(path+"\\Excelsheets\\data1.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			double celldata = sheet.getRow(row).getCell(column).getNumericCellValue();
			System.out.println("The cell data obtained is "+ celldata);

		}

}
