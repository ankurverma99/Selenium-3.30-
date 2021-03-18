import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		System.out.println(day.getAttribute("name"));
		System.out.println(day.getTagName());
		System.out.println(day.getCssValue("border"));
		Select s1 = new Select(day);
		s1.selectByIndex(9);
		System.out.println(s1.getFirstSelectedOption().getText());
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Sep");
		List<WebElement> months = s2.getOptions();
		for (WebElement monthval : months) {
			System.out.println(monthval.getText());
		}

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s3 = new Select(year);
		s3.selectByValue("2004");
		List<WebElement> opts = s3.getAllSelectedOptions();
		for (WebElement opt : opts) {
			System.out.println(opt.getText());
		}
		WebElement male = driver.findElement(By.xpath("//label[contains(.,'Male')]/../input"));
		male.click();
		Thread.sleep(2000);
		System.out.println(male.isSelected());
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {

				return male.isSelected();
			}
		});
		System.out.println("Hiii...");
	}

}
