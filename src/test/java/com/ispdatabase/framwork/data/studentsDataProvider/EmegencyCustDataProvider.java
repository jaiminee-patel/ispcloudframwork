package com.ispdatabase.framwork.data.studentsDataProvider;

import com.ispdatabase.framwork.data.ExcelDataProvider;
import org.testng.annotations.DataProvider;

import java.util.Iterator;

public class EmegencyCustDataProvider {
    ExcelDataProvider excelDataProvider = new ExcelDataProvider();

    @DataProvider(name = "emergencyCustData")
    public Iterator<Object[]> getEmergencyCustData(){
        return excelDataProvider.getSheetData("emergencyCustDataSheet",true).iterator();
    }



    @DataProvider(name = "emergencyCustMainInfoData")
    public Iterator<Object[]> getEmergencyCustMainInfoData(){
        return excelDataProvider.getSheetData("emergenctCustMainInfoData",true).iterator();
    }
//
//    @DataProvider(name = "emergencyCustAlternativeData")
//    public Iterator<Object[]> getEmergencyCustAlternativeData(){
//        ExcelDataProvider excelDataProvider = new ExcelDataProvider();
//        return excelDataProvider.getSheetData("emergencyCustAlternativeData",true).iterator();
//    }

    @DataProvider(name = "emergencyCustInfoUpdateData")
    public Iterator<Object[]> getEmergencyCustInfoUpdateData(){
        return excelDataProvider.getSheetData("emergencyCustInfoUpdateSheet",true).iterator();
    }

    @DataProvider(name = "emergencyCustInfoQuickEmailData")
    public Iterator<Object[]> getEmergencyCustQuickEmailData(){
        return excelDataProvider.getSheetData("quickEmailToCustodian",true).iterator();
    }




}
