package Org.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actitme {

	WebDriver driver;

	@BeforeMethod
	public void preCondition() {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("hii from before method", true);
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
		Reporter.log("hii from after method", true);

	}

	@Test
	public void Tc_01() throws InterruptedException {

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		Thread.sleep(2000);
		Reporter.log("hii from  tc1", true);

	}

	@Test
	public void Tc_02() throws InterruptedException {

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("alia");
		driver.findElement(By.name("pwd")).sendKeys("ranbir", Keys.ENTER);
		Thread.sleep(2000);
		Reporter.log("hii from  tc2", true);

	}

	@Test
	public void Tc_03() throws InterruptedException {

		WebElement user = driver.findElement(By.id("jdvjchs"));
		user.sendKeys("kunal");
		driver.findElement(By.name("pwd")).sendKeys("katrina", Keys.ENTER);
		Thread.sleep(2000);
		Reporter.log("hii from  tc3", true);

	}

}
