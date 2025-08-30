package com.thetestingacadmy.dataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TasksExcel02 {
    public static void main(String[] args) throws IOException {
        // Create the excel file & Add data

        Map<String, Object> data = new TreeMap<>(); // using treemap as it is given sorted value
        data.put("1", new Object[]{"LoginId", "Email", "Password"});
        data.put("2", new Object[]{"1", "satyam@gmail.com", "123456"});
        data.put("3", new Object[]{"2", "satym@live", "Password@123"});

        createExcel("CTD2.xlsx",data);

    }
      public static String createExcel(String name, Map data) throws IOException {
        Set<String> keyset= data.keySet();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Main");

        int rownum=0;
        for (String key: keyset) {
            Row r =sheet.createRow(rownum++);

            Object[] objectA = (Object[]) data.get(key);

            int cellnum=0;
            for (Object o:objectA) {
                Cell cell = r.createCell(cellnum++);
                cell.setCellValue((String) o);

            }

        }
        FileOutputStream fileOutputStream= new FileOutputStream(new File(name));
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        return name;
    }}


