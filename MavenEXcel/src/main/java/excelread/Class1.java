package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class1 {

	static FileInputStream f; //class in java to read details from file
	static XSSFWorkbook wb; //class to read details from workbook
	static XSSFSheet sh; //class to read details from excel sheet
	
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\anjana_class\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");//used to get details from sheet
		XSSFRow r =sh.getRow(a);//get data from row
		XSSFCell c = r.getCell(b);//get data from cell
		return c.getStringCellValue();
		
	}
	public static String getIntData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\anjana_class\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int m=(int)c.getNumericCellValue();//float is used for type casting-double to float
		return String.valueOf(m);//type conversion
		
		
	} 
	public static String getFloatData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\anjana_class\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float m=(float)c.getNumericCellValue();
		return String.valueOf(m);
		
	} 
	
}
