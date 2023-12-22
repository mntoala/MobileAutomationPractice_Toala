package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import util.BasePage;

public class LoginPage extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login / Sign up Form\")")
    WebElement loginSignTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
    WebElement loginOpt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
    WebElement signUpOpt;
    @AndroidFindBy(accessibility = "input-email")
    private WebElement email;
    @AndroidFindBy(accessibility = "input-password")
    private WebElement pswd;
    @AndroidFindBy(accessibility = "input-repeat-password")
    private WebElement repeatPswd;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"LOGIN\")")
    WebElement loginBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"SIGN UP\")")
    WebElement signUpBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").index(4)")
    WebElement infTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    WebElement okBtn;

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public Boolean verifyPage() {
        return isElementDisplayed(loginSignTxt) &&
                isElementDisplayed(loginOpt) &&
                isElementDisplayed(signUpOpt) &&
                isElementDisplayed(email) &&
                isElementDisplayed(pswd) &&
                isElementDisplayed(loginBtn) &&
                isElementDisplayed(infTxt);
    }

    public void changeToSignUpOption(){
        clickOnElement(signUpOpt);
        Assert.assertTrue(isElementDisplayed(repeatPswd));
    }
    public void changeToLoginOption(){
        clickOnElement(loginOpt);
        Assert.assertTrue(isElementDisplayed(loginBtn));

    }
    public void fillLogin(String mail, String psw){
        email.sendKeys(mail);
        pswd.sendKeys(psw);
        clickOnElement(loginBtn);
    }
    public void fillSignUp(String mail, String psw){
        email.sendKeys(mail);
        pswd.sendKeys(psw);
        repeatPswd.sendKeys(psw);
        clickOnElement(signUpBtn);
    }

    public WebElement getOkBtn() {
        return okBtn;
    }
    public Boolean verifySignUp(){
        return isElementDisplayed(okBtn);
    }
    public Boolean verifyLogin(){
        return isElementDisplayed(okBtn);
    }

}
