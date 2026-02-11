package com.softwaretestingo_0024.robotclass;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ST002_TakeScreenShot 
{
	public static void main(String[] args) throws AWTException, IOException 
	{
		Robot r=new Robot();
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(screenSize);
		File path = new File("D:\\Workspace\\Automation\\SeleniumPractice\\Screenshot\\sc.png");
		
		BufferedImage image=r.createScreenCapture(rect);
		ImageIO.write(image, "png", path);
	}
}