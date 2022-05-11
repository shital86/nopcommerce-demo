package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(),'Desktops')]")
    WebElement desktopLink;

    @FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(),'Notebooks')]")
    WebElement noteBooksLink;

    @FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(),'Software')]")
    WebElement softwareLink;

    public String getPageHeader() {
        CustomListeners.test.log(Status.PASS, "Getting Page Header " + pageHeader);
        return getTextFromElement(pageHeader);
    }

    public void setDesktopLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Desktop Link " + desktopLink);
        clickOnElement(desktopLink);
    }

    public void setNotebooksLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on NoteBooks Link " + noteBooksLink);
        clickOnElement(noteBooksLink);
    }

    public void setSoftwareLink() {
        CustomListeners.test.log(Status.PASS, "Clicking on Software Link " + softwareLink);
        clickOnElement(softwareLink);
    }

}
