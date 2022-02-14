package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.POM.LoginPage;
import com.POM.MessagePage;

import GenericUtils.BaseClass;
import GenericUtils.WebDriverUtilty;

public class Message extends BaseClass {
	@Test
	public void demo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		WebDriverUtilty wd =new WebDriverUtilty();
		LoginPage pm = new LoginPage(driver);
		MessagePage m = new MessagePage(driver);
		pm.clickOnLogin();
		pm.usePhoneNumber();
		pm.enterPasswordDetails();
	    pm.clickOnLoginAgain();
	    wd.WaitForMilliSeconds(6000);
	    m.TapOnMessageicon();
	    wd.WaitForMilliSeconds(3000);
	    m.openContact();
	    m.selectContact();
	    m.createChat();
	    m.typeMessage();
	    m.pressEnterButton(driver);
	   // m.assertions();
	    m.longPress();
	    wd.WaitForMilliSeconds(3000);
	    m.clickOnEmoji();
		
}
}
