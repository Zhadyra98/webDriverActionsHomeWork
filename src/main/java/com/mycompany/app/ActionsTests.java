package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsTests {
    WebDriver driver;
    @BeforeTest(description = "Start browser")
    private void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterTest(description = "close browser")
    public void kill(){
        //driver.close();
    }
    @Test
    public void dragAndDropTest(){
        LoginPage loginPage = new MainPage(driver).open().clickOnEnterButton().enterLogin("z.oralkhanova").clickOnLoginButton().enterPassword("Asd123456789+*");
        DragAndDropPage dragAndDropPage = loginPage.finalLogin().dragAndDropImage();
    }
    @Test
    public void keyBoardActionTest(){
        LoginPage loginPage = new MainPage(driver).open().clickOnEnterButton().enterLogin("z.oralkhanova").clickOnLoginButton().enterPassword("Asd123456789+*");
        KeyBoardActionPage keyBoardActionPage = loginPage.finalLogin().moveToKeyBoardActionPage().moveToDraftTabUsingKeyBoardAction();
    }
}
