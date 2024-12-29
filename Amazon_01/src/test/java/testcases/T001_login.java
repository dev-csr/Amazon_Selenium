package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.LoginPage;
import testBase.BaseClass;


public class T001_login extends BaseClass{
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		logger.info("*********** Starting T001_login ********");
		try {
			LoginPage lp = new LoginPage(driver);
			lp.signin_main();
			lp.setEmail(p.getProperty("email"));
			lp.clickContinue();
			lp.setPassword(p.getProperty("password"));
			lp.signin();
			
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("********** End of T001_login **********");
	}
}
