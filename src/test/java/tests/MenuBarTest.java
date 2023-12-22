package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenuBarPage;
import pages.WebViewPage;
import util.BaseTest;

public class MenuBarTest extends BaseTest {
    MenuBarPage menuBarPage;
    @BeforeTest
    public void beforeMenuTest(){
        menuBarPage=getMenuBarPage();
    }
    @Test
    public void menuTest(){
        menuBarPage.verifyWebViewBtn();
        menuBarPage.verifyLoginBtn();
        menuBarPage.verifyFormsBtn();
        menuBarPage.verifySwipeBtn();
        menuBarPage.verifyDragBtn();
    }
}
