package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuBarPage;
import util.BaseTest;
import util.TestData;

public class LoginTest extends BaseTest {
    MenuBarPage menuBarPage;
    LoginPage loginPage;
    @BeforeTest
    public void beforeSignUpTest(){
        menuBarPage=getMenuBarPage();
        loginPage= menuBarPage.verifyLoginBtn();
    }

    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class, priority = 1)
    public void signUpTest(String mail, String psw){
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
