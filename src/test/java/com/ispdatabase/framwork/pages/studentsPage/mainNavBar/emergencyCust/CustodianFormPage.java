package com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust;

import com.ispdatabase.framwork.driverManager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustodianFormPage {

    private WebDriver driverInstance = DriverManager.getDriverInstance();
    private WebDriverWait wait = new WebDriverWait(driverInstance,30);
    JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driverInstance);

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(1)>div:nth-child(1)>input")      // //input[@placeholder='Custodian Contact Name']
    WebElement custContactName;
    @FindBy(xpath = "//input[@placeholder='Custodian First Name'] ")    //div[class='col-md-12 ']>div:nth-child(1)>div:nth-child(2)
    WebElement custFirstName;

    @FindBy(xpath = "//input[@placeholder='Custodian Last Name'] ")        //div[class='col-md-12 ']>div:nth-child(2)>div:nth-child(1)
    WebElement custLastName;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(2)>div:nth-child(2)>input")
    WebElement street;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(3)>div:nth-child(1)>input")
    WebElement city;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(3)>div:nth-child(2)>input")
    WebElement postalCode;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(4)>div:nth-child(1) input")
    WebElement custCountry;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(4)>div:nth-child(2)>input")
    WebElement custPhone;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(5)>div:nth-child(1)>input")
    WebElement custFax;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(5)>div:nth-child(2)>input")
    WebElement custCell;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(6)>div:nth-child(1)>input")
    WebElement email;

    @FindBy(css = "div[class='col-md-12 ']>div:nth-child(6)>div:nth-child(2)>input")
    WebElement homePhone;

    @FindBy(css = "[class='row ng-scope'] p[class~='input-group'] input")             //[class='col-md-12 ']>div:nth-child(7)>div:nth-child(1) p
    WebElement DOB;

    @FindBy(css = "[ng-click='closeModal()']")
    WebElement update;

    @FindBy(xpath = "//button[@ng-click=\"closeModal('1')\"]")
    WebElement cancelBtn;

    @FindBy(css = "[class='glyphicon glyphicon-remove modal-close']")
    WebElement xbtn;


    public CustodianFormPage(WebDriver driverInstance) {
        this.driverInstance = driverInstance;
        PageFactory.initElements(driverInstance,this);
    }

    public CustodianFormPage enterContactName(String contactName) throws InterruptedException {
        Thread.sleep(2000);

        this.custContactName.sendKeys(contactName.trim());
        return this;
    }

    public CustodianFormPage enterFirsttName(String firstName){
        this.custFirstName.sendKeys(firstName);
        return this;
    }

    public CustodianFormPage enterLastName(String lastName){
        this.custLastName.sendKeys(lastName);
        return this;
    }

    public CustodianFormPage enterStreet(String street){
        this.street.sendKeys(street);
        return this;
    }

    public CustodianFormPage entercity (String city){
        this.city.sendKeys(city);
        return this;
    }

    public CustodianFormPage enterPostalCode(String postalCode ){
        this.postalCode.sendKeys(postalCode);
        return this;
    }

    public CustodianFormPage selectCountry(String country){
        this.custCountry.sendKeys(country+Keys.ENTER);
        return this;
    }

    public CustodianFormPage enterPhoneNumber(Object phoneNumber){
        this.custPhone.sendKeys(phoneNumber.toString());
        return this;
    }

    public CustodianFormPage enterFaxNumber(Object faxNumber ){
        this.custFax.sendKeys(faxNumber.toString());
        return this;
    }

    public CustodianFormPage enterCellNumber(Object cellNumber ){
        this.custCell.sendKeys(cellNumber.toString());
        return this;
    }

    public CustodianFormPage enterrEmail (String email){
        this.email.sendKeys(email);
        return this;
    }

    public CustodianFormPage homePhoneNumber(Object homePhoneNumber){
        this.homePhone.sendKeys(homePhoneNumber.toString());
        return this;
    }

    public CustodianFormPage selectDOB(Object birthdate){
        this.DOB.sendKeys(birthdate.toString().trim());
        return this;
    }

    public EditCustListPage clickOnUpdate() throws InterruptedException {
        WebElement cou = wait.until(ExpectedConditions.elementToBeClickable(update));
        javascriptExecutor.executeScript("arguments[0].click()",cou);

        return new EditCustListPage(driverInstance);
    }
    public EditCustListPage clickOnCancel(){
        this.cancelBtn.click();
        return new EditCustListPage(driverInstance);


    }
    public EditCustListPage clickOnX(){
        this.xbtn.click();
        driverInstance.switchTo().parentFrame();
        return new EditCustListPage(driverInstance);
    }



}
