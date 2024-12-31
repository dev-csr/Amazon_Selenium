package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.BasePage;

public class FilltheAddress extends BasePage {
	private Actions action;
	
	public FilltheAddress(WebDriver driver) {
		super(driver);
        action = new Actions(driver);
	}
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']") WebElement fullName;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']") WebElement mobileNumber;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']") WebElement pincode;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']") WebElement address;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']") WebElement area;
	@FindBy(xpath="//input[@id='address-ui-widgets-landmark']") WebElement landmark;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']") WebElement town;
	@FindBy(xpath="//span[@id='address-ui-widgets-enterAddressStateOrRegion']//span[@class='a-button-text a-declarative']") WebElement chooseAState;
	@FindBy(xpath="//span[contains(text(),'Use this address')]") WebElement useThisAddress;
	public void fillname(String name) {
		fullName.sendKeys(name);
	}
	public void mobile(String num) {
		mobileNumber.sendKeys(num);
	}
	public void pin(String pin) {
		pincode.sendKeys(pin);
	}
	public void as(String add) {
		address.sendKeys(add);
	}
	public void area(String ar) {
		area.sendKeys(ar);
	}
	public void landmark(String lm) {
		landmark.sendKeys(lm);
	}
	public void town(String tn) {
		town.sendKeys(tn);
	}
	public void choose(String cas) {
		Select dropdown = new Select(chooseAState);
		dropdown.selectByVisibleText(cas);
	}
	public void clickAdd() {
		action.moveToElement(useThisAddress).click().perform();
	}

}
