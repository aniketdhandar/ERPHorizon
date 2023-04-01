package com.erphorizon.utils;
import com.opencsv.CSVReader;

import java.io.*;

public class CsvUtil {
	private static String csvPath;

    public static void setCsvPath(String csvPath1){
        csvPath = csvPath1;
    }

    public static String get(String key){
        String value = "";
        try(FileReader fr = new FileReader(new File(csvPath));
            BufferedReader br = new BufferedReader(fr);
            CSVReader csvReader = new CSVReader(br)){
            String[] keys;
            while((keys = csvReader.readNext()) != null){
                if(keys[0].equalsIgnoreCase(key)){
                    value = keys[1];
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
    }

    public static String get(String path, String key){
        String value = "";
        try(FileReader fr = new FileReader(new File(path));
            BufferedReader br = new BufferedReader(fr);
            CSVReader csvReader = new CSVReader(br)){
            String[] keys;
            while((keys = csvReader.readNext()) != null){
                if(keys[0].equalsIgnoreCase(key)){
                    value = keys[1];
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
    }
	
	
	
}
