package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import util.BasePage;

public class WebViewPage extends BasePage {


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Toggle navigation bar\")")
    private WebElement navBar;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Image\").text(\"WebdriverIO\").index(0)")
    private WebElement imgIO;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Search\")")
    private WebElement searchBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").text(\"WebdriverIO\").index(0)")
    private WebElement imgRobot;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Next-gen browser and mobile automation test framework for Node.js\")")
    private WebElement descText;
    @AndroidFindBy(accessibility = "Get Started")
    private WebElement gStartedBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Why WebdriverIO?\")")
    private WebElement whyWebDriverBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View on GitHub\")")
    private WebElement viewOnBtn;

    public WebViewPage(AndroidDriver driver) {
        super(driver);
    }

    public Boolean verifyPage() {
        return isElementDisplayed(navBar) &&
                isElementDisplayed(imgIO) &&
                isElementDisplayed(searchBtn) &&
                isElementDisplayed(imgRobot) &&
                isElementDisplayed(descText) &&
                isElementDisplayed(gStartedBtn);
    }
}
