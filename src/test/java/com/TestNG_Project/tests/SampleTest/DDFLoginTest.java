package com.TestNG_Project.tests.SampleTest;

import com.TestNG_Project.pages.DashboardPage;
import com.TestNG_Project.pages.LogInPage;
import com.TestNG_Project.tests.TestBase;
import com.TestNG_Project.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {


    @DataProvider
    public Object [][] userData(){


        ExcelUtil data = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");

        String[][] dataArray = data.getDataArrayWithoutFirstRow();



        return dataArray;

    }


    @Test(dataProvider  = "userData")
    public  void loginTestDDF(String username, String password, String firstname, String lastname){

        extentLogger= report.createTest("Test"+firstname+" "+ lastname);

        LogInPage loginPage= new LogInPage();
        loginPage.login(username,password);

        DashboardPage dashboardPage= new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();


        String actualFirstname= dashboardPage.getUserName();
        String expectedFullname= firstname+" "+lastname;

        Assert.assertEquals(actualFirstname, expectedFullname,"are same");







    }
























}
