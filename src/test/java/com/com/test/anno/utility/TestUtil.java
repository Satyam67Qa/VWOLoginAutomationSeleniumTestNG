package com.com.test.anno.utility;

import com.excel.utility.Xls_Reader;

import java.util.ArrayList;

public class TestUtil {
   static Xls_Reader reader;
    public static ArrayList<Object[]> getDataFromExcel(){
        ArrayList<Object[]> myData = new ArrayList<Object[]>();

        try{
            reader =  new Xls_Reader("C:/Workspace/VWOLoginAutomationSeleniumTestNG/src/test/java/com/TestDataFacebookReg/FacebookReg.xlsx");
        } catch (Exception e)
        {
            e.printStackTrace();
        }

       int rowCount= reader.getRowCount("RegTestData");


        for (int rowNum =2; rowNum<=rowCount;rowNum++){
            String firstname= reader.getCellData("RegTestData","firstname",rowNum);
            System.out.println(firstname);
            String surname= reader.getCellData("RegTestData","surname",rowNum);
            System.out.println(surname);
            String mobileNumber= reader.getCellData("RegTestData","mobile",rowNum);
            System.out.println(mobileNumber);
            String password= reader.getCellData("RegTestData","password",rowNum);
            System.out.println(password);

            System.out.println("*************************************************");

            // used Object [] , with it we used different type of data
            Object ob[]={firstname,surname,mobileNumber,password};
            myData.add(ob);
          //  myData.add(new Object[]{firstname,surname,mobileNumber,password});

            //System.out.println(firstname);
        }
        return myData;

    }
}
