package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement searchAmazon;
	@FindBy(xpath="//input[@id='nav-search-submit-button']") WebElement go;
	@FindBy(xpath="//div[@id='88b69834-1258-4911-bb65-4b517447bc42']//div[@class='a-section a-spacing-small a-spacing-top-small puis-padding-right-small']//span[1]//a[1]") WebElement iphone;
	@FindBy(xpath="//input[@id='add-to-cart-button']") WebElement addToCart;
	
	public void search(String product) {
		searchAmazon.sendKeys(product);
	}
	public void submit() {
		go.submit();
	}
	public void clickProduct() {
		iphone.click();
	}
	public void addToCart() {
		addToCart.click();
	}
}
