package GenericUtils;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class WebDriverUtilty {
	static AndroidDriver driver;
	
	public WebDriverUtilty() {
		this.driver=driver;
	}

	 public void WaitForMilliSeconds(int a) throws InterruptedException {
	    	Thread.sleep(a);
}
	 public static void scrollDown(AndroidDriver driver) {
			Dimension Dimension = driver.manage().window().getSize();
			int scrollStart=(int) (Dimension.getHeight()*0.5);
			int scrollEnd =(int)(Dimension.getWidth()*0.2);
			TouchAction ta =new TouchAction(driver);
			ta.press(PointOption.point(0,scrollStart)).waitAction(WaitOptions.waitOptions(java.time.Duration.ofMillis(1000))).moveTo(PointOption.point(0, scrollEnd)).release().perform();
				      }
	 public void scrollToElement(AndroidDriver driver ,String an,String av) {
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
			System.out.println("scrolled to and clicked successfully on logout");
		}

	 }
