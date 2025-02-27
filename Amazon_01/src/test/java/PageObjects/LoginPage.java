package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class LoginPage extends BasePage {
	private Actions action;
	public LoginPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	@FindBy(xpath="//a[@id='nav-link-accountList']") WebElement Click;
	@FindBy(xpath="//input[@id='ap_email']") WebElement txtEmail;
	@FindBy(xpath="//input[@id='continue']") WebElement clickContinue;
	@FindBy(xpath="//input[@id='ap_password']") WebElement amazonPassword;
	@FindBy(xpath="//input[@id='signInSubmit']") WebElement amazonSignin;
	@FindBy(xpath="//span[normalize-space()='Sign Out']") WebElement signOut;
	
	public void signin_main() {
		Click.click();
	}
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void clickContinue() {
		clickContinue.click();
	}
	public void setPassword(String pass) {
		amazonPassword.sendKeys(pass);
	}
	public void signin() {
		amazonSignin.click();
	}
	public void signout() {
		action.moveToElement(Click).perform();;
		signOut.click();
	}

}
