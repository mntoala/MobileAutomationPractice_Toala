package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import util.BasePage;

public class DragPage extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    private WebElement dragTxt;

    public DragPage(AndroidDriver driver) {
        super(driver);
    }

    public Boolean verifyPage(){
        return isElementDisplayed(dragTxt);
    }
}
