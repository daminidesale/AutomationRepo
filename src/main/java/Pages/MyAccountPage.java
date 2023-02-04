package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//h1[text()='Skills for your future']")
    WebElement accountTitle;

    public MyAccountPage()
    {
        PageFactory.initElements(driver,this);
    }

    public String getTextOfMyAccountPage()
    {
        return accountTitle.getText();
    }

}
