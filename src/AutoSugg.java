import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java");
		Point p = search.getLocation();
		System.out.println(p);
		int x = p.getX();
		int y = p.getY();
		System.out.println(x + "     " + y);
		Thread.sleep(1000);
		List<WebElement> suggs = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for (WebElement sugg : suggs) {
			System.out.println(sugg.getText());
		}
		suggs.get(2).click();
	}

}
