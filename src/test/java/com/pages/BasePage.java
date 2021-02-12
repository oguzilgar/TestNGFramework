package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public static void main(String[] args) {
        //test03
    }

}
































