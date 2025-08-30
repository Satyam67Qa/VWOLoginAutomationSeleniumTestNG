package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

    public static void main(String[] args) {

        Xls_Reader reader = new Xls_Reader("C:/Workspace/VWOLoginAutomationSeleniumTestNG/src/test/java/com/TestDataFacebookReg/FacebookReg.xlsx");

      //  reader.addSheet("HomePage");
        if(!reader.isSheetExist("HomePage")){
            reader.addSheet("HomePage");
        }
           int colNum= reader.getColumnCount("RegTestData");
        System.out.println(colNum);
      // reader.getCellData("RegTestData","password","Tom");
        System.out.println( reader.getCellRowNum("RegTestData","password","Noc@123"));

    }


}
