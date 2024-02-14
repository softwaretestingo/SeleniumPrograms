package com.softwaretestingo.file;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadExcelFilePGM 
{
	public static final String FILE_PATH="D:\\Workspace\\Automation\\SeleniumPractice\\Resources\\ReadExcelFile.xlsx";
	public static Workbook wb;
	public static org.apache.poi.ss.usermodel.Sheet sh;
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		Object data[][]=null;
		FileInputStream fis=new FileInputStream(FILE_PATH);
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("login");
		
		data=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
			{
				data[i][j]=sh.getRow(i+1).getCell(j).toString();
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
		}
	}
}