package GenericUtils;




	import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.MediaEntityBuilder;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.Markup;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;
	import com.google.common.io.Files;

	public class Listeners implements ITestListener {
		WebDriver driver;
		ExtentReports reports;
		ExtentTest test;
		
		public Listeners(){
			this.driver=driver;
		}

		public void onTestStart(ITestResult result) 
		{
			test=reports.createTest(result.getMethod().getMethodName());
		}

		public void onTestSuccess(ITestResult result)
		{
		    test.log(Status.PASS, result.getMethod().getMethodName()+"is passed");	
			
		}

		public void onTestFailure(ITestResult result) {		
			
			Object obj = result.getInstance();
			test.log(Status.FAIL, result.getMethod().getMethodName()+"is failed");
			test.log(Status.FAIL,result.getThrowable());
			
			String temp= takeScreenshot(driver, "nameofscreenshot", result);
			try {
				test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
				 test.addScreenCaptureFromPath(temp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			reports.flush();
			
		}
			
			
		public static String takeScreenshot(WebDriver driver,String screenshotName,ITestResult result) {
			Object obj = result.getInstance();
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
			try {
				driver = (WebDriver)result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(obj);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String screenshotPath="./Screenshot/"+screenshotName +".PNG";
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(screenshotPath);
			try {
				Files.copy(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return screenshotPath;
	}

			

		
		
		
			
		


		public void onTestSkipped(ITestResult result) {
			test.log(Status.SKIP, result.getMethod().getMethodName()+"is skipped");
			test.log(Status.SKIP, result.getThrowable());
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			
		}

		public void onStart(ITestContext context) {
			ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReports/Reports.html");
			reporter.config().setTheme(Theme.STANDARD);
			reporter.config().setDocumentTitle("TestScript");
			reporter.config().setReportName("automation excution report");
			
			reports = new ExtentReports();
			reports.attachReporter(reporter);
			
			reports.setSystemInfo("BuildNo", "5.1");
			reports.setSystemInfo("Env", "pro");
			reports.setSystemInfo("Platform", "windows");
			reports.setSystemInfo("Browser version", "chrome-93");
			
			
		}

		public void onFinish(ITestContext context) {
			reports.flush();
			
		}

		


		

}
