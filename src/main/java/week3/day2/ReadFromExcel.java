package week3.day2;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadFromExcel {

	public Object[][] readExcel(String Filename) throws IOException
	{
		//to find the excel file path
		XSSFWorkbook workbook = new XSSFWorkbook("./Data/"+Filename+".xlsx");
		//goto sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		//find row - getting the last row number to find the no of row
		int RowNum = sheet.getLastRowNum();
		//find column - getting the last cell number to find the no of cell
		short CellNum = sheet.getRow(0).getLastCellNum();
		//Read Value
		Object[][] input= new Object[RowNum][CellNum];
		for(int i=1;i<=RowNum;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<CellNum;j++)
			{
				try {
					XSSFCell cell = row.getCell(j);
					//normal read excel => String stringCellValue = cell.getStringCellValue();
					
					//data provider
					input[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					input[i-1][j]="";
				}
				//System.out.println("Cell Value:" +input );
			}
		}
		workbook.close();
		return input;
	}
	
}
