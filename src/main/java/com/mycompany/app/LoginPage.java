package com.mycompany.app;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{
    private static final By INPUT_LOGIN_LABEL_LOCATOR = By.xpath("//input[@placeholder='Телефон или почта']");
    private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']");
    private static final By INPUT_PASSWORD_LOCATOR=By.id("passp-field-passwd");
    private static final By FINAL_LOGIN_BUTTON_LOCATOR = By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']");
    public LoginPage(WebDriver driver){
        super(driver);
    }
    public LoginPage enterTelephoneNumber(String telephoneNumber){
        driver.findElement(INPUT_LOGIN_LABEL_LOCATOR).sendKeys(telephoneNumber);
        return this;
    }
    public LoginPage clickOnLoginButton(){
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
        return this;
    }
    public LoginPage enterPassword(String password){
        driver.findElement(INPUT_PASSWORD_LOCATOR).sendKeys(password);
        return this;
    }
    public DragAndDropPage finalLogin(){
        driver.findElement(FINAL_LOGIN_BUTTON_LOCATOR).click();
        return new DragAndDropPage(driver);
    }
}
