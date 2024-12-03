package com.softwaretestingo.sto0005.advancetestng;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class STO00001_0_ConfigFile 
{
	Properties prop;
	// Path Of Properties File
	String path=System.getProperty("user.dir")+"/Resources/logininfo.properties";
	public STO00001_0_ConfigFile() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		
		//System.out.println(prop.getProperty("emailid"));
	}
	
	
	public String readValue(String key)
	{
		return prop.getProperty(key);
	}
}
