package com.TestNG_Project.tests.SampleTest;

import com.TestNG_Project.tests.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest extends TestBase {

    //this class is used for starting and building reports
    ExtentReports report;

    //this class is used to create the html report
    ExtentHtmlReporter htmlReporter;

    //this will define a test, enables adding logs, authors, test steps
    ExtentTest extentLogger;


    @BeforeMethod
    public void setUp(){
        //initialize the class
        report = new ExtentReports();

        //create report path
        String projectPath = System.getProperty("user.dir");
        String path  = projectPath + "/test-output/report.html";

        //create report based on this path
        htmlReporter= new ExtentHtmlReporter(path);

        //attach the html report to the report object
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Vytrack smoke test");

        //set environment information
        report.setSystemInfo("Environment","QA");
        report.setSystemInfo("Browser","chrome");
        report.setSystemInfo("Test","Europe testers");

    }

    @Test
    public void test1(){
        //give name to the current test
        //info () --> write test steps
        extentLogger= report.createTest("TC342 Login as a driver");
        //test steps
        extentLogger.info("open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver info");
        extentLogger.info("click submit");
        extentLogger.info("verify logged in");
        //pass() --> marks the test cae as passed
        extentLogger.info("TC342 passed");

    }

    @AfterMethod
    public void teardown(){

        //this is when the report is actually created, we have to put this
        report.flush();
    }























}
