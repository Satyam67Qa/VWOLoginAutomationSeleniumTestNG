package com.datadriven.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProReder {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String filename = System.getProperty("user.dir")+ "/data.properties";
        properties.load(new FileInputStream(filename));
        String urL = properties.getProperty("url");
        System.out.println(urL);
    }
}
