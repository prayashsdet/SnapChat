package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.LoginPage;
import com.POM.StoriesPage;

import GenericUtils.BaseClass;
import GenericUtils.WebDriverUtilty;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
@Listeners(GenericUtils.Listeners.class)
public class SnapChatStories extends BaseClass {
	@Test
	public void demo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		WebDriverUtilty wd =new WebDriverUtilty();
		LoginPage pm = new LoginPage(driver);
		StoriesPage sp =new StoriesPage(driver);
		
		
		pm.clickOnLogin();
		pm.usePhoneNumber();
		pm.enterPasswordDetails();
	    pm.clickOnLoginAgain();
	    wd.WaitForMilliSeconds(3000);
	    sp.clickonStoriesicon();
	    wd.WaitForMilliSeconds(3000);
	    wd.scrollDown(driver);
	    wd.WaitForMilliSeconds(3000);
	    sp.clickOnStory();
	    wd.WaitForMilliSeconds(3000);
	    sp.storyusername();
	    wd.WaitForMilliSeconds(3000);
	    sp.storypostedtime();
	    wd.WaitForMilliSeconds(3000);
	    sp.subscribe();
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    sp.clickOnthreedoticon();
	    sp.clickOnmanagesubscription();
	    sp.openAccount();
	    sp.assertions();
}
}
