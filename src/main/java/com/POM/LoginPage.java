package com.POM;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	/*xpath for login button*/
@AndroidFindBy(id="com.snapchat.android:id/login_button_horizontal")
public MobileElement loginbutton;

/*xpath for password text field*/
@AndroidFindBy(id="com.snapchat.android:id/password_field")
public MobileElement passwordtextfield ;


/*xpath for usephoneNumber*/
@AndroidFindBy(id="com.snapchat.android:id/use_phone_instead")
public MobileElement clickphonenumbertextfield ;


/*xpath for phonEnumner*/
@AndroidFindBy(id="com.snapchat.android:id/password_field")
public MobileElement phonenumbertextfield ;


/*xpath for loginbutton2*/
@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.snapchat.android:id/button_text']")
public MobileElement loginbuttonagain ;


/*xpath for otplogin*/
@AndroidFindBy(id= "com.snapchat.android:id/forgot_password_button")
public MobileElement otplogin ;



/*xpath for openAccount*/
@AndroidFindBy(id= "com.snapchat.android:id/avatar_silhouette_3")
public MobileElement GoAccountbutton;



/*xpath for Settings*/
@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.View")
public MobileElement SettingsButton;



/**
 * this is for opening settings button
 */



public void tapOnSettingsIcon() {
	SettingsButton.click();
	System.out.println("tapped on settings icon successfully");
}
 
/**
 * this method is for opening account
 */


public void tapOnOpenAccountButton() {
	GoAccountbutton.click();
	System.out.println("open account successfully");
}
/**
 * this method is for clicking on login button
 * @param driver
 */


public void clickOnLogin() {
	loginbutton.click();
	System.out.println("clicked on login button successfully");
	
}

/**
 * this method is for password 
 * @param driver
 */


/**
 * this method is for clicking on usephonenumber
 */
public void usePhoneNumber() {
	clickphonenumbertextfield.click();
	System.out.println("changed to login as phonenumber");
}



public void enterPasswordDetails() {
	passwordtextfield.sendKeys("ABCDEFGH");
	System.out.println("enter password details successfully");
}


/**
 * this method is for entering values into the password text field
 * @param driver
 */

public void entermobileNumber() {
	phonenumbertextfield.clear();
	phonenumbertextfield.sendKeys("7008405914");
	System.out.println("number typed successfully");
}
/**
 * this method is for clicking on login after entering username and password
 */

public void clickOnLoginAgain() {
	loginbuttonagain.click();
	System.out.println("clicked on login button succesfully:welcome to snapchat");
}

/**
 * this method is for clicking on login after getting otp
 * @param driver
 */


public void clicOnOtp() {
	otplogin.click();
	System.out.println("cliked on login succcessfully");
	
}







public LoginPage(AndroidDriver driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
}
