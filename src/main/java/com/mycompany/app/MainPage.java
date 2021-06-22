package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage{
    private static final String MAIN_URL = "https://disk.yandex.kz/";
    private static final By LOGIN_BUTTON_LINK_LOCATOR = By.xpath("//a[@class='button button_login header__login-link']");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open() {
        driver.get(MAIN_URL);
        return this;
    }
    public LoginPage clickOnEnterButton(){
        driver.findElement(LOGIN_BUTTON_LINK_LOCATOR).click();
        return new LoginPage(driver);
    }


    /*public DroppablePage openDroppableLink() {
        highlightElement(DROPPABLE_LINK_LOCATOR);
        Screenshoter.takeScreenshot();
        driver.findElement(DROPPABLE_LINK_LOCATOR).click();
        unHighlightElement(DROPPABLE_LINK_LOCATOR);
        return new DroppablePage();
    }

    public ResizablePage openResizableLink() {
        highlightElement(RESIZABLE_LINK_LOCATOR);
        Screenshoter.takeScreenshot();
        driver.findElement(RESIZABLE_LINK_LOCATOR).click();
        unHighlightElement(RESIZABLE_LINK_LOCATOR);
        return new ResizablePage();
    }

    public SelectablePage openSelectableLink() {
        highlightElement(SELECTABLE_LINK_LOCATOR);
        Screenshoter.takeScreenshot();
        driver.findElement(SELECTABLE_LINK_LOCATOR).click();
        unHighlightElement(SELECTABLE_LINK_LOCATOR);
        return new SelectablePage();
    }*/
}
