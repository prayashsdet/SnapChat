package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.POM.LoginPage;
import com.POM.SpotlightPage;
import com.POM.StoriesPage;

import GenericUtils.BaseClass;
import GenericUtils.WebDriverUtilty;

public class SnapChatSpotlight  extends BaseClass{
	@Test
	public void demo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		WebDriverUtilty wd =new WebDriverUtilty();
		LoginPage pm = new LoginPage(driver);
		SpotlightPage sp =new SpotlightPage(driver);
		pm.clickOnLogin();
		pm.usePhoneNumber();
		pm.enterPasswordDetails();
	    pm.clickOnLoginAgain();
	    wd.WaitForMilliSeconds(3000);
		sp.clickOnSpotlightIcon();
		sp.addToFavourite();
		sp.printUserName();
		sp.navigateToAccountDetailsPage();
		sp.clickOnSpotLightFavouritePage();
		sp.verifySpotlightAdded();
}
}
