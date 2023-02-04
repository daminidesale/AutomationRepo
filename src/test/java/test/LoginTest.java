package test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public LoginTest(){
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
    public void verifyLoginWithValidCredential(){
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClick();
        loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
        //softAssert.assertEquals(myAccountPage.getTextOfMyAccountPage(), "Skills for your future", "Skills for your future text should be match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
