package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class LoginPage extends WebTestBase {

    @FindBy(id = "form-group--1")
    WebElement emailTextBox;

    @FindBy(id = "form-group--3")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='ud-btn ud-btn-large ud-btn-brand ud-heading-md helpers--auth-submit-button--2K2dh']")
    WebElement loginBtn;

   /* @FindBy(xpath = "//h1[text()='Skills for your future']")
    WebElement loginElement;*/

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    /*public void loginClick(){
        Utility.waitUntilElementToBeClick(driver, loginBtn);
        loginBtn.click();
    }*/

    public void login(String userName, String password){
        emailTextBox.sendKeys(userName);
        passwordTextBox.sendKeys(password);
        loginBtn.click();
    }
  /* public String getText() {
        return loginElement.getText();
    }*/
}
