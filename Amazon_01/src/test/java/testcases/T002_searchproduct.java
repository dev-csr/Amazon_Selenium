package testcases;

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
	        sp.clickProduct();
	        sp.addToCart();
	    } catch (Exception e) {
	        Assert.fail("Test failed due to exception: " + e.getMessage());
	    }
	    logger.info("******** End of T002_searchproduct *******");
	}
}
