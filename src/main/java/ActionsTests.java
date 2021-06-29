import com.mycompany.pages.DragAndDropPage;
import com.mycompany.pages.KeyBoardActionPage;
import com.mycompany.pages.LoginPage;
import com.mycompany.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ActionsTests {
    WebDriver driver;
    @BeforeTest(description = "Start browser")
    private void initBrowser() throws MalformedURLException {
        //driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterTest(description = "close browser")
    public void kill(){
        driver.close();
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
