package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import util.BasePage;

public class HomePage extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WEBDRIVER\")")
    private WebElement title;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").index(0)")
    private WebElement imgRobot;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").index(2)")
    private WebElement imgIO;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Demo app for the appium-boilerplate\")")
    private WebElement demoTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").index(4)")
    private WebElement imgApple;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").index(5)")
    private WebElement imgAndroid;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Support\")")
    private WebElement supportTxt;


    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public Boolean verifyPage() {
        if (isElementDisplayed(title) && isElementDisplayed(imgRobot) && isElementDisplayed(imgIO)
        && isElementDisplayed(demoTxt) && isElementDisplayed(imgAndroid) && isElementDisplayed(imgApple)
        && isElementDisplayed(supportTxt)){
            return true;
        }else {
            return false;}
    }

}