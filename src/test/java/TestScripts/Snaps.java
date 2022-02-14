package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.POM.LoginPage;
import com.POM.SnapsPage;

import GenericUtils.BaseClass;
import GenericUtils.WebDriverUtilty;

public class Snaps extends BaseClass {
	@Test
	public void demo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		WebDriverUtilty wd =new WebDriverUtilty();
		LoginPage pm = new LoginPage(driver);
		SnapsPage sps =new SnapsPage(driver);
		pm.clickOnLogin();
		pm.usePhoneNumber();
		pm.enterPasswordDetails();
	    pm.clickOnLoginAgain();
	    wd.WaitForMilliSeconds(6000);
	    sps.tapOnFlipCameraButon();
	   sps.tapOnCameraButton();
	   sps.tapOnAllowButton();
	    sps.tapOnAddToStorybutton();
	    sps.tapOnDialogBox();
	    sps.addedToStory();
	    sps.tapOnGotoStory();
	    sps.checkIfStoryDisplayed();
		
		
}
}
