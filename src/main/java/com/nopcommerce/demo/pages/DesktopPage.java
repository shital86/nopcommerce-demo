package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement pageHeader;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement productOrderBy;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement productDisplayBy;
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourComputer;

    public String getPageHeader() {
        CustomListeners.test.log(Status.PASS, "Getting Page Header : " + pageHeader);
        return getTextFromElement(pageHeader);
    }

    public void setProductOrderBy(String text) {
        CustomListeners.test.log(Status.PASS, "Clicking on Product Order by : "+text+ "to " +productOrderBy);
        selectByVisibleTextFromDropDown(productOrderBy, text);
    }

    public void setProductDisplayBy(String text) {
        CustomListeners.test.log(Status.PASS, "Clicking on Product Display by : "+text+ "to " +productDisplayBy);
        selectByVisibleTextFromDropDown(productDisplayBy, text);
    }

    public void setListView(String text) {
        CustomListeners.test.log(Status.PASS, "Clicking on List View : " + listView);
        clickOnElement(listView);
    }
    public void setBuildYourComputer() {
        CustomListeners.test.log(Status.PASS, "Clicking on Build Your Computer : " + buildYourComputer);
        clickOnElement(buildYourComputer);
    }
}
