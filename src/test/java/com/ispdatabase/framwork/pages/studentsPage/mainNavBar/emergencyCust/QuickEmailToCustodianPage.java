package com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust;

import com.ispdatabase.framwork.driverManager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuickEmailToCustodianPage {
    private WebDriver driverInstance = DriverManager.getDriverInstance();
    private WebDriverWait wait = new WebDriverWait(driverInstance,30);
    JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driverInstance);

    @FindBy(css = "[class='modal-title ng-binding']")
    WebElement titleText;

    @FindBy(css = "[class='col-md-1 col-sm-1 t-r'] i")
    WebElement xBtn;

    @FindBy(css ="" )
    WebElement from;

    @FindBy(css = "[placeholder='Subject']")
    WebElement subject;

    @FindBy(css = "[placeholder='E-mail address']")
    WebElement to;

    @FindBy(css = "[placeholder='Your message']")
    WebElement message;

    @FindBy(css = "[class='col-md-12 col-sm-12 t-r']>button:first-child")
    WebElement sendBtn;

    @FindBy(css = "[class='col-md-12 col-sm-12 t-r']>button:last-child")
    WebElement closeBtn;

    public QuickEmailToCustodianPage(WebDriver driverInstance) {
        this.driverInstance = driverInstance;
        PageFactory.initElements(driverInstance,this);
    }

    public QuickEmailToCustodianPage entersubject(String subject) throws InterruptedException {
        Thread.sleep(3000);
        this.subject.sendKeys(subject.toString().trim());
        return this;
    }
    public QuickEmailToCustodianPage enterTo(String toEmail){
        this.to.sendKeys(toEmail.toString().trim());
        return this;
    }

    public QuickEmailToCustodianPage enterMessage(String message){
        this.message.sendKeys(message.toString().trim());
        return this;
    }

    public void clickOnSendBtn(){
        this.sendBtn.click();
        driverInstance.switchTo().parentFrame();

    }

    public void clickOnCloseBtn(){
        WebElement until = wait.until(ExpectedConditions.elementToBeClickable(closeBtn));
        javascriptExecutor.executeScript("arguments[0].click()",until);
//        driverInstance.switchTo().parentFrame();

    }
}
