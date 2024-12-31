package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class AddandDeleteCart extends BasePage {
	public AddandDeleteCart(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']") WebElement cart;
	@FindBy(xpath="//span[@data-action='delete']") WebElement delete;
	public void proceed() {
		cart.click();
	}
	public void delete() {
		delete.click();
	}
}
