import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.getClass());
		String parentwin = driver.getWindowHandle();
		System.out.println(parentwin);
		// wins.remove(parentwin);
		for (String win : wins) {
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
			Thread.sleep(2000);
		}
	}

}
