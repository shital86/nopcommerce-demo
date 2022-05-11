package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.setComputerLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(computerPage.getPageHeader(), "Computers", "Failed to navigate to Computer Page");
        softAssert.assertAll();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.setComputerLink();
        computerPage.setDesktopLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(desktopPage.getPageHeader(), "Desktops", "Failed to navigate to Desktop Page");
        softAssert.assertAll();
    }
    @Test(groups = "regression",dataProvider = "DesktopConfig",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software)  {
        homePage.setComputerLink();
        computerPage.setDesktopLink();
        desktopPage.setBuildYourComputer();
        buildYourOwnComputerPage.setSelectProcessor(processor);
        buildYourOwnComputerPage.setSelectRam(ram);
        buildYourOwnComputerPage.setSelectHDD(hdd);
        buildYourOwnComputerPage.setSelectOS(os);
        buildYourOwnComputerPage.setSoftware(software);
        buildYourOwnComputerPage.setClickOnAddToCartButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(buildYourOwnComputerPage.getInfoFromGreenBar(), "The product has been added to your shopping cart", "Failed to add item");
        softAssert.assertAll();
    }

}
