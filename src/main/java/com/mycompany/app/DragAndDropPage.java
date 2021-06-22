package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends AbstractPage{
    private static final By IMAGES_AT_DRIVE_LOCATOR =  By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/div/div[3]/div/*");
    private static final By BIN_BOX_LOCATOR = By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/div/div[3]/div/div[7]");
    private static final By EMAIL_LINK_TAB_LOCATOR = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/a[1]/div/div/div");
    public DragAndDropPage(WebDriver driver){
        super(driver);
    }
    public DragAndDropPage dragAndDropImage(){
        WebElement element = driver.findElements(IMAGES_AT_DRIVE_LOCATOR).get(0);
        WebElement target = driver.findElement(BIN_BOX_LOCATOR);
        highlightElement(BIN_BOX_LOCATOR);
        new Actions(driver).dragAndDrop(element, target).build().perform();
        unHighlightElement(BIN_BOX_LOCATOR);
        return this;
    }
    public KeyBoardActionPage moveToKeyBoardActionPage(){
        driver.findElement(EMAIL_LINK_TAB_LOCATOR).click();
        return new KeyBoardActionPage(driver);
    }
}
