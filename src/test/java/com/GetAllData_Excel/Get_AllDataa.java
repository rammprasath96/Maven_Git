package com.GetAllData_Excel;
//Only Get A String Value

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_AllDataa 
{
	public static void getRow_1Data() throws InvalidFormatException, IOException 
	{
		File excel=new File("D:\\TESTING AND AUTOMATION\\JAVA\\ECLIPSE-MAVEN\\3.GetAllData_Excel\\SpreadSheets\\datas.xlsx");
		Workbook wbook=new XSSFWorkbook(excel);
		Sheet shtIn = wbook.getSheetAt(0);
		for (int i = 0; i < shtIn.getLastRowNum(); i++)
		{
			Row rw1 = shtIn.getRow(i);
			for (int j = 0; j < rw1.getLastCellNum(); j++) 
			{
				Cell coloumn = rw1.getCell(j);
				String values = coloumn.getStringCellValue();
				System.out.print(values+"   ");
			}
			System.out.println("");
		}	
	}
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		getRow_1Data();
		
	}

}
