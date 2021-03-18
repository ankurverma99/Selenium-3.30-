import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTIme2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		WebElement logOut = driver.findElement(By.id("logoutLink"));
		WebDriverWait ww = new WebDriverWait(driver, 10);
		// ww.until(ExpectedConditions.titleContains("Alia"));
		ww.until(ExpectedConditions.elementToBeClickable(logOut));
		logOut.click();
	}

}
