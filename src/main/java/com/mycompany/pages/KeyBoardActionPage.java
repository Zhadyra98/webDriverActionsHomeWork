package com.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyBoardActionPage extends AbstractPage{
    private static final By INBOX_TAB_LOCATOR = By.xpath("//*[@id=\"nb-1\"]/body/div[2]/div[7]/div/div[3]/div[2]/div[3]/div/div[1]/div[1]/a[1]");
    public KeyBoardActionPage(WebDriver driver){
        super(driver);
    }
    public KeyBoardActionPage moveToDraftTabUsingKeyBoardAction() {
        WebElement page = driver.findElement(INBOX_TAB_LOCATOR);
        page.click();
        page.sendKeys(Keys.ARROW_DOWN);
        page.sendKeys(Keys.ARROW_DOWN);
        page.sendKeys(Keys.ARROW_DOWN);
        page.sendKeys(Keys.ARROW_DOWN);
        page.sendKeys(Keys.ARROW_DOWN);
        page.sendKeys(Keys.ENTER);
        return this;
    }
}
