import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		WebElement ele = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ele.click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		// a.accept();
		a.dismiss();
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println(text.getText());
	}
}
