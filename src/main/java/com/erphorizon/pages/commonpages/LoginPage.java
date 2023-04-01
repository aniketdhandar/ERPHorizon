package com.erphorizon.pages.commonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erphorizon.utils.BasePage;
import com.erphorizon.utils.PropUtil;


public class LoginPage implements BasePage{
	@FindBy (xpath="//input[@placeholder='Username']")
	WebElement emailBox;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement passbox;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement Button;
	
	
	@FindBy (xpath="")
	WebElement pageTitle;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String email) {
		waitUtils.waitUntilVisible(emailBox);
		emailBox.sendKeys(email);
	}
	public void enterPwd(String pwd) {
		waitUtils.waitUntilVisible(passbox);
		passbox.sendKeys(pwd);
	}
	public void clickSubmit() {
		waitUtils.waitUntilVisible(Button);
		Button.click();
	}
	public void signout() {
		driver.quit();
	}
	
	public DashboardPage login(String email, String pwd) {
        driver.get(PropUtil.get("testAdminUrl"));
        try {
            pageTitle.isDisplayed();
            return new DashboardPage();
        } catch (Exception e) {
            enterEmail(email);
            enterPwd(pwd);
            clickSubmit();
            return new DashboardPage();
        }
    }
	

}
