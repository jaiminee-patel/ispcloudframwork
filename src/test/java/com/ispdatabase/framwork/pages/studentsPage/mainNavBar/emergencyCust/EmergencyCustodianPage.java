package com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust;

import com.ispdatabase.framwork.driverManager.DriverManager;
import com.ispdatabase.framwork.pages.studentsPage.searchSaveNavBar.SearchSaveNavBarPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmergencyCustodianPage extends SearchSaveNavBarPage {
    private static WebDriver driverInstance = DriverManager.getDriverInstance();
    private WebDriverWait wait = new WebDriverWait(driverInstance,30);
    JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driverInstance);

    @FindBy(css = "#defaultCustodian label+a")
    private WebElement defaultCustodianBtn;

    @FindBy(css = "#defaultCustodian label+a+a")
    private WebElement makeHomestayCustBtn;


    @FindBy(xpath = "//input[@placeholder='Custodian Name'] ")
    private WebElement magnifyingIcon;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(3)>div:nth-child(1)>input")
    private WebElement custodianName;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(3)>div:nth-child(2)>input")
    private WebElement firstName;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(4)>div:nth-child(1)>input")
    private WebElement lastName;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(4)>div:nth-child(2)>input")
    private WebElement street;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(5)>div:nth-child(1)>input")
    private WebElement city;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(5)>div:nth-child(2)>input")
    private WebElement postalCode;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(6)>div:nth-child(1) input")
    private WebElement country;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(6)>div:nth-child(2)>input")
    private WebElement phone;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(7)>div:nth-child(1)>input")
    private WebElement fax;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(7)>div:nth-child(2)>input")
    private WebElement cell;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(8)>div:nth-child(1)>input")
    private WebElement email;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(9)>div:nth-child(1)>input")
    private WebElement homePhone;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(9)>div:nth-child(2) input")
    private WebElement birthdate;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(8) >div:nth-child(2) button")
    private WebElement quickEmailBtn;

//    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(1)>fieldset>div:nth-child(6)>div:nth-child(1) [data-value=Canada]")
//    private WebElement canadabtn;

    public EmergencyCustodianPage(WebDriver driver) {
        super(driver);
        this.driverInstance=driver;
        PageFactory.initElements(driver,this);
    }

    public EditCustListPage getCustDetailForm() throws InterruptedException {
        WebElement mi = wait.until(ExpectedConditions.elementToBeClickable(magnifyingIcon));
       javascriptExecutor.executeScript("arguments[0].click()",mi);
       return new EditCustListPage(driverInstance);

    }

    public EmergencyCustodianPage enterCustodianName(String custName) throws InterruptedException {
        WebElement mi = wait.until(ExpectedConditions.elementToBeClickable(custodianName));
//        javascriptExecutor.executeScript("arguments[0].sendKeys(custName.trim())",mi);
//        Thread.sleep(4000);
        this.custodianName.sendKeys(custName.trim());
        return this;
    }

    public EmergencyCustodianPage enterFirstName(String firstName){
        this.firstName.sendKeys(firstName);
        return this;
    }

    public EmergencyCustodianPage enterLastName(String lastName){
        this.lastName.sendKeys(lastName);
        return this;
    }

    public EmergencyCustodianPage enterStreet(String street){
        this.street.sendKeys(street);
        return this;
    }

    public EmergencyCustodianPage enterCity(String city){
        this.city.sendKeys(city);
        return this;
    }

    public EmergencyCustodianPage enterPostalcode(String postalCode){
        this.postalCode.sendKeys(postalCode);
        return this;
    }

    public EmergencyCustodianPage enterCountry(String country) throws InterruptedException {
        this.country.sendKeys(country);

        return this;
    }

    public EmergencyCustodianPage enterPhone(Object phone){
        this.phone.sendKeys(phone.toString());
        return this;
    }

    public EmergencyCustodianPage enterFax(Object fax){
        this.fax.sendKeys(fax.toString());
        return this;
    }

    public EmergencyCustodianPage entercell(Object cell){
        this.cell.sendKeys(cell.toString());
        return this;
    }

    public EmergencyCustodianPage enterEmail(String email){
        this.email.sendKeys(email);
        return this;
    }

    public EmergencyCustodianPage enterHomephone(Object homePhone){
        this.homePhone.sendKeys(homePhone.toString());
        return this;
    }

    public EmergencyCustodianPage enterBirthdate(String birthDate){
        this.birthdate.sendKeys(birthDate);
        return this;
    }


    public QuickEmailToCustodianPage clickOnQuickEmailBtn(){
        WebElement until = wait.until(ExpectedConditions.elementToBeClickable(this.quickEmailBtn));
        javascriptExecutor.executeScript("arguments[0].click()",until);
        return new QuickEmailToCustodianPage(driverInstance);
    }

    public EmergencyCustodianPage clickOndefaulCustBtn(){
        this.defaultCustodianBtn.click();
        return this;
    }

    public EmergencyCustodianPage clickOnMakeHomestayCustBtn(){
        this.makeHomestayCustBtn.click();
        return this;
    }



    public void changeCity(String city) {
        if (city == null) {
            return;
        }
        this.city.sendKeys(city);
    }

    public void changeCountry(String country) {
        if (country == null) {
            return;
        }
        this.country.sendKeys(country+ Keys.ENTER);
    }

    public void changePhone(String phone) {
        if (phone == null) {
            return;
        }
        this.phone.sendKeys(phone);
    }
}


