package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;

public class MessagePage {
	static AndroidDriver driver;
	/*xpath for message icon*/
	@AndroidFindBy(id= "com.snapchat.android:id/ngs_chat_icon_container")
	public MobileElement chaticon;
	
	
	/*xpath for message friendname*/
	@AndroidFindBy(xpath= "//android.view.View[@content-desc='Received']")
	public MobileElement friendname;
	
	
	/*xpath for message chattextfield*/
	@AndroidFindBy(xpath= "//android.widget.EditText[@resource-id='com.snapchat.android:id/chat_input_text_field']")
	public MobileElement chattextfield;
	
	
	
	/*xpath for message messagesentassertion*/
	@AndroidFindBy(xpath= "//javaClass[@text='hi']")
	public MobileElement messagesentassertion;
	
	
	
	/*xpath for message emoji*/
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement emojireaction;
	
	
	
	/*xpath for openContact*/
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout")
	public MobileElement opencontact;
	
	
	/*xpath for selectContact*/
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
	public MobileElement selectcontact;
	
	
	
	/*xpath for createChat*/
	@AndroidFindBy(id= "com.snapchat.android:id/create_chat_button")
	public MobileElement createChat;
	
	
	/**
	 * this method is creating chat
	 */
	
	
	public void createChat() {
		createChat.click();
		System.out.println("created chat successfully");
	}
	
	/**
	 * this method is for selecting contacts
	 */
	public void selectContact() {
		selectcontact.click();
		System.out.println("selected contact successfully");
	}
	
	
	/**
	 * this method is for opening contact
	 */
	
	
	
	public void openContact() {
		opencontact.click();
		System.out.println("tapped on opencontacticon successfully");
	}
	
	
	/**
	 * this method is for choosing emoji reaction
	 */
	
	
	
	public void clickOnEmoji() {
		emojireaction.click();
		System.out.println("tap on emoji successfully");
	}
	
	
	/**
	 * this method is for longpress
	 */
	public void longPress() {
		new Actions(driver).clickAndHold(messagesentassertion).perform();
		System.out.println("longpress successfully");
	}
	
//	public void assertions() {
//		SoftAssert sa =new SoftAssert();
//		sa.assertEquals(messagesentassertion.getText(),"hi");
//	}
	
	
	
	/**
	 * this method is for tapping on message icon
	 */
	
	public void TapOnMessageicon() {
		chaticon.click();
		System.out.println("tapped on message icon successfully");
		
		/**
		 * this method is for tapping on friendName
		 */
		
	}
//		public void TapOnFriendNAMe() {
//			friendname.click();
//		}
//		
//		
//		/**
//		 * this method is for sending message to chat text field
//		 */
		
		
		public void typeMessage() {
			chattextfield.sendKeys("hi");
			System.out.println("typed  message successfully");
		}
		
		/**
		 * this method is for pressing enter
		 */
		public void pressEnterButton(AndroidDriver driver) {
			 driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			 System.out.println("press enter successfully");
		}
		
		
		public MessagePage(AndroidDriver driver) {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			this.driver=driver;
		
	}
	}
	

