package com.mycompany.app;

import org.openqa.selenium.WebDriver;

public class KeyBoardActionPage extends AbstractPage{
    public KeyBoardActionPage(WebDriver driver){
        super(driver);
    }
    public KeyBoardActionPage moveToDraftTabUsingKeyBoardAction(){
        ActionChains(driver) \
    .key_down(Keys.CONTROL) \
    .click(element) \
    .key_up(Keys.CONTROL) \
    .perform()
    }
}
