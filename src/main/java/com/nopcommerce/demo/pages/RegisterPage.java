package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement pageHeader;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement genderMaleRadio;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//div[@class='date-picker-wrapper']/select[1]")
    WebElement birthDay;

    @FindBy(xpath = "//div[@class='date-picker-wrapper']/select[2]")
    WebElement birthMonth;

    @FindBy(xpath = "//div[@class='date-picker-wrapper']/select[3]")
    WebElement birthYear;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailAddress;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement repeatPassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationVerification;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement repeatPasswordError;

    public String getPageHeader() {
        CustomListeners.test.log(Status.PASS, "Verifying Page Header: " + pageHeader);
        return getTextFromElement(pageHeader);
    }

    public void setGenderMaleRadio() {
        CustomListeners.test.log(Status.PASS, "Clicking on Male Gender Radio : "  + genderMaleRadio);
        clickOnElement(genderMaleRadio);
    }

    public void setGenderFemaleRadio() {
        CustomListeners.test.log(Status.PASS, "Clicking on Female Gender Radio : "  + genderFemaleRadio);
        clickOnElement(genderFemaleRadio);
    }

    public void setFirstName(String text) {
        CustomListeners.test.log(Status.PASS, "Enter FirstName  : "+text+" to " + firstName);
        sendTextToElement(firstName, text);
    }

    public void setLastName(String text) {
        CustomListeners.test.log(Status.PASS, "Enter LastName  : "+text+" to " + lastName);
        sendTextToElement(lastName, text);
    }

    public void setBirthDate(String day, String month, String year) {
        CustomListeners.test.log(Status.PASS, "Selecting BirthDate : " + day + "/" + month + "/" + year + " to " + birthDay + " " + birthMonth + " " + birthYear);
        selectByVisibleTextFromDropDown(birthDay, day);
        selectByVisibleTextFromDropDown(birthMonth, month);
        selectByVisibleTextFromDropDown(birthYear, year);
    }

    public void setEmailAddress(String text) {
        CustomListeners.test.log(Status.PASS, "Sending email " + emailAddress);
       // int random = (int) (Math.random() * 10000);

        sendTextToElement(emailAddress,"ab@yahoo.com");
    }

    public void setPassword(String text) {
        CustomListeners.test.log(Status.PASS, "Sending Password " + text + " to " + password);
        sendTextToElement(password, text);
    }

    public void setRepeatPassword(String text) {
        CustomListeners.test.log(Status.PASS, "Sending Confirm Password " + text + " to " + repeatPassword);
        sendTextToElement(repeatPassword, text);
    }

    public void setRegisterButton() {
        CustomListeners.test.log(Status.PASS, "Click On Register Button: " + registerButton);
        clickOnElement(registerButton);
    }

    public String getRegistrationVerification() {
        CustomListeners.test.log(Status.PASS, "Getting Registration confirm : " + registrationVerification);
        return getTextFromElement(registrationVerification);
    }

    public void setContinueButton() {
        CustomListeners.test.log(Status.PASS, "Clicking on continue : " + continueButton);
        clickOnElement(continueButton);
    }

    public String getFirstNameErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Getting FirstName Error : " + firstNameError);
        return getTextFromElement(firstNameError);
    }

    public String getLastNameErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Getting LastName Error : " + lastNameError);
        return getTextFromElement(lastNameError);
    }

    public String getEmailErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Getting Email Error : " + emailError);
        return getTextFromElement(emailError);
    }

    public String getPasswordErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Getting Password Error : " + passwordError);
        return getTextFromElement(passwordError);
    }

    public String getRepeatPasswordErrorMessage() {
        Reporter.log("Getting Repeat Password Error : " + repeatPasswordError.toString());
        return getTextFromElement(repeatPasswordError);
    }

}
