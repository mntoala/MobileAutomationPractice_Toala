package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import util.BasePage;

public class FormsPage extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Form components\")")
    private WebElement formsTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Input field:\")")
    private WebElement inputFieldTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Type something\")")
    private WebElement typeSomethingSpace;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You have typed:\")")
    private WebElement youHaveTypedTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Switch:\")")
    private WebElement switchTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Switch\")")
    private WebElement switchBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Dropdown:\")")
    private WebElement dropdownTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Select an item...\")")
    private WebElement dropdownSelectBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Buttons\")")
    private WebElement buttonsTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Active\")")
    private WebElement activeBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Inactive\")")
    private WebElement inactiveBtn;




    public FormsPage(AndroidDriver driver) {
        super(driver);
    }

    public Boolean verifyPage() {
        return isElementDisplayed(formsTxt) &&
                isElementDisplayed(inputFieldTxt) &&
                isElementDisplayed(typeSomethingSpace) &&
                isElementDisplayed(youHaveTypedTxt) &&
                isElementDisplayed(switchTxt) &&
                isElementDisplayed(switchBtn) &&
                isElementDisplayed(dropdownTxt) &&
                isElementDisplayed(dropdownSelectBtn) &&
                isElementDisplayed(buttonsTxt) &&
                isElementDisplayed(activeBtn) &&
                isElementDisplayed(inactiveBtn);
    }
}
