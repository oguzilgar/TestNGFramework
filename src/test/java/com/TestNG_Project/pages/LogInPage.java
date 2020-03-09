package com.TestNG_Project.pages;

import com.TestNG_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage(){
        PageFactory.initElements(Driver.get(),this);    //this makes this page; Page Object model CLASS
    }

    //WE WILL LOCATE OUR ELEMENTS ONLY ONCE, and use for many test cases

    //driver.findelement(By.id("prependedInput"))
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;


    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;


    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String usernameStr, String passwordStr){

        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();
    }



/*

    @FindAll({                                  //give us more options to use multiple locators
            @FindBy(id = "prependedInput"),     //if one of them matching, it works  "OR"
            @FindBy(name = "_username")
    })



 */

/*

    @FindBys({                                  //all the locators must be correct, "AND"
            @FindBy(id = "prependedInput"),     //if one of them matching, it works
            @FindBy(name = "_username")
    })



 */

































}
