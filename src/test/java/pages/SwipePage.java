package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import util.BasePage;

import java.time.Duration;
import java.util.List;

public class SwipePage extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    private WebElement swipeTxt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Or swipe vertical to find what I'm hiding.\")")
    private WebElement descText;
    @AndroidFindBy(uiAutomator = "Carousel")
    private WebElement carouselSwipe;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\")")
    private WebElement horizontalScrollView;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"card\")")
    private List<WebElement> cards;
    public Boolean verifyPage() {
        return isElementDisplayed(swipeTxt) &&
                isElementDisplayed(descText) &&
                isElementDisplayed(horizontalScrollView);
    }
    public void swipe1() {
        if (cards.size() >= 2) {
            WebElement card1 = cards.get(0);
            WebElement card2 = cards.get(1);
            doubleClick(card1);
            swipeXToY(card1, card2);
        } else {
            System.out.println("No hay suficientes cartas para realizar el desplazamiento.");
        }
    }

    public void swipeXToY(WebElement card1, WebElement card2){
        Point card1Point= getCenter(card1);
        Point card2Point= getCenter(card2);
        System.out.println(card1Point +" + "+card2Point);
        swipe(card1Point,card2Point);
    }
    public void swipe(Point startPoint, Point endPoint) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startPoint));
        touchAction.moveTo(PointOption.point(endPoint));
        touchAction.release();
        touchAction.perform();
    }
    public void doubleClick(WebElement element) {
        Point elementPoint = getCenter(element);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(elementPoint.getX(), elementPoint.getY()))
                .tap(PointOption.point(elementPoint.getX(), elementPoint.getY()))
                .perform();
    }


    public SwipePage(AndroidDriver driver) {
        super(driver);
    }


}
