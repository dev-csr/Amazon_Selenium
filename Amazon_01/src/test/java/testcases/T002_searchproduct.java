package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.SearchPage;
import testBase.BaseClass;

public class T002_searchproduct extends BaseClass {
	@Test(groups = {"Sanity", "Master"})
	public void signin() {
	    logger.info("****** Starting T002_searchproduct *********");
	    try {
	        SearchPage sp = new SearchPage(driver);
	        sp.search(p.getProperty("searchProductName"));
	        sp.submit();

	        // Wait for the product link to be clickable, use FluentWait for more stability
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Increased timeout
	        WebElement productLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Apple iPhone 13 (128GB)')]")));
	        productLink.click();

	        sp.addToCart();
	    } catch (Exception e) {
	        Assert.fail("Test failed due to exception: " + e.getMessage());
	    }
	    logger.info("******** End of T002_searchproduct *******");
	}
}
