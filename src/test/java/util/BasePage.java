package util;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.*;


import java.time.Duration;

public class BasePage {
    public AndroidDriver driver;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void clickOnElement(WebElement element){
        element.click();
    }
    public Boolean verifyPage() {
        return false;
    }
    public HomePage getHomePage(){
        return new HomePage(driver);
    }
    public WebViewPage getWebViewPage(){return new WebViewPage(driver);}
    public LoginPage getLoginPage(){return new LoginPage(driver);}
    public FormsPage getFormsPage(){return new FormsPage(driver);}
    public SwipePage getSwipePage(){return new SwipePage(driver);}
    public DragPage getDragPage(){return new DragPage(driver);}

    public MenuBarPage getMenuBarPage(){
        return new MenuBarPage(driver);
    }
    protected Boolean isElementDisplayed(WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
    protected Point getCenter(WebElement element){
        Point p= element.getLocation();
        Dimension d= element.getSize();
        return new Point(p.getX() + d.getWidth() / 2,
                p.getY() + d.getHeight() / 2);
    }


}