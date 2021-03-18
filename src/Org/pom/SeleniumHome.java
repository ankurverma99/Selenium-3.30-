package Org.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome {
	@FindBy(name = "search")
	private WebElement serch;

	public SeleniumHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendText(String text) {
		serch.sendKeys(text, Keys.ENTER);
	}

}
