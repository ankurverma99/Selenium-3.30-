package Org.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UrbanLadderHome {

	@FindBy(xpath = "//a[@class='close-reveal-modal hide-mobile']")
	private WebElement closeB;

	@FindBy(xpath = "//ul[@class='topnav bodytext']/li")
	private List<WebElement> menus;

	public UrbanLadderHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void closeClick() {
		closeB.click();
	}

	public void menusMouseHover(WebDriver driver) throws InterruptedException {
		Actions a = new Actions(driver);
		for (WebElement menu : menus) {
			a.moveToElement(menu).perform();
			Thread.sleep(2000);

		}

	}

}
