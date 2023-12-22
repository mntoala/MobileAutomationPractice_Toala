package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenuBarPage;
import pages.WebViewPage;
import util.BaseTest;

public class MenuBarTest extends BaseTest {
    MenuBarPage menuBarPage;

    @Test
    public void menuTest(){
        menuBarPage=getMenuBarPage();
        menuBarPage.verifyWebViewBtn();
        menuBarPage.verifyLoginBtn();
        menuBarPage.verifyFormsBtn();
        menuBarPage.verifySwipeBtn();
        menuBarPage.verifyDragBtn();
    }
}
