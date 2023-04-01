package com.erphorizon.webdriverutils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeUtil {
	public static WebDriver getDriver(String isHeadless){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        
      /// options.setHeadless(Boolean.parseBoolean(isHeadless));
        options.addArguments("window-size=1920,1080");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }
	
	
	

}
