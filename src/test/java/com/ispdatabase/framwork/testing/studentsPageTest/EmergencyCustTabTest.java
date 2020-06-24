package com.ispdatabase.framwork.testing.studentsPageTest;

import com.ispdatabase.framwork.data.studentsDataProvider.EmegencyCustDataProvider;
import com.ispdatabase.framwork.driverManager.DriverManager;
import com.ispdatabase.framwork.pages.studentsPage.mainNavBar.MainNavBarPage;
import com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust.CustodianFormPage;
import com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust.ECPMainContactInfoPage;
import com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust.EmergencyCustodianPage;
import com.ispdatabase.framwork.pages.studentsPage.mainNavBar.emergencyCust.EditCustListPage;
import com.ispdatabase.framwork.pages.studentsPage.searchSaveNavBar.SearchSaveNavBarPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EmergencyCustTabTest {
    private static WebDriver driverInstance= DriverManager.getDriverInstance();

//    MainNavBarPage mainNavBar = new MainNavBarPage(driverInstance);
    SearchSaveNavBarPage searchSaveNavBarPage = new SearchSaveNavBarPage(driverInstance);
    EmergencyCustodianPage emergencyCustodianPage = new EmergencyCustodianPage(driverInstance);
    ECPMainContactInfoPage ecpMainContactInfoPage = new ECPMainContactInfoPage(driverInstance);
    

    @Test(enabled = true, dataProvider = "emergencyCustData", dataProviderClass = EmegencyCustDataProvider.class)
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



    @Test(enabled = true,dataProvider = "emergencyCustMainInfoData", dataProviderClass = EmegencyCustDataProvider.class)
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

    @Test(enabled = false)
    public void testFillAlternatContactInfo() {

    }


         



    }








