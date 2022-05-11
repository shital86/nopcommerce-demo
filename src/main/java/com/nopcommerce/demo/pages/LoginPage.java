package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath = "//li/a[contains(text(),'Log in')]")
    WebElement loginButtonTopMenu;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement pageHeader;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;

    public void setEmailField(String text) {
        CustomListeners.test.log(Status.PASS, "Enter Email Address: " + emailField);
        sendTextToElement(emailField, text);
    }

    public void setPassword(String text) {
        CustomListeners.test.log(Status.PASS, "Enter password: " + password);
        sendTextToElement(password, text);
    }

    public void setLoginButton() {
        CustomListeners.test.log(Status.PASS, "click on login button: " + loginButton);
        clickOnElement(loginButton);
    }

    public String getLoginButtonText() {
        CustomListeners.test.log(Status.PASS, "Verifying Login Button Text: " + loginButtonTopMenu);
        return getTextFromElement(loginButtonTopMenu);
    }

    public String getPageHeader() {
        CustomListeners.test.log(Status.PASS, "Verifying Page Header: " + pageHeader);
        return getTextFromElement(pageHeader);
    }

    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Error Message: " + errorMessage);
        return getTextFromElement(errorMessage);
    }

    public String getLogOutButtonText() {
        CustomListeners.test.log(Status.PASS, "Verifying Log Out Button Text: " + logOutButton);
        return getTextFromElement(logOutButton);
    }

    public void setLogOutButton() {
        CustomListeners.test.log(Status.PASS, "Click On LogOut Button: " + logOutButton);
        clickOnElement(logOutButton);
    }
}
