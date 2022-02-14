package com.POM;

import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SnapsPage {
	/*xpath for camerabutton*/
	@AndroidFindBy(id="com.snapchat.android:id/camera_capture_button")
	public MobileElement cameraButton;
	
	
	/*xpath for flipbutton*/
	@AndroidFindBy(id="com.snapchat.android:id/camera_flip_button")
	public MobileElement flipButton;
	
	
	/*xpath for addtostory*/
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
	public MobileElement addtostorybutton;
	
	
	
	/*xpath for dialogbox*/
	@AndroidFindBy(id="com.snapchat.android:id/button_text")
	public MobileElement dialogbox;
	
	
	
	/*xpath for notification*/
	@AndroidFindBy(id="com.snapchat.android:id/notification_content")
	public MobileElement notification;
	
	
	
	/*xpath for storyavatar*/
	@AndroidFindBy(id= "com.snapchat.android:id/avatar_story")
	public MobileElement goToStory;
    
	
	
	/*xpath for verifystoryisaddded*/
	@AndroidFindBy(id= "com.snapchat.android:id/image_thumbnail")
	public MobileElement verifystoryadded;
	
	
	
	/*xpath for allowlocationbutton*/
	@AndroidFindBy(xpath= "//android.widget.TextView[@resource-id='com.snapchat.android:id/button_text']")
	public MobileElement allow;
	
	
	
	/**
	 * this method is for clicking on allow buttom
	 */
	
	
	
	public void tapOnAllowButton() {
		allow.click();
	}
	
	/**
	 * this method is for verifying whether story added or not
	 */
	
	
	
	public void checkIfStoryDisplayed() {
		SoftAssert s =new SoftAssert();
		s.assertEquals(true, verifystoryadded.isDisplayed());
		System.out.println("verified story added to my story successfuly");
	}
	
	
	
	/**
	 * this method is for clicking on goToStory
	 */
	
	
	
	public void tapOnGotoStory() {
		goToStory.click();
	System.out.println("tapped on go to story successfully");
	}
	
	
	
	/**
	 * this method is for checking story is added or not
	 */
	
	
	
	public void addedToStory() {
		SoftAssert s =new SoftAssert();
		s.assertEquals(true, notification.isDisplayed());
		System.out.println("added to story notification sucessfully displayed");
	}
	/**
	 * this method is for clicking on dialogbox
	 */
	
	
	
	public void tapOnDialogBox() {
		dialogbox.click();
		System.out.println("tapped on dialogbox successfully");
	}
	
	
	
	/**
	 * this method is for clicking on add to story
	 */
	
	
	
	public void tapOnAddToStorybutton() {
		addtostorybutton.click();
		System.out.println("tapped on add to story button successfully");
	}
	
	


	
	/**
	 * this method is for clicking on camera button
	 */
	
	
	
	public void tapOnCameraButton()
	{
		cameraButton.click();
		System.out.println("tapped on camera button successfully");
	}
	
	
	/**
	 * this method is for tapping on flip button
	 */
	
	
	
	public void tapOnFlipCameraButon() {

	
	}
	
	
	public SnapsPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
}
	
	
	

}
