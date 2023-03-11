package com.cucumber.base;

import org.openqa.selenium.WebDriver;

public class BaseTClass {
    public static WebDriver driver;

    protected BaseTClass(WebDriver driver){
        BaseTClass.driver = driver;
    }
}
