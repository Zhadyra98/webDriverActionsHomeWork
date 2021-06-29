package com.mycompany.pages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import reporting.MyLogger;

import java.io.File;
import java.io.IOException;

public class MainPage extends AbstractPage{
    private static final String MAIN_URL = "https://disk.yandex.kz/";
    private static final By LOGIN_BUTTON_LINK_LOCATOR = By.xpath("//a[@class='button button_login header__login-link']");
    private static final String SCREENSHOTS_NAME_TPL = "screenshots/scr";

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
    private void takeScreenshot() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String screenshotName = SCREENSHOTS_NAME_TPL + System.nanoTime();
            File copy = new File(screenshotName + ".png");
            FileUtils.copyFile(screenshot, copy);
            MyLogger.info("Saved screenshot: " + screenshotName);
        } catch (IOException e) {
            MyLogger.error("Failed to make screenshot");
        }
    }

}
