package Org.testngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

	@Parameters("browser")
	@Test
	public void TC(String bname) {
		WebDriver driver = null;
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			driver = null;
		}
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log(bname, true);
		driver.close();
	}

}
