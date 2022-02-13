package TestScripts;

import org.testng.annotations.Test;

import com.POM.LoginPage;

import GenericUtils.BaseClass;
import GenericUtils.WebDriverUtilty;

public class SnapChat  extends BaseClass{
@Test
public void demo() throws InterruptedException {
	
	LoginPage pm = new LoginPage(driver);
	WebDriverUtilty wd =new WebDriverUtilty();
	pm.clickOnLogin();
	pm.usePhoneNumber();
	pm.enterPasswordDetails();
    pm.clickOnLoginAgain();
  
	
}
}
