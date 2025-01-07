package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AddandDeleteCart;
//import PageObjects.FilltheAddress;
import PageObjects.LoginPage;
import PageObjects.SearchPage;
import testBase.BaseClass;

public class TC001_amazon extends BaseClass {
	@Test(groups={"Sanity","Master"})
	public void Amazon() {
		logger.info("*********** Starting T001_login ********");
		try {
			LoginPage lp = new LoginPage(driver);
			lp.signin_main();
			lp.setEmail(p.getProperty("email"));
			lp.clickContinue();
			lp.setPassword(p.getProperty("password"));
			lp.signin();
			SearchPage sp = new SearchPage(driver);
	        sp.search(p.getProperty("searchProductName"));
	        sp.submit();
	        sp.clickProduct();
	        sp.addToCart();
	        AddandDeleteCart ad = new AddandDeleteCart(driver);
	        ad.proceed();
	        ad.delete();
//	        FilltheAddress fa = new FilltheAddress(driver);
//	        fa.fillname(p.getProperty("Fullname"));
//	        fa.mobile(p.getProperty("mobile"));
//	        fa.pin(p.getProperty("pincode"));
//	        fa.as(p.getProperty("Address"));
//	        fa.area(p.getProperty("Area"));
//	        fa.landmark(p.getProperty("Landmark"));
//	        fa.town(p.getProperty("Town"));
//	        fa.choose(p.getProperty("State"));
//	        fa.clickAdd();
	        lp.signout();
			
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("********** End of T001_login **********");
	}
}
