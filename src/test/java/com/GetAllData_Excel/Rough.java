package com.GetAllData_Excel;
//Just Try
//Output crt but Wrong method
//it will runs in for Nested Loop
//to get all data
import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rough 
{
	public static void getRow_1Data() throws InvalidFormatException, IOException 
	{
		File excel=new File("D:\\TESTING AND AUTOMATION\\JAVA\\ECLIPSE-MAVEN\\3.GetAllData_Excel\\SpreadSheets\\datas.xlsx");
		Workbook wbook=new XSSFWorkbook(excel);
		Sheet shtIn = wbook.getSheetAt(0);
		Row rw1 = shtIn.getRow(0);
		for (int i = 0; i < rw1.getLastCellNum(); i++) 
		{
			Cell coloumn = rw1.getCell(i);
			String values = coloumn.getStringCellValue();
			System.out.print("   " +values);
		}
		System.out.println("");
		Row rw2=shtIn.getRow(1);
		for(int i=0; i < rw2.getLastCellNum();i++)
		{
			Cell cloumn2 = rw2.getCell(i);
			String value2 = cloumn2.getStringCellValue();
			System.out.print("   " +value2);
		}
		System.out.println("");
		Row rw3=shtIn.getRow(2);
		for(int i=0; i < rw3.getLastCellNum();i++)
		{
			Cell cloumn3 = rw3.getCell(i);
			String value3 = cloumn3.getStringCellValue();
			System.out.print("   " +value3);
		}
		System.out.println("");
		Row rw4=shtIn.getRow(3);
		for(int i=0; i < rw4.getLastCellNum();i++)
		{
			Cell cloumn4 = rw4.getCell(i);
			String value4 = cloumn4.getStringCellValue();
			System.out.print("   " +value4);
		}
		Row rw5=shtIn.getRow(4);
		System.out.println("");
		for(int i=0; i < rw5.getLastCellNum();i++)
		{
			Cell cloumn5 = rw5.getCell(i);
			String value5 = cloumn5.getStringCellValue();
			System.out.print("   " +value5);
		}
		
		
		
	}
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		getRow_1Data();
		
	}

}
