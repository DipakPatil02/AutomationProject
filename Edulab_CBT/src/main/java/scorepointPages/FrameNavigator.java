package scorepointPages;
import webHandler.*;
public class FrameNavigator {
	public static void navigateToMainFrame() {	
		WebHandler.driver.switchTo().parentFrame();
		WebHandler.driver.switchTo().frame("main");	
	}
	public static void navigateToHeaderFrame() {
		WebHandler.driver.switchTo().parentFrame();
		WebHandler.driver.switchTo().frame("header");
	}
	public static void navigateToFooterFrame() {
		WebHandler.driver.switchTo().parentFrame();
		WebHandler.driver.switchTo().frame("footer");
	}
}
