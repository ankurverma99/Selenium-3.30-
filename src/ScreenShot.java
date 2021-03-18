import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void takePic(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrennshot = ts.getScreenshotAs(OutputType.FILE);
		File screenShotSave = new File("./screenShot/" + name + ".png");
		Files.copy(scrennshot, screenShotSave);

	}

}
