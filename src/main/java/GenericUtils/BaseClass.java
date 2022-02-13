package GenericUtils;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver driver;
	@BeforeMethod
	public void openApp() throws Throwable {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("appPackage", "com.snapchat.android");
		dc.setCapability("appActivity", ".LandingPageActivity");
		dc.setCapability("autoGrantPermissions", true);
		URL url=new URL(" http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url, dc);
		
}
}