package com.mycompany.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reporting.MyLogger;

public class LoginPage extends AbstractPage{
    private static final By INPUT_LOGIN_LABEL_LOCATOR = By.xpath("//input[@placeholder='Телефон или почта']");
    private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']");
    private static final By INPUT_PASSWORD_LOCATOR=By.id("passp-field-passwd");
    private static final By FINAL_LOGIN_BUTTON_LOCATOR = By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']");
    public LoginPage(WebDriver driver){
        super(driver);
    }
    public LoginPage enterLogin(String telephoneNumber){
        driver.findElement(INPUT_LOGIN_LABEL_LOCATOR).sendKeys(telephoneNumber);
        return this;
    }
    public LoginPage clickOnLoginButton(){
        highlightElement(LOGIN_BUTTON_LOCATOR);
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
        unHighlightElement(LOGIN_BUTTON_LOCATOR);
        MyLogger.info("Clicking on login button");
        return this;
    }
    public LoginPage enterPassword(String password){
        driver.findElement(INPUT_PASSWORD_LOCATOR).sendKeys(password);
        return this;
    }
    public DragAndDropPage finalLogin(){
        highlightElement(FINAL_LOGIN_BUTTON_LOCATOR);
        driver.findElement(FINAL_LOGIN_BUTTON_LOCATOR).click();
        unHighlightElement(FINAL_LOGIN_BUTTON_LOCATOR);
        return new DragAndDropPage(driver);
    }
}
