package com.POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import GenericUtils.FileUtility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SpotlightPage {
	FileUtility fy =new FileUtility();
	/*xpath for spotlight icon*/
@AndroidFindBy(id="com.snapchat.android:id/ngs_spotlight_icon_container")
public MobileElement spotlighticon;



/*xpath for favourite*/
@AndroidFindBy(id="com.snapchat.android:id/favorite")
public MobileElement favouriteicon;




/*xpath for name*/
@AndroidFindBy(id="com.snapchat.android:id/poster_display_name")
public MobileElement name;



/*xpath for accountavataricon*/
@AndroidFindBy(id="com.snapchat.android:id/neon_header_avatar_container")
public MobileElement openAccount;



/*xpath for spotlightfavouritepage*/
@AndroidFindBy(xpath="//javaClass[@text='My Spotlight Favourites']")
public MobileElement spotlightfavourite;



/*xpath for addedspotlight*/
@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.snapchat.android:id/thumbnail']")
public MobileElement addedspotlight;



/**
 * this method is for verifying  the saved spotlight
 */



public void verifySpotlightAdded() {
	SoftAssert s =new SoftAssert();
	s.assertEquals(true, addedspotlight.isDisplayed());
	System.out.println("verified:spotlight already added:test case passed succesfully");
}

/**
 * this method is for clicking on spottightfavouritepage
 */



public void clickOnSpotLightFavouritePage() {
	spotlightfavourite.click();
}
/**
 * this method is for opening the account details
 */



public void navigateToAccountDetailsPage() {
	openAccount.click();
}

/**
 * this method is used for assertion and printing the user name
 * @throws IOException 
 * @throws InvalidFormatException 
 * @throws EncryptedDocumentException 
 */



public void printUserName() throws EncryptedDocumentException, InvalidFormatException, IOException {
	System.out.println(name.getText());
	String text =name.getText();
	fy.writeExcelData(text);
	
}






/**
 * this method is for clicking on favourite button
 */



public void addToFavourite() {
	favouriteicon.click();
}







/**
 * this method is for clicking on spotlight icon
 */





public void clickOnSpotlightIcon() {
	spotlighticon.click();
}







public SpotlightPage(AndroidDriver driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);

}

}









