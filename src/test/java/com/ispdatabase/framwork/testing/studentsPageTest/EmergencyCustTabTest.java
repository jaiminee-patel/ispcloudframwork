package com.ispdatabase.framwork.testing.studentsPageTest;

import com.ispdatabase.framwork.data.studentsDataProvider.EmegencyCustDataProvider;
import com.ispdatabase.framwork.driverManager.DriverManager;
import com.ispdatabase.framwork.pages.studentsPage.mainNavBar.MainNavBarPage;
import com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust.*;
import com.ispdatabase.framwork.pages.studentsPage.searchSaveNavBar.SearchSaveNavBarPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EmergencyCustTabTest {
    private static WebDriver driverInstance= DriverManager.getDriverInstance();

//    MainNavBarPage mainNavBar = new MainNavBarPage(driverInstance);
    SearchSaveNavBarPage searchSaveNavBarPage = new SearchSaveNavBarPage(driverInstance);
    EmergencyCustodianPage emergencyCustodianPage = new EmergencyCustodianPage(driverInstance);
    ECPMainContactInfoPage ecpMainContactInfoPage = new ECPMainContactInfoPage(driverInstance);
    QuickEmailToCustodianPage quickEmailToCustodianPage = new QuickEmailToCustodianPage(driverInstance);
    

    @Test(enabled = false, dataProvider = "emergencyCustData", dataProviderClass = EmegencyCustDataProvider.class)
    public void testFillCustInfoForm(String contactName, String firstName, String lastName, String street, String city,
                                     String postalCode, String country, Object phone, Object fax, Object cell, String email, Object homePhone, Object dOB
    ) throws InterruptedException {
        EditCustListPage custDetailForm = emergencyCustodianPage.getCustDetailForm();
        CustodianFormPage custodianFormPage = custDetailForm.clickOnAddNewCustodian();     //how to test this form
        EditCustListPage editCustListPage = custodianFormPage
                .enterContactName(contactName)
                .enterFirsttName(firstName)
                .enterLastName(lastName)
                .enterStreet(street)
                .entercity(city)
                .enterPostalCode(postalCode)
                .selectCountry(country)
                .enterPhoneNumber(phone.toString())
                .enterFaxNumber(fax.toString())
                .enterCellNumber(cell.toString())
                .enterrEmail(email)
                .homePhoneNumber(homePhone)
                .selectDOB(dOB).clickOnUpdate();
        Thread.sleep(5000);
        EmergencyCustodianPage emergencyCustodianPage = editCustListPage.clickOnClose();


        EmergencyCustodianPage emergencyCustodianPage1 = searchSaveNavBarPage.clickOnSave();
//        EmergencyCustodianPage emergencyCustodianPage1 = emergencyCustodianPage.clickOnSave();
//        Thread.sleep(3000);

    }

    @Test(enabled = false)
    public void testSelectCustAndGetInfo() throws InterruptedException {
        EditCustListPage custDetailForm = emergencyCustodianPage.getCustDetailForm();

        EmergencyCustodianPage emergencyCustodianPage = custDetailForm.selectCustodian();//how can i send value to select custodian from list

    }





    @Test(enabled = false)
    public void testFillAlternatContactInfo() {

    }




    @Test(dataProvider = "emergencyCustInfoUpdateData", dataProviderClass = EmegencyCustDataProvider.class)
    public void testUpdateCustInfo(String contactName, String firstName, String lastName, String street, String city,
                                   String postalCode, String country, Object phone, Object fax, Object cell, String email, Object homePhone, Object dOB
    ) throws InterruptedException {
        emergencyCustodianPage
                .enterCustodianName(contactName)
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterStreet(street)
                .enterCity(city)
                .enterPostalcode(postalCode)
                .enterCountry(country)
                .enterPhone(phone.toString())
                .enterFax(fax.toString())
                .entercell(cell.toString())
                .enterEmail(email)
                .enterHomephone(homePhone)
                .enterBirthdate(dOB.toString());
        searchSaveNavBarPage.clickOnSave();

    }

    @Test(dependsOnMethods = "testUpdateCustInfo", dataProvider = "emergencyCustInfoQuickEmailData" ,dataProviderClass = EmegencyCustDataProvider.class)
    public void testQuickEmailToCustodian(String subject, String toEmail, String message) throws InterruptedException {
        QuickEmailToCustodianPage quickEmailToCustodianPage = emergencyCustodianPage.clickOnQuickEmailBtn();
        quickEmailToCustodianPage
                .entersubject(subject)
                .enterTo(toEmail)
                .enterMessage(message)
                .clickOnCloseBtn();
    }

    @Test(enabled = true, dependsOnMethods = "testQuickEmailToCustodian", dataProvider = "emergencyCustMainInfoData", dataProviderClass = EmegencyCustDataProvider.class)
    public void testFillMainContactInfo(String contactName, String address1, String firstName, String lastName,
                                        String address2,String city, String province, String postalCode, String country,
                                        Object phone, Object fax, Object cell, String email, String relationship, String work) throws InterruptedException {


        ECPMainContactInfoPage ecpMainContactInfoPage = this.ecpMainContactInfoPage
                .enterContactName(contactName)
                .enteraddress1(address1)
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enteraddress2(address2)
                .enterCity(city)
                .enterprovince(province)
                .enterPostalCode(postalCode)
                .selectCountry(country)
                .enterPhone(phone)
                .enterFax(fax)
                .enterCell(cell)
                .enterEmail(email)
                .enterRelationship(relationship)
                .enterWork(work);

        searchSaveNavBarPage.clickOnSave();

        Thread.sleep(4000);
    }
}








