package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionStuff;
import utils.Utility;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//span[text()='Sign up']")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[@data-purpose='header-login']")
    WebElement loginBtn;

    @FindBy(name = "q")
    WebElement searchTextBox;

    @FindBy(xpath = "//ul[@class='ud-unstyled-list ud-block-list js-suggestions ud-search-form-autocomplete-suggestions-with-image']")
    WebElement searchPage;

    @FindBy(xpath = "//div[text()='java']")
    WebElement searchText;

    @FindBy(id = "u130-popper-trigger--23")
    WebElement hover;

    @FindBy(xpath = "//span[text()='Try Udemy Business']")
    WebElement newHoverWindow;

    @FindBy(xpath = "//span[text()='Get the app']")
    WebElement businessOption;

    /*@FindBy(xpath = "//div[@class='mb-12 invisible sm:visible']")
    WebElement windowHandleText;*/

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    public void signUpBtnClick(){
        signUpBtn.click();
    }
    public void loginClick(){
        loginBtn.click();
    }

    public void searchBox(String search) {
        searchTextBox.click();
        searchTextBox.sendKeys(search);

        Actions actions = new Actions(driver);
        actions.moveToElement(searchPage).perform();
        actions.moveToElement(searchText).perform();
        searchText.click();
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(4000);
        javascriptExecutor.executeScript("window.scrollBy(0,-800)");
        Thread.sleep(4000);
    }

    public void mouseHover(){
        Utility.mouseHover(driver,hover);
    }

    public void windowClick() throws InterruptedException {
        Utility.scrollDownByElement(driver, businessOption);
        businessOption.click();
        Utility.switchToWindows(driver);
    }

    public void getCookiesHandle(){
        Utility.getCookies();
    }
}
