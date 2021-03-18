import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumH {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("java", Keys.ENTER);
		driver.navigate().back();
		search.sendKeys("testng", Keys.ENTER);
	}

}
