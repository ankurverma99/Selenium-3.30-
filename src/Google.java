import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Google {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrennshot = ts.getScreenshotAs(OutputType.FILE);
		File screenShotSave = new File("./screenShot/google.png");
		Files.copy(scrennshot, screenShotSave);
		WebElement alia = driver.findElement(By.name("q"));
		alia.sendKeys("java", Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//span[text()='View all']/parent::div"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
}
