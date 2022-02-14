package com.POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import GenericUtils.FileUtility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StoriesPage {
	
	
	
	
	
	FileUtility fu = new FileUtility();
	/*xpath for name of user*/
@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.snapchat.android:id/chrome_primary_text']")
public MobileElement userstoryname;



/*xpath for storypostedtime*/
@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.snapchat.android:id/chrome_primary_text']")
public MobileElement storyposttime;




/*xpath for storiesicon*/
@AndroidFindBy(id="com.snapchat.android:id/ngs_community_icon_container")
public MobileElement storyicon;



/*xpath for story*/
@AndroidFindBy(xpath="(//android.view.View[@resource-id='com.snapchat.android:id/df_large_story'])[1]")
public MobileElement story;





/*xpath for subscribe*/
@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id='com.snapchat.android:id/neon_add_friend_button_container']")
public MobileElement subscribe;



/*xpath for threedoticon*/
@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout[1]/android.widget.FrameLayout[3]/android.view.View")
public MobileElement threedoticon;



/*xpath for managesubscription*/
@AndroidFindBy(xpath="//android.widget.TextView[@text='Manage Subscriptions and Notifications']")
public MobileElement managesubscription;



/*xpath for nameofsubscribeduser*/
@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id='com.snapchat.android:id/frame']")
public MobileElement nameofsubscribeduser;



/*xpath for accountname*/
@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")
public MobileElement accountName;



/**
 * this method is for clicking on stories
 */
public void clickOnStory() {
	story.click();
	System.out.println("clicked on story successfully");
}

/**
 * this method is for clicking on stories icon
 */
public void clickonStoriesicon() {
	storyicon.click();
	System.out.println("clicked on storyicon succesfully");
	
}


/**
 * this method is for printitng text of user
 * @throws IOException 
 * @throws InvalidFormatException 
 * @throws EncryptedDocumentException 
 */

public void storyusername() throws IOException, EncryptedDocumentException, InvalidFormatException {
	System.out.println("name of user ");
    String text=userstoryname.getText();
    System.out.println(text);
	System.out.println("name of user printed succesfully");
	

	
	fu.writeExcelData(text);
}


	
	
	
	
	
/**
 * this method is for before how many hour story was posted
 */
	
	
	public void storypostedtime() {
		System.out.println("time of story");
		System.out.println(storyposttime.getText());
		System.out.println("time of story posted successfully");
	}
		
		
		/**
		 * this method is for subscribing to story user
		 */
		
		
		public void subscribe() {
			subscribe.click();
			System.out.println("clicked on subscribe button successfully");
		}
			
			
			
			/**
			 * this method is for clicking on threedoticon
			 */
		
			
			
			public void clickOnthreedoticon() {
				threedoticon.click();
				System.out.println("clicked on threedoticon button successfully");
			}
			
			
			
			/**
			 * this method is for clicking on manage subscriptions
			 */
			
			
			
			public void clickOnmanagesubscription() {
				managesubscription.click();
				System.out.println("clicked on managesubscription button successfully");
			}
			
			
			
			/**
			 * this method is for clicking on nameOfTheSubscribedPerson
			 */
			
			
			public void openAccount() {
				nameofsubscribeduser.click();
				System.out.println("account opened successfully");
			}
			
			
			
			/**
			 * this method is for assertion
			 * @throws IOException 
			 * @throws InvalidFormatException 
			 * @throws EncryptedDocumentException 
			 */
		
			
			
			public void assertions() throws EncryptedDocumentException, InvalidFormatException, IOException {
					
				 String text=accountName.getText();
				 SoftAssert sf =new SoftAssert();
				 sf.assertEquals(fu.getExcelData("Sheet1", 0, 0), text);
				 System.out.println("assertion successful");
				 sf.assertAll();
			}
			
			public StoriesPage(AndroidDriver driver) {
				PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			
		}
}

	






