package com.excel.test.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        String myFile = "D:\\status.xlsx";
        FileInputStream fis = new FileInputStream(myFile); 
        XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); 
        XSSFSheet mySheet = myWorkBook.getSheetAt(1);
        
        
       // System.out.println(mySheet.getRow(2));
        System.out.println(mySheet.getLastRowNum());
        System.out.println(mySheet.getColumnWidth('A'));
       
        
    }
}
