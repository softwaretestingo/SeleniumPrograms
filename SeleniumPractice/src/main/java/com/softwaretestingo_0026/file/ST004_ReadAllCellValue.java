package com.softwaretestingo_0026.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ST004_ReadAllCellValue 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Workspace\\Automation\\SeleniumPractice\\Resources\\ReadExcelFile.xlsx");
		FileInputStream fi=new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet("login");
		
		//Top Read The Row Values
		for(int i=sheet.getFirstRowNum();i<=sheet.getLastRowNum();i++)
		{
			//To Read The Cell Values Of Each Row
			for(int j=sheet.getRow(i).getFirstCellNum();j<sheet.getRow(i).getLastCellNum();j++)
			{
				System.out.print(sheet.getRow(i).getCell(j)+"\t");
			}
			System.out.println();
		}
	}
}