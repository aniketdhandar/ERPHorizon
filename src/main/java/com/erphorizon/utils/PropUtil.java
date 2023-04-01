package com.erphorizon.utils;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropUtil {
	
	private final static Properties prop = new Properties();
    private final static String curDir = System.getProperty("user.dir");

    static {
        try {
            FileReader is = new FileReader(curDir+"/src/main/resources/config.properties");
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }

}
