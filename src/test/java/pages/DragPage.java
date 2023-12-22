package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import util.BasePage;

public class DragPage extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    private WebElement dragTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-l1\")")
    WebElement drop1;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-c1\")")
    WebElement drop2;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-r1\")")
    WebElement drop3;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-l2\")")
    WebElement drop4;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-c2\")")
    WebElement drop5;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-r2\")")
    WebElement drop6;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-l3\")")
    WebElement drop7;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-c3\")")
    WebElement drop8;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drop-r3\")")
    WebElement drop9;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"renew\")")
    WebElement renewBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-l2\")")
    WebElement drag1;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-r3\")")
    WebElement drag2;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-r1\")")
    WebElement drag3;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-c1\")")
    WebElement drag4;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-c3\")")
    WebElement drag5;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-r2\")")
    WebElement drag6;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-c2\")")
    WebElement drag7;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-l1\")")
    WebElement drag8;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"drag-l3\")")
    WebElement drag9;

    public DragPage(AndroidDriver driver) {
        super(driver);
    }

    public Boolean verifyPage() {
        return isElementDisplayed(dragTxt) &&
                isElementDisplayed(drop1) &&
                isElementDisplayed(drop2) &&
                isElementDisplayed(drop3) &&
                isElementDisplayed(drop4) &&
                isElementDisplayed(drop5) &&
                isElementDisplayed(drop6) &&
                isElementDisplayed(drop7) &&
                isElementDisplayed(drop8) &&
                isElementDisplayed(drop9) &&
                isElementDisplayed(renewBtn) &&
                isElementDisplayed(drag1) &&
                isElementDisplayed(drag2) &&
                isElementDisplayed(drag3) &&
                isElementDisplayed(drag4) &&
                isElementDisplayed(drag5) &&
                isElementDisplayed(drag6) &&
                isElementDisplayed(drag7) &&
                isElementDisplayed(drag8) &&
                isElementDisplayed(drag9);
    }
}
