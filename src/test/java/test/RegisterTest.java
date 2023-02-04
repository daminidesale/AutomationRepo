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

public class RegisterTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    RegisterPage registerPage;

    public RegisterTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage= new HomePage();
        loginPage= new LoginPage();
        registerPage=new RegisterPage();
        myAccountPage= new MyAccountPage();
    }

    @Test
    public void verifyLoginWithValidCredentials(){
        SoftAssert softAssert=new SoftAssert();
        //homePage.closedAdvertise();
        homePage.signUpBtnClick();
        //RegisterPage.register(prop.getProperty("firstName"),prop.getProperty("userName"),prop.getProperty("password"));
        //softAssert.assertEquals(myAccountPage.getTextOfMyAccountPage(),"New to Udemy? Lucky you.", "New to Udemy? Lucky you. text should be match");
        //softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}

