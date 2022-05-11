package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computerLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement electronicsLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement apparelLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement ddLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement booksLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement jewerlyrLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement gcLink;

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logo;

    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    WebElement myAccount;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;


    public void setComputerLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Computer Link : " + computerLink);
        clickOnElement(computerLink);
    }

    public void setElectronicsLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Electronics Link : " + electronicsLink);
        clickOnElement(electronicsLink);
    }

    public void setApparelLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Appareal Link : " + apparelLink);
        clickOnElement(apparelLink);
    }

    public void setDdLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Digital Download Link : " + ddLink);
        clickOnElement(ddLink);
    }

    public void setBooksLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Books Link : " + booksLink);
        clickOnElement(booksLink);
    }

    public void setJewerlyrLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Jewerly Link : " + jewerlyrLink);
        clickOnElement(jewerlyrLink);
    }

    public void setGCLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Gift Card Link : " + gcLink);
        clickOnElement(gcLink);
    }

    public void setLoginLink() {
//        CustomListeners.test.log(Status.PASS, "Clicking on login Link : " + loginLink);
        clickOnElement(loginLink);
    }

    public void setRegisterLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Register Link : " + registerLink);
        clickOnElement(registerLink);
    }

    public void setLogo() {
        CustomListeners.test.log(Status.PASS, "Clicking on Logo Link : " + logo);
        clickOnElement(logo);
    }

    public void setMyAccount() {
        CustomListeners.test.log(Status.PASS, "Clicking on MyAccount Link : " + myAccount);
        clickOnElement(myAccount);
    }

    public void setLogOutLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on logout Link : " + logOutLink);
        clickOnElement(logOutLink);
    }

}
