package com.GetAllData_Excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetSingleRow_Dataas 
{
	public static void getRow_1Data() throws InvalidFormatException, IOException 
	{
		File excel=new File("D:\\TESTING AND AUTOMATION\\JAVA\\ECLIPSE-MAVEN\\3.GetAllData_Excel\\SpreadSheets\\datas.xlsx");
		Workbook wbook=new XSSFWorkbook(excel);
		Sheet shtIn = wbook.getSheetAt(0);
		Row rw = shtIn.getRow(0);
		for (int i = 0; i < rw.getLastCellNum(); i++) 
		{
			Cell coloumn = rw.getCell(i);
			String values = coloumn.getStringCellValue();
			System.out.print(values+"   ");
		}
		
	}
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		getRow_1Data();
		
	}

}
