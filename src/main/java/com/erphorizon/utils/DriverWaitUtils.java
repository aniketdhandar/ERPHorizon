package com.erphorizon.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWaitUtils {
	 private WebDriverWait webDriverWait;

	    public DriverWaitUtils(WebDriverWait webDriverWait){
	        this.webDriverWait = webDriverWait;
	    }


	    public void waitUntilVisible(WebElement element){
	        webDriverWait.until(ExpectedConditions.visibilityOf(element));
	    }

	    public void waitUntilClickable(WebElement element){
	        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
	    }

	    public void waitUntilStale(WebElement element){
	        webDriverWait.until(ExpectedConditions.stalenessOf(element));
	    }

	    public void waitUntilPresence(By locator){
	        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }
	
	
	
}
