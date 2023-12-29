package scorepointPages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webHandler.*;

public class Wait {
	public static void Explicitwait(int arg1, By element)  {
		WebDriverWait wait = new WebDriverWait(WebHandler.driver, Duration.ofSeconds(arg1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
}
