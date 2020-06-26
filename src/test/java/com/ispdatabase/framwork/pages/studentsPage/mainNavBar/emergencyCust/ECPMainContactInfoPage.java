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

public class ECPMainContactInfoPage extends EmergencyCustodianPage{
    private static WebDriver driverInstance = DriverManager.getDriverInstance();
    private WebDriverWait wait = new WebDriverWait(driverInstance,30);
    JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driverInstance);

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(2)>div:nth-child(1)>input")
    private WebElement contactName;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(2)>div:nth-child(2)>input")
    private WebElement address1;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(3)>div:nth-child(1)>input")
    private WebElement firstName;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(3)>div:nth-child(2)>input")
    private WebElement lastName;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(4)>div:nth-child(1)>input")
    private WebElement address2;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(4)>div:nth-child(2)>input")
    private WebElement city;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(5)>div:nth-child(1)>input")
    private WebElement province;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(5)>div:nth-child(2)>input")
    private WebElement postalCode;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(6) input:nth-child(1)")
    private WebElement country;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(6)>div:nth-child(2)>input")
    private WebElement phone;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(7)>div:nth-child(1)>input")
    private WebElement fax;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(7)>div:nth-child(2)>input")
    private WebElement cell;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(8)>div:nth-child(1)>input")
    private WebElement email;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(8)>div:nth-child(2)>button")
    private WebElement quickEmailBtn;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(9)>div:nth-child(1)>input")
    private WebElement relationship;

    @FindBy(css = "form[name='studentForm']>div:nth-child(2)>div:nth-child(2)>fieldset>div:nth-child(9)>div:nth-child(2)>input")
    private WebElement work;





    public ECPMainContactInfoPage(WebDriver driver) {
        super(driver);
        this.driverInstance = driver;
        PageFactory.initElements(driver,this);
    }


    public ECPMainContactInfoPage enterContactName(String contactName) throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(this.contactName));
        this.contactName.sendKeys(contactName.trim());
        return this;
    }

    public ECPMainContactInfoPage enteraddress1(String address1){
        this.address1.sendKeys(address1.trim().toString());
        return this;
    }

    public ECPMainContactInfoPage enterFirstName(String firstName ){
        this.firstName.sendKeys(firstName);
        return this;
    }

    public ECPMainContactInfoPage enterLastName(String lastName ){
        this.lastName.sendKeys(lastName);
        return this;
    }

    public ECPMainContactInfoPage enteraddress2(String address2){
        this.address2.sendKeys(address2.trim().toString());
        return this;
    }

    public ECPMainContactInfoPage enterCity(String city){
        this.city.sendKeys(city);
        return this;
    }

    public ECPMainContactInfoPage enterprovince(String province){
        this.province.sendKeys(province);
        return this;
    }

    public ECPMainContactInfoPage enterPostalCode(String postalCode){
        this.postalCode.sendKeys(postalCode.trim());
        return this;
    }

    public ECPMainContactInfoPage selectCountry(String country){
        this.country.sendKeys(country+ Keys.ENTER);
        return this;
    }

    public ECPMainContactInfoPage enterPhone(Object phone){
        this.phone.sendKeys(phone.toString());
        return this;
    }

    public ECPMainContactInfoPage enterFax(Object fax){
        this.fax.sendKeys(fax.toString());
        return this;
    }

    public ECPMainContactInfoPage enterCell(Object cell){
        this.cell.sendKeys(cell.toString());
        return this;
    }

    public ECPMainContactInfoPage enterEmail(String email){
        this.email.sendKeys(email);
        return this;
    }

    public ECPMainContactInfoPage enterRelationship(String relationship){
        this.relationship.sendKeys(relationship.trim());
        return this;
    }

    public ECPMainContactInfoPage enterWork(String work){
        this.work.sendKeys(work.trim());
        return this;
    }

    public QuickEmailToCustodianPage clickOnQuickEmailBtn(){
        this.quickEmailBtn.click();
        return new QuickEmailToCustodianPage(driverInstance);
    }




}
