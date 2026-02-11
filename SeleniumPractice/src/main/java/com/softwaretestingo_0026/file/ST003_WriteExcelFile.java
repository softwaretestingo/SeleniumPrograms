package com.softwaretestingo_0026.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ST003_WriteExcelFile 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Workspace\\Automation\\SeleniumPractice\\Resources\\WriteExcelFile.xlsx");
		FileInputStream fis=new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("TestData");
		
		int lastRowNo=sheet.getLastRowNum();
		System.out.println(lastRowNo);
			
		//Go to The Last Cell Number
		for(int i=0;i<=lastRowNo;i++)
		{
			//Create a New Row & Write the Valuev
			sheet.createRow(lastRowNo+1).createCell(0).setCellValue("TestData152");
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
		fos.close();
	}
}