package com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust;

import com.ispdatabase.framwork.driverManager.DriverManager;
import com.ispdatabase.framwork.pages.studentsPage.searchSaveNavBar.SearchSaveNavBarPage;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(xpath = "//input[@placeholder='Custodian Name'] ")
    WebElement magnifyingIcon;





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
}


