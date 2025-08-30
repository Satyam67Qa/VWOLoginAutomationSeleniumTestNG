package com.thetestingacadmy.dataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TasksExcel01 {
    public static void main(String[] args) throws IOException {
        // Create the excel file & Add data

        Map<String, Object> data = new TreeMap<>(); // using treemap as it is given sorted value
        data.put("1",new Object[]{"LoginId","Email","Password"});
        data.put("2",new Object[]{"1","satyam@gmail.com","123456"});
        data.put("3",new Object[]{"2","satym@live","Password@123"});

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

                // here check the condition
                if (o instanceof String) {
                    cell.setCellValue((String) o);
                }
                if (o instanceof Integer){
                    cell.setCellValue((Integer)o );
                }
            }
            
        }
        FileOutputStream fileOutputStream= new FileOutputStream(new File("CTD.xlsx"));
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
