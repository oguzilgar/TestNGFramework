package com.TestNG_Project.tests;

import com.TestNG_Project.utilities.BrowserUtils;
import com.TestNG_Project.utilities.ConfigurationReader;
import com.TestNG_Project.utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TestBase {
    protected WebDriver driver;
    protected Actions action;
    protected WebDriverWait wait;
    protected static ExtentReports report;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;
    protected String url;

    @BeforeTest
    public void setUpTest(){
        //initialize the class
        report = new ExtentReports();
        //create report path
        String projectPath = System.getProperty("user.dir");
        String path = projectPath +"/test-output/report.html";
        //initialize the html reporter with the report path
        htmlReporter= new ExtentHtmlReporter(path);
        //attach the html report to the report object
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("Vytrack smoke test");
        //set environment information
        report.setSystemInfo("Environment","QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));
    }

    @AfterTest
    public void tearDownTest(){
        //this is when the report is actually created
        report.flush();
    }

    @BeforeMethod
    @Parameters("env")    //helps to get data from xml file
    public void setUpMethod(@Optional String env){    //then we pass here
        System.out.println("env ="+ env);

        //if env is null, use default url
        //if its not null, get url based on env
        if(env==null){
            url=ConfigurationReader.get("url");
        }else{
            //env == qa1     qa1_url
            url=ConfigurationReader.get(env+"_url");
        }
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        action = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    //ITestResult class describes the result of a test in testing
    //if test is failed, we catch the details
    public void tearDownMethod(ITestResult result) throws InterruptedException, IOException { //add ITestResult

        //IF TEST FAILED
        if(result.getStatus()==ITestResult.FAILURE){

            //record the name of the failed test name
            extentLogger.fail(result.getName());

            //take the screenshot and return location of the screenshot
            String screenshotPath = BrowserUtils.getScreenshot(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshotPath);

            //capture the exceptions(error)
            extentLogger.fail(result.getThrowable());


        }else if(result.getStatus()==ITestResult.SKIP){
            extentLogger.skip("Test Skipped"+result.getName());
        }


        Thread.sleep(1000);
        Driver.closeDriver();
    }
}
