package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuBarPage;
import util.BaseTest;
import util.TestData;

public class SignUpTest extends BaseTest {
    MenuBarPage menuBarPage;
    LoginPage loginPage;
    @Test(dataProvider = "RandomUser", dataProviderClass = TestData.class)
    public void signUpTest(String mail, String psw){
        menuBarPage=getMenuBarPage();
        loginPage= menuBarPage.verifyLoginBtn();
        loginPage.changeToSignUpOption();
        loginPage.fillSignUp(mail,psw);
        Assert.assertTrue(loginPage.verifySignUp());
    }
}
