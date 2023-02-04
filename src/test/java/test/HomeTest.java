package test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegisterPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testbase.WebTestBase;


public class HomeTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public HomeTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @Test
    public void verifySearchFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        homePage.searchBox(prop.getProperty("search"));
        //MyAccountPage.searchClick();
        softAssert.assertAll();
    }

    @Test
    public void verifyGetWindows() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.scrollDown();
        softAssert.assertAll();
        Thread.sleep(4000);
    }

    @Test
    public void verifyMouseHover() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseHover();
        softAssert.assertAll();
        Thread.sleep(4000);

    }

    @Test
    public void verifyGetWindowHandle() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.windowClick();
        //softAssert.assertEquals(homePage.getTextOfWindowHandle(), "Get your demo", "Get your demo text should be match");
        softAssert.assertAll();
        Thread.sleep(4000);
    }

    @Test
    public void verifyCookiesHandle(){
        SoftAssert softAssert = new SoftAssert();
        homePage.getCookiesHandle();
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
