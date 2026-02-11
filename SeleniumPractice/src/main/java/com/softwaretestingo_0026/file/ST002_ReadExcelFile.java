package com.softwaretestingo_0026.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ST002_ReadExcelFile 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Workspace\\Automation\\SeleniumPractice\\Resources\\ReadExcelFile.xlsx");
		FileInputStream fi=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet("login");
		
		//Number Of Rows
		XSSFRow row=sheet.getRow(1);
		Cell cell=row.getCell(1); 
		
		System.out.println("Total Number Of Rows: "+row);
		System.out.println("Total Number Of Cells: "+cell);
		//System.out.println(sheet.getRow(0).getCell(0)+" "+sheet.getRow(0).getCell(1));
		System.out.println(sheet.getRow(1).getCell(0)+" "+sheet.getRow(1).getCell(1));
		System.out.println(sheet.getRow(2).getCell(0)+" "+sheet.getRow(2).getCell(1));
		wb.close();
	}
}