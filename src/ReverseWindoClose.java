import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseWindoClose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.getClass());
		ArrayList<String> al = new ArrayList<>(wins);
		for (int i = al.size() - 1; i >= 0; i--) {
			driver.switchTo().window(al.get(i));
			driver.close();
			Thread.sleep(2000);
		}
	}
}
