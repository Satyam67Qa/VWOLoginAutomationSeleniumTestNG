package com.thetestingacadmy.dataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TasksCrtcell4 {
    public static void main(String[] args) throws IOException {
        // crt cell at specifci postion
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("main");


        // to cerate cell ypu need row first

        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("satyam");


        // for wrtite
        FileOutputStream fileOutputStream = new FileOutputStream(new File("CELLSPCIFIC.xlsx"));
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
