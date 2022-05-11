package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.setRegisterLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(registerPage.getPageHeader(), "Register", "Failed to navigate to Register Page");
        softAssert.assertAll();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.setRegisterLink();
        registerPage.setRegisterButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(registerPage.getFirstNameErrorMessage(), "First name is required.", "Failed to check error msg for first name");
        softAssert.assertEquals(registerPage.getLastNameErrorMessage(), "Last name is required.", "Failed to check error msg for last name");
        softAssert.assertEquals(registerPage.getEmailErrorMessage(), "Email is required.", "Failed to check error msg for Email");
        softAssert.assertEquals(registerPage.getPasswordErrorMessage(), "Password is required.", "Failed to check error msg for password");
        softAssert.assertEquals(registerPage.getRepeatPasswordErrorMessage(), "Password is required.", "Failed to check error msg for repeat password");
        softAssert.assertAll();
    }

    @Test(groups = "regression")
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.setRegisterLink();
        registerPage.setGenderFemaleRadio();
        registerPage.setFirstName("Kim");
        registerPage.setLastName("Marsh");
        registerPage.setBirthDate("10","June","1990");
        registerPage.setEmailAddress("abc@yahoo.com");
        registerPage.setPassword("Happy123");
        registerPage.setRepeatPassword("Happy123");
        registerPage.setRegisterButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(registerPage.getRegistrationVerification(), "Your registration completed", "Failed to register");
        softAssert.assertAll();
    }

}
