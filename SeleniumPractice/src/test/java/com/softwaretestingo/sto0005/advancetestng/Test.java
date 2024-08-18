package com.softwaretestingo.sto0005.advancetestng;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		STO00001_0_ConfigFile getValue=new STO00001_0_ConfigFile();
		System.out.println(getValue.readValue("url"));
	}

}
