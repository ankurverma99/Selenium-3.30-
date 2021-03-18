import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeRead {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.id("loginButton"));
		String username = ReadDemo.readCellValue("Sheet1", 2, 0);
		String password = ReadDemo.readCellValue("Sheet1", 2, 1);
		System.out.println(username + "   " + password);
		user.sendKeys(username);
		pass.sendKeys(password);
		login.click();

	}

}
