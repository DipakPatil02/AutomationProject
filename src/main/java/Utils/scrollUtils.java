package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import shinsaiten.utils.ThreadUtils;

public class scrollUtils {
    // Scroll down by a specified number of pixels
    public static void scrollDownByPixels(WebDriver driver, int pixels) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "window.scrollBy(0, " + pixels + ")";
        jsExecutor.executeScript(script);
        ThreadUtils.appWait(2000);
    }
    // Scroll down to the bottom of the page
    public static void scrollDownToBottom(WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        jsExecutor.executeScript(script);
    }  
    // Scroll down to a specific element
    public static void scrollDownToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollIntoView(true);";
        jsExecutor.executeScript(script, element);
    }
}