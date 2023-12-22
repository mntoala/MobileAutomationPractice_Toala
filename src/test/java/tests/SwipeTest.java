package tests;

import org.testng.annotations.Test;
import pages.MenuBarPage;
import pages.SwipePage;
import util.BaseTest;

public class SwipeTest extends BaseTest {
    MenuBarPage menuBarPage;
    SwipePage swipePage;
    @Test
    public void swipeTest(){
        menuBarPage= getMenuBarPage();
        swipePage = menuBarPage.verifySwipeBtn();
        swipePage.swipe1();


    }
}
