import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/WebDriverWait%20Examples/ButtonClick.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait ww = new WebDriverWait(driver, 10);
		WebElement ele = driver.findElement(By.id("otherBtn"));
		ww.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		ww.until(ExpectedConditions.elementToBeClickable(By.id("sBtn")));
		driver.findElement(By.id("sBtn")).click();
	}

}
