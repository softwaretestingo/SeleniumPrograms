package com.softwaretestingo.file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class TextFileRead 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		File file=new File("D:\\Workspace\\Automation\\SeleniumPractice\\Resources\\sampletxt.txt");
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		String x=br.readLine();
		
		while(x!=null)
		{
			System.out.println(x);
			x=br.readLine();
			Thread.sleep(3000);
		}
	}
}