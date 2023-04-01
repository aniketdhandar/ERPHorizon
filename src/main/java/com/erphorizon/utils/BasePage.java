package com.erphorizon.utils;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BasePage {
	WebDriver driver =GetDriver.getDriver(PropUtil.get("webDriver"), PropUtil.get("isHeadless"));
	
	WebDriverWait webDriverWait =new WebDriverWait(driver,Duration.ofSeconds(4));
	  DriverWaitUtils waitUtils = new DriverWaitUtils(webDriverWait);

}
