package com.thetestingacadmy.dataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Tasks3readd {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("CTD.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0); // gien you main


        //for row
        Iterator<Row> rowIterator= sheet.iterator();
        while (rowIterator.hasNext()){
            Row row= rowIterator.next();
            //for cell
            Iterator<Cell> cellIterator  = row.cellIterator();
            while (cellIterator.hasNext()){
            Cell cell= cellIterator.next();

            if(cell.getCellType() == CellType.NUMERIC){
                System.out.println(cell.getNumericCellValue());
            }
            if(cell.getCellType() == CellType.STRING){
                System.out.println(cell.getStringCellValue());
            }
        }


    }
}}
