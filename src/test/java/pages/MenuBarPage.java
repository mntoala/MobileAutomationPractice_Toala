package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import util.BasePage;

public class MenuBarPage extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Home\")")
    WebElement homeBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Webview\")")
    WebElement webViewBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
    WebElement loginBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Forms\")")
    WebElement formsBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe\")")
    WebElement swipeBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag\")")
    WebElement dragBtn;

    public HomePage verifyHomeBtn(){
        HomePage homePage= getHomePage();
        clickOnElement(homeBtn);
        Assert.assertTrue(homePage.verifyPage());
        return homePage;
    }
    public WebViewPage verifyWebViewBtn(){
        WebViewPage webViewPage= getWebViewPage();
        clickOnElement(webViewBtn);
        Assert.assertTrue(webViewPage.verifyPage());
        return webViewPage;
    }
    public LoginPage verifyLoginBtn(){
        LoginPage loginPage= getLoginPage();
        clickOnElement(loginBtn);
        Assert.assertTrue(loginPage.verifyPage());
        return loginPage;
    }
    public FormsPage verifyFormsBtn(){
        FormsPage formsPage= getFormsPage();
        clickOnElement(formsBtn);
        Assert.assertTrue(formsPage.verifyPage());
        return formsPage;
    }
    public SwipePage verifySwipeBtn(){
        SwipePage swipePage= getSwipePage();
        clickOnElement(swipeBtn);
        Assert.assertTrue(swipePage.verifyPage());
        return swipePage;
    }
    public DragPage verifyDragBtn(){
        DragPage dragPage= getDragPage();
        clickOnElement(dragBtn);
        Assert.assertTrue(dragPage.verifyPage());
        return dragPage;
    }

    public MenuBarPage(AndroidDriver driver) {
        super(driver);
    }
}
