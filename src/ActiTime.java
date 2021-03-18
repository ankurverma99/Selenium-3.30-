import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		/*
		 * WebElement user = driver.findElement(By.id("username"));
		 * user.sendKeys("admin");
		 * driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER); //
		 * driver.findElement(By.id("loginButton")).click();
		 */
		// driver.findElement(By.linkText("Forgot your password?")).click();
		WebElement forgot = driver.findElement(By.partialLinkText("F"));
		System.out.println(forgot.getText());
		System.out.println(forgot.isDisplayed());
		System.out.println(forgot.isEnabled());

	}

}
