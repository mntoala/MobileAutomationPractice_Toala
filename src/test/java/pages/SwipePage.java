package pages;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import util.BasePage;

import java.time.Duration;
import java.util.List;

public class SwipePage extends BasePage {
    private static final Point swipePoint1= new Point(500, 1500);
    private static final Point swipePoint2= new Point(75, 1500);
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    private WebElement swipeTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Or swipe vertical to find what I'm hiding.\")")
    private WebElement descText;
    @AndroidFindBy(uiAutomator = "Carousel")
    private WebElement carouselSwipe;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\")")
    private WebElement horizontalScrollView;
   @AndroidFindBy(uiAutomator = "new UiSelector().description(\"card\")")
    private List <WebElement> cards;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"FULLY OPEN SOURCE\")")
    private WebElement descCard1;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"GREAT COMMUNITY\")")
    private WebElement descCard2;

    public Boolean verifyPage() {
        return isElementDisplayed(swipeTxt) &&
                isElementDisplayed(descText) &&
                isElementDisplayed(horizontalScrollView);
    }

    public void swipeRight() {
        Point[] points = swipeMethod(0.4, 0.7, 0.2);
        Point startPoint = points[0];
        Point endPoint = points[1];
        swipe(startPoint, endPoint, Duration.ofMillis(300));
        Assert.assertTrue(isElementDisplayed(descCard2));
        Assert.assertFalse(isElementDisplayed(descCard1));

    }
    public void swipeLeft() {
        Point[] points = swipeMethod(0.2, 0.7, 0.4);
        Point startPoint = points[0];
        Point endPoint = points[1];
        swipe(startPoint, endPoint, Duration.ofMillis(300));
        Assert.assertTrue(isElementDisplayed(descCard1));
        Assert.assertFalse(isElementDisplayed(descCard2));
    }

    public Point[] swipeMethod(double x1, double y, double x2) {
        int screenWidth = driver.manage().window().getSize().width;
        int screenHeight = driver.manage().window().getSize().height;
        int startX = (int) (screenWidth * x1);
        int constY = (int) (screenHeight * y);
        int endX = (int) (screenWidth * x2);
        Point startPoint = new Point(startX, constY);
        Point endPoint = new Point(endX, constY);
        return new Point[]{startPoint, endPoint};
    }
    protected void swipe(Point start, Point end, Duration duration) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(finger, 0);
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        duration = duration.dividedBy(2);
        swipe.addAction(finger.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(ImmutableList.of(swipe));
    }

    public SwipePage(AndroidDriver driver) {
        super(driver);
    }


}
