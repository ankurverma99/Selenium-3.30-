import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.linkText("Close")).click();
		driver.findElement(By.cssSelector("a[class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		for (WebElement menuName : menus) {
			String name = menuName.getText();
			System.err.println(name);
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
			ScreenShot.takePic(driver, name);
			/*
			 * List<WebElement> subMenues = driver.findElements(
			 * By.xpath("//span[contains(.,'" + name +
			 * "')]/parent::li/descendant::ul[@class='taxonslist']/li")); for (WebElement
			 * subMenuName : subMenues) { System.out.println(subMenuName.getText()); }
			 */
		}
	}
}
