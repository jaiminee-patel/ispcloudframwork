package com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust;

import com.ispdatabase.framwork.driverManager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ECPAlternativeContactInfoPage {
    private static WebDriver driverInstance = DriverManager.getDriverInstance();
    private WebDriverWait wait = new WebDriverWait(driverInstance,30);
    JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driverInstance);
}
