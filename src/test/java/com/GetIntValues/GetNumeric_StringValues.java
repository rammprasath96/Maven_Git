package com.GetIntValues;
//Get Numeric & String Value

import java.io.File;
import java.io.IOException;
import java.text.Format;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetNumeric_StringValues
{
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		File xcl=new File
				("D:\\TESTING AND AUTOMATION\\JAVA\\ECLIPSE-MAVEN\\3.GetAllData_Excel\\SpreadSheets\\datas.xlsx");
		Workbook hello=new XSSFWorkbook(xcl);
		Sheet page2 = hello.getSheetAt(1);
		for (int i = 0; i < page2.getLastRowNum(); i++) 
		{
			Row ro = page2.getRow(i);
			for (int j = 0; j < ro.getLastCellNum(); j++)
			{
				Cell sel = ro.getCell(j);
				DataFormatter num_strg=new DataFormatter();
				String content = num_strg.formatCellValue(sel);
				System.out.print(content+"  ");
			}
			System.out.println("");
		}
		
	}
	

}
