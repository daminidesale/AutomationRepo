package test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testbase.WebTestBase;

public class MyAccountTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public MyAccountTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
