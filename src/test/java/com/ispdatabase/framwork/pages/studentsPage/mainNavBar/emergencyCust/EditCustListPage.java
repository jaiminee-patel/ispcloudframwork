package com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust;

import com.ispdatabase.framwork.driverManager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditCustListPage {
    WebDriver driverInstance = DriverManager.getDriverInstance();
    private WebDriverWait wait = new WebDriverWait(driverInstance,30);
    JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driverInstance);


    @FindBy(css = "[class~='modal-footer'] button:nth-child(1)")
    WebElement selectCustodianBtn;

    @FindBy(css = "[class~='modal-footer'] button:nth-child(2)")
    WebElement addNewCustodianbtn;

    @FindBy(css = "[class~='modal-footer'] button:nth-child(3)")
    WebElement closeBtn;

    @FindBy(css = "[class~='modal-header'] .col-md-1 i")
    WebElement xbtn;


    public EditCustListPage(WebDriver driverInstance) {
        this.driverInstance = driverInstance;
        PageFactory.initElements(driverInstance,this);
    }

    public EmergencyCustodianPage selectCustodian(){

        this.selectCustodianBtn.click();
        return new EmergencyCustodianPage(driverInstance);
    }

    public CustodianFormPage clickOnAddNewCustodian(){
        WebElement stu = wait.until(ExpectedConditions.elementToBeClickable(addNewCustodianbtn));
        javascriptExecutor.executeScript("arguments[0].click()",stu);

        return new CustodianFormPage(driverInstance);
    }

    public EmergencyCustodianPage clickOnClose(){
        WebElement stu = wait.until(ExpectedConditions.elementToBeClickable(closeBtn));
        javascriptExecutor.executeScript("arguments[0].click()",stu);

        return new EmergencyCustodianPage(driverInstance);
    }

    public EmergencyCustodianPage clickOnXBtn(){
        this.xbtn.click();
        return new EmergencyCustodianPage(driverInstance);
    }

}
