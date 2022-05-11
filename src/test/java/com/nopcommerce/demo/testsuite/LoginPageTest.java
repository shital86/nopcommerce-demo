package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.setLoginLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getPageHeader(), "Welcome, Please Sign In!", "Failed to navigate to Login Page");
        softAssert.assertAll();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.setLoginLink();
        loginPage.setEmailField("@yabahoo.com");
        loginPage.setPassword("Happy123");
        loginPage.setLoginButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found", "Failed to navigate to Login Page");
        softAssert.assertAll();
    }

    @Test(groups = "regression")
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.setLoginLink();
        loginPage.setEmailField("ab@yahoo.com");
        loginPage.setPassword("Happy1234");
        loginPage.setLoginButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getLogOutButtonText(), "Log out", "Failed to Login");
        softAssert.assertAll();
    }

    @Test(groups = "regression")
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        homePage.setLoginLink();
        loginPage.setEmailField("ab@yahoo.com");
        loginPage.setPassword("Happy123");
        loginPage.setLoginButton();
        loginPage.setLogOutButton();
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(2000);
        softAssert.assertEquals(loginPage.getLoginButtonText(), "Log in", "Failed to LogOut");
        softAssert.assertAll();
    }
}
