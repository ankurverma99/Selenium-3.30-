package Org.TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.pom.UrbanLadderHome;

public class TestUrbanLadderHome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		UrbanLadderHome uh = new UrbanLadderHome(driver);
		uh.closeClick();
		uh.menusMouseHover(driver);
	}

}
