package com.erphorizon.utils;

import org.openqa.selenium.WebDriver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetDriver {
	private static WebDriver driver;
    public static WebDriver getDriver(String path, String isHeadless){
        try {
            Class<?> clazz = Class.forName(path);
            Method getMethod = clazz.getMethod("getDriver", String.class);
            driver = (WebDriver) getMethod.invoke(null,isHeadless);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
