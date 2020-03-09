package com.TestNG_Project.tests.SampleTest;

import com.TestNG_Project.pages.LogInPage;
import com.TestNG_Project.tests.TestBase;
import com.TestNG_Project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends TestBase {




    @Test
    public void wrongPasswordTest(){
        //name of the test for report
        extentLogger = report.createTest("Wrong Password Test");
        LogInPage loginPage = new LogInPage();
        loginPage.usernameInput.sendKeys("user1");
        extentLogger.info("Enter username");
        loginPage.passwordInput.sendKeys("somepassword");
        extentLogger.info("Enter Password");
        loginPage.loginBtn.click();
        extentLogger.info("Click login button");
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");
        //we put after assertion so if the assertion fails, it will not send pass to report
        extentLogger.pass("PASS:Wrong Password Test");
    }

}
