package com.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reporting.MyLogger;

public class MainPage extends AbstractPage{
    private static final String MAIN_URL = "https://disk.yandex.kz/";
    private static final By LOGIN_BUTTON_LINK_LOCATOR = By.xpath("//a[@class='button button_login header__login-link']");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open() {
        MyLogger.info("Going to URL: " + MAIN_URL);
        driver.get(MAIN_URL);
        return this;
    }
    public LoginPage clickOnEnterButton(){
        highlightElement(LOGIN_BUTTON_LINK_LOCATOR);
        driver.findElement(LOGIN_BUTTON_LINK_LOCATOR).click();
        return new LoginPage(driver);
    }

}
