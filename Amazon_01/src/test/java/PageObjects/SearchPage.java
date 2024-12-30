package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import testBase.BasePage;

public class SearchPage extends BasePage {
	private Actions action;
	public SearchPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement searchAmazon;
	@FindBy(xpath="//input[@id='nav-search-submit-button']") WebElement go;
	@FindBy(xpath="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']") WebElement iphone;
	@FindBy(xpath="//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']") WebElement addToCart;
	public void search(String product) {
		searchAmazon.sendKeys(product);
	}
	public void submit() {
		go.submit();
	}
	public void clickProduct() {
		action.moveToElement(iphone).click().perform();
	}
	public void addToCart() {
		addToCart.click();
	}
}
