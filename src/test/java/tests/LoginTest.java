package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuBarPage;
import util.BaseTest;
import util.TestData;

public class LoginTest extends BaseTest {
    MenuBarPage menuBarPage;
    LoginPage loginPage;

    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class, priority = 1)
    public void signUpTest(String mail, String psw){
        menuBarPage = getMenuBarPage();
        loginPage = menuBarPage.verifyLoginBtn();
        loginPage.changeToSignUpOption();
        loginPage.fillSignUp(mail, psw);
        Assert.assertTrue(loginPage.verifySignUp());
        loginPage.clickOnElement(loginPage.getOkBtn());
    }

    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class, priority = 2)
    public void loginTest(String mail, String psw){
        loginPage.changeToLoginOption();
        loginPage.fillLogin(mail, psw);
        Assert.assertTrue(loginPage.verifyLogin());
    }
}
