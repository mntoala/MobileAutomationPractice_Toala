package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MenuBarPage;
import pages.SwipePage;
import util.BaseTest;

public class SwipeTest extends BaseTest {
    MenuBarPage menuBarPage;
    SwipePage swipePage;
    @BeforeTest()
    public void beforeSwipe(){
        menuBarPage= getMenuBarPage();
        swipePage = menuBarPage.verifySwipeBtn();
    }

    @Test
    public void swipeTest(){
        swipePage.swipeRight();
        swipePage.swipeLeft();
    }
}
