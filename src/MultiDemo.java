import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/multi.html");
		WebElement ele = driver.findElement(By.id("b"));
		Select s = new Select(ele);
		if (s.isMultiple()) {
			List<WebElement> vals = s.getOptions();
			// s.selectByVisibleText(vals.get(1).getText());
			// s.selectByVisibleText(vals.get(3).getText());

			for (WebElement val : vals) {
				System.out.println(val.getText());
				s.selectByVisibleText(val.getText());
				Thread.sleep(1000);
			}
			System.out.println("========================");
			System.out.println("opt:" + s.getFirstSelectedOption().getText());
			System.out.println("========================");
			List<WebElement> opts = s.getAllSelectedOptions();
			for (WebElement opt : opts) {
				System.out.println(opt.getText());
			}
			s.deselectByIndex(1);
			Thread.sleep(1000);
			s.deselectByVisibleText("324");
			Thread.sleep(1000);
			s.deselectByValue("323");
			// s.deselectAll();

		}
	}

}
